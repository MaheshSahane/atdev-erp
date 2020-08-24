package com.atdev.apps.common.service.SimpleLegal;

import com.atdev.apps.common.service.GlobalConnectionApi;
import com.atdev.apps.common.service.SimpleLegal.pojo.*;
import com.atdev.apps.common.service.SimpleLegal.pojo.user.SimpleLegalUser;
import com.axelor.apps.account.db.Invoice;
import com.axelor.apps.account.db.repo.InvoiceRepository;
import com.axelor.apps.base.db.Company;
import com.axelor.apps.base.db.Currency;
import com.axelor.apps.base.db.Partner;
import com.axelor.apps.common.db.NewInvoice;
import com.axelor.apps.common.db.repo.NewInvoiceRepository;
import com.axelor.auth.db.User;
import com.google.inject.persist.Transactional;
import java.io.IOException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class SimpleLegalServiceImpl implements SimpleLegalService {

  private static String SimpleLeagalBaseURi = null;
  private static String SimpleLeagalAuth = null;

  public static WebTarget clientConfig(Client client) throws IOException {

    SimpleLeagalBaseURi = GlobalConnectionApi.getApplicationProperty("SimpleLeagalBaseURi");
    SimpleLeagalAuth = GlobalConnectionApi.getApplicationProperty("SimpleLeagalAuth");

    WebTarget webTarget = client.target(SimpleLeagalBaseURi);

    return webTarget;
  }

  @Override
  public InvoiceSimpleLegal GetAllInvoice() throws IOException {
    Client client = ClientBuilder.newClient();

    WebTarget webTarget = clientConfig(client);
    WebTarget simpleLegalWebTarget = webTarget.path("/invoices/");
    Invocation.Builder invocationBuilder =
        simpleLegalWebTarget
            .request(MediaType.APPLICATION_JSON)
            .header("Authorization", SimpleLeagalAuth);

    Response response = invocationBuilder.get();
    InvoiceSimpleLegal invoice = null;
    if (response.getStatus() == 200) {
      invoice = response.readEntity(InvoiceSimpleLegal.class);
    }

    client.close();
    return invoice;
  }

  @Override
  @Transactional
  public Result GetInvoice(String InvId) throws IOException {
    Client client = ClientBuilder.newClient();

    WebTarget webTarget = clientConfig(client);
    WebTarget shipmentWebTarget =
        webTarget.path("/invoices/inv_ce8b3b1262bb563e8099f506a3ec6cd41c642a6d/");
    Invocation.Builder invocationBuilder =
        shipmentWebTarget
            .request(MediaType.APPLICATION_JSON)
            .header("Authorization", SimpleLeagalAuth);
    Response response = invocationBuilder.get();
    Result invoice = null;
    if (response.getStatus() == 200) {
      invoice = response.readEntity(Result.class);
    }

    client.close();
    System.out.println("ServiceID" + invoice.getId());
    System.out.println(
        "------------------------------------------------------+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    //	Configuration cfg = new Configuration();
    NewInvoiceRepository invoiceRepo = new NewInvoiceRepository();
    NewInvoice newinvoice = new NewInvoice();
    newinvoice.setInvoice_id(invoice.getId());
    newinvoice.setVendor_id(invoice.getVendorId());
    newinvoice.setMatter(invoice.getCurrency());
    newinvoice.setNative_amount(invoice.getInvoiceNumber());
    newinvoice.setPercentage(invoice.getInvoiceDate());

    invoiceRepo.save(newinvoice);

    return invoice;
  }

  @Override
  public void createPayment() throws IOException {

    Payment payment = new Payment();

    payment.setId("pmt_310c712d791021f7b243ac9633b3aefa13ebbddb");
    payment.setPaymentMethod("check");
    payment.setReferenceNumber("85858");
    payment.setAmount(32544.55);
    payment.setCurrency("USD");
    payment.setMemo("payment Sucess");
    payment.setBatch(null);
    payment.setPaymentDate("2017-06-01");
    payment.setCreatedDate("2017-12-02T17:00:11.828946");
    payment.setModifiedDate("2017-12-02T17:00:11.828953");

    Client client = ClientBuilder.newClient();

    WebTarget webTarget = clientConfig(client);
    WebTarget paymentTarget =
        webTarget.path("/invoices/inv_19abed87732bf08e56c01e531d2ba1459f7aa078/payments/");
    Invocation.Builder invocationBuilder =
        paymentTarget.request(MediaType.APPLICATION_JSON).header("Authorization", SimpleLeagalAuth);
    Response response =
        invocationBuilder.post(Entity.entity(payment, MediaType.APPLICATION_JSON), Response.class);
    String body = response.readEntity(String.class);
    System.out.println(body);
  }

  @Override
  @Transactional
  public Result GetInvoiceMapAxelor(String InvID) throws IOException {
    Client client = ClientBuilder.newClient();

    WebTarget webTarget = clientConfig(client);
    WebTarget shipmentWebTarget =
        webTarget.path("/invoices/inv_ce8b3b1262bb563e8099f506a3ec6cd41c642a6d/");
    Invocation.Builder invocationBuilder =
        shipmentWebTarget
            .request(MediaType.APPLICATION_JSON)
            .header("Authorization", SimpleLeagalAuth);
    Response response = invocationBuilder.get();
    Result invoice = null;
    if (response.getStatus() == 200) {
      invoice = response.readEntity(Result.class);
    }

    client.close();
    System.out.println("ServiceID" + invoice.getId());
    System.out.println(
        "------------------------------------------------------+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    Invoice axelorInvoie = new Invoice();
    Company comp = new Company();
    Currency curr = new Currency();
    Partner p = new Partner();

    Long iid = Long.valueOf(1);
    Long Currid = Long.valueOf(148);
    Long Pid = Long.valueOf(30);

    comp.setId(iid);
    curr.setId(Currid);

    //	p.setFirstName("TNT");
    // comp.setId(5);
    /// comp.setCode("ATDEV");
    //	comp.setName("Atdev");
    // curr.setCode("AED");
    // curr.setName("United Arab Emirates dirham");

    axelorInvoie.setOperationSubTypeSelect(1);
    axelorInvoie.setOperationTypeSelect(1);
    axelorInvoie.setCompany(comp);
    axelorInvoie.setCurrency(curr);
    axelorInvoie.setPartner(p);

    axelorInvoie.setPartnerTaxNbr(invoice.getVendorId());
    axelorInvoie.setSupplierInvoiceNb(invoice.getInvoiceNumber());
    axelorInvoie.setInvoiceId(invoice.getVendor());
    axelorInvoie.setHeadOfficeAddress(invoice.getApiUrl());
    System.out.println("Befor Save ************************************************");

    InvoiceRepository accrepo = new InvoiceRepository();
    System.out.println("Befor Save ************************************************");

    accrepo.save(axelorInvoie);

    System.out.println("After Save ************************************************");

    return null;
  }

@Override
public void addUser(User obj) throws IOException {
	
	
	com.atdev.apps.common.service.SimpleLegal.pojo.user.Result user=new com.atdev.apps.common.service.SimpleLegal.pojo.user.Result();
	user.setFirstName(obj.getName());
	user.setLastName(obj.getFullName());	
	user.setEmail(obj.getEmail());
		
	 
	    Client client = ClientBuilder.newClient();

	    WebTarget webTarget = clientConfig(client);
	    WebTarget paymentTarget =
	     webTarget.path("/users/");
	    Invocation.Builder invocationBuilder =
	        paymentTarget.request(MediaType.APPLICATION_JSON).header("Authorization", SimpleLeagalAuth);
	    Response response =
	        invocationBuilder.post(Entity.entity(user, MediaType.APPLICATION_JSON), Response.class);
	    String body = response.readEntity(String.class);
	    System.out.println(body);
	
}

@Override
public SimpleLegalUser viewUser() throws IOException {
	
	 Client client = ClientBuilder.newClient();

	    WebTarget webTarget = clientConfig(client);
	    WebTarget simpleLegalWebTarget = webTarget.path("/users/");
	    Invocation.Builder invocationBuilder =
	        simpleLegalWebTarget
	            .request(MediaType.APPLICATION_JSON)
	            .header("Authorization", SimpleLeagalAuth);

	    Response response = invocationBuilder.get();
	    SimpleLegalUser users = null;
	    if (response.getStatus() == 200) {
	    	users = response.readEntity(SimpleLegalUser.class);
	    }

	    client.close();
	    return users;
}
}
