package com.atdev.apps.common.service.easyship;

import com.atdev.apps.common.service.easyship.pojo.Shipment_;
import java.io.IOException;
import java.util.List;

public interface ShipmentService {

  public List<Shipment_> getAllShipments() throws IOException;

  public Shipment_ getShipment(String easyshipShipmentID) throws IOException;
}
