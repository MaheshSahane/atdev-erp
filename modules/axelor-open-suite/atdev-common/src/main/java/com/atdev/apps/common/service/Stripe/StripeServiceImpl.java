package com.atdev.apps.common.service.Stripe;

import java.io.IOException;
import java.util.*;

import com.atdev.apps.common.service.GlobalConnectionApi;
import com.axelor.apps.base.db.Partner;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.CustomerCollection;

public class StripeServiceImpl implements StripeService {

public static String getStripKey() throws IOException {
	      String stkey1  =GlobalConnectionApi.getApplicationProperty("stripekey");
		return stkey1;
	}

	@Override
	public CustomerCollection getCustomer() throws IOException, StripeException {
		Stripe.apiKey=StripeServiceImpl.getStripKey();

		Map<String, Object> params = new HashMap<>();

		CustomerCollection customers = Customer.list(params);
		return customers;
	}

	@Override
	public void addCustomer(Partner partner) throws IOException, StripeException {
		
		Stripe.apiKey=StripeServiceImpl.getStripKey();

		Map<String, Object> params = new HashMap<>();
		params.put("name",partner.getName());
		params.put("id", partner.getId());
		params.put("email",partner.getEmailAddress().getAddress());

		Customer customer = Customer.create(params);
		
		
	}
	
	
	
	

}
