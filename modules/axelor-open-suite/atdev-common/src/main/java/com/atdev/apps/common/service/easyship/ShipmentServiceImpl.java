package com.atdev.apps.common.service.easyship;

import com.atdev.apps.common.service.GlobalConnectionApi;
import com.atdev.apps.common.service.easyship.pojo.Item;
import com.atdev.apps.common.service.easyship.pojo.Shipment;
import com.atdev.apps.common.service.easyship.pojo.Shipment_;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ShipmentServiceImpl implements ShipmentService {

  private static String easyshipAuthToken = null;
  private static String easyshipBaseURL = null;

  public static WebTarget clientConfig(Client client) throws IOException {

    easyshipAuthToken = GlobalConnectionApi.getApplicationProperty("easyship_auth_token");
    easyshipBaseURL = GlobalConnectionApi.getApplicationProperty("easyship_base_url");

    WebTarget webTarget = client.target(easyshipBaseURL);

    return webTarget;
  }

  @Override
  public List<Shipment_> getAllShipments() throws IOException {
    // TODO Auto-generated method stub
    Client client = ClientBuilder.newClient();

    WebTarget webTarget = clientConfig(client);
    WebTarget shipmentWebTarget = webTarget.path("/shipments");
    Invocation.Builder invocationBuilder =
        shipmentWebTarget
            .request(MediaType.APPLICATION_JSON)
            .header("Authorization", easyshipAuthToken);

    Response response = invocationBuilder.get();
    List<Shipment_> shipment_ = null;
    if (response.getStatus() == 200) {
      Shipment shipment = response.readEntity(Shipment.class);
      shipment_ = shipment.getShipments();
      //			for (Shipment_ shipment_2 : shipment_) {
      //				System.out.println(shipment_2.getEasyshipShipmentId());
      //			}
    }
    client.close();
    return shipment_;
  }

  @Override
  public Shipment_ getShipment(String easyshipShipmentID) throws IOException {
    // TODO Auto-generated method stub
    // easyshipShipmentID :ESIN21395342
    Client client = ClientBuilder.newClient();

    WebTarget webTarget = clientConfig(client);
    WebTarget shipmentWebTarget = webTarget.path("/shipments/" + easyshipShipmentID);
    Invocation.Builder invocationBuilder =
        shipmentWebTarget
            .request(MediaType.APPLICATION_JSON)
            .header("Authorization", easyshipAuthToken);

    Response response = invocationBuilder.get();
    Shipment_ shipment_ = null;
    if (response.getStatus() == 200) {
      Shipment shipment = response.readEntity(Shipment.class);
      shipment_ = shipment.getShipment();
      //			System.out.println(shipment_.getEasyshipShipmentId());
    }

    client.close();
    return shipment_;
  }

  public static void createShipment() {
    Shipment_ shipment_ = new Shipment_();
    shipment_.setPlatformName("Amazon");
    shipment_.setPlatformOrderNumber("#1234");
    shipment_.setDestinationCountryAlpha2("US");
    shipment_.setDestinationCity("New York");
    shipment_.setDestinationPostalCode("10022");
    shipment_.setDeliveryState("NY");
    shipment_.setDestinationName("Aloha Chen");
    shipment_.setDestinationAddressLine1("MG road");
    shipment_.setDestinationAddressLine2("JM road");
    shipment_.setDestinationCountryAlpha2("US");
    shipment_.setDestinationPhoneNumber("+1 234-567-890");
    shipment_.setDestinationEmailAddress("api-support@easyship.com");
    Item item = new Item();
    item.setDescription("jayesh");
    item.setSku("abcsku");
    item.setActualWeight(10.0);
    item.setHeight(3.2);
    item.setWidth(1.3);
    item.setLength(1.2);
    item.setCategory("fashion");
    item.setDeclaredCurrency("SGD");
    item.setDeclaredCustomsValue(100.0);
    List<Item> items = new ArrayList<Item>();
    items.add(item);
    shipment_.setItems(items);

    Client client = ClientBuilder.newClient();

    WebTarget webTarget = client.target("https://api.easyship.com/shipment/v1");
    WebTarget shipmentWebTarget = webTarget.path("/shipments");
    Invocation.Builder invocationBuilder =
        shipmentWebTarget
            .request(MediaType.APPLICATION_JSON)
            .header("Authorization", "Bearer prod_gfwhkBk9fqS+hblzH8IryB9zeXmCiYjn0zqemaY8QFI=");
    Response response =
        invocationBuilder.post(
            Entity.entity(shipment_, MediaType.APPLICATION_JSON), Response.class);
    String body = response.readEntity(String.class);
    System.out.println(body);
  }
}
