package com.atdev.apps.common.service.Stripe;

import java.io.IOException;

import com.axelor.apps.base.db.Partner;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.CustomerCollection;

public interface StripeService {
	
	public CustomerCollection getCustomer() throws IOException, StripeException ;
	public void addCustomer(Partner partner) throws IOException, StripeException ;

}