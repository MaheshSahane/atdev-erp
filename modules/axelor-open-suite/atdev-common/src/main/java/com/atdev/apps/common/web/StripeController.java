package com.atdev.apps.common.web;

import java.io.IOException;

import com.atdev.apps.common.service.Stripe.StripeService;
import com.axelor.apps.base.db.Partner;
//import com.atdev.apps.common.service.Stripe.*;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.CustomerCollection;


public class StripeController {
	public void getAllCust(ActionRequest request, ActionResponse response) throws IOException, StripeException {
		StripeService strip = Beans.get(StripeService.class);

		CustomerCollection Cust=strip.getCustomer();
		System.out.println(Cust.getData());
		response.setData(Cust.getData());
}

	
	
	public void AddCust(ActionRequest request, ActionResponse response) throws IOException, StripeException {
		StripeService strip = Beans.get(StripeService.class);

		Partner PartnerfromReq = request.getContext().asType(Partner.class);

		
		
		strip.addCustomer(PartnerfromReq);
	
}



}
