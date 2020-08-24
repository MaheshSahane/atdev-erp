package com.atdev.apps.common.web;

import java.io.IOException;
import java.util.List;

import com.atdev.apps.common.service.easyship.ShipmentService;
import com.atdev.apps.common.service.easyship.pojo.Shipment_;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;

public class EasyShipController {

	public void getShipments(ActionRequest request,ActionResponse response) throws IOException{
		ShipmentService shipmentService = Beans.get(ShipmentService.class);

		List<Shipment_> shipments = shipmentService.getAllShipments();
		response.setData(shipments);
		}
	
	
	
}
