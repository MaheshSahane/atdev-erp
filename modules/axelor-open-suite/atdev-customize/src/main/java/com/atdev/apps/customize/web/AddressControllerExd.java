package com.atdev.apps.customize.web;

import com.atdev.apps.customize.service.AddressServiceExd;
import com.axelor.apps.base.db.Address;
import com.axelor.apps.base.service.AddressService;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;

public class AddressControllerExd {
	 public void autocompleteAddressNew(ActionRequest request, ActionResponse response) {
		    Address address = request.getContext().asType(Address.class);
		    Beans.get(AddressServiceExd.class).autocompleteAddressNew(address);
		    response.setValues(address);
		  }
}
