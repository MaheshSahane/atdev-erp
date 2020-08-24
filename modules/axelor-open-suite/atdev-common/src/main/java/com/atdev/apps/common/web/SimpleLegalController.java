package com.atdev.apps.common.web;

import com.atdev.apps.common.service.GlobalConnectionApi;
import com.atdev.apps.common.service.SimpleLegal.*;
import com.atdev.apps.common.service.SimpleLegal.pojo.*;
import com.atdev.apps.common.service.SimpleLegal.pojo.user.SimpleLegalUser;
import com.axelor.apps.base.db.Partner;
import com.axelor.apps.common.db.NewInvoice;
import com.axelor.auth.db.User;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class SimpleLegalController {
  public void getAllInvoice(ActionRequest request, ActionResponse response) throws IOException {
    SimpleLegalService simpleLegalobj = Beans.get(SimpleLegalService.class);

    InvoiceSimpleLegal invoce = simpleLegalobj.GetAllInvoice();
    List<Result> invoice1 = invoce.getResults();
    for (Result invoice2 : invoice1) {
      System.out.println("NewId:" + invoice2.getId());
      System.out.println("VendorId:" + invoice2.getVendorId());
      System.out.println("NativeCurrency:" + invoice2.getNativeCurrency());
      System.out.println("FinalAmount:" + invoice2.getFinalAmount());
      
      System.out.println(invoice2);

      response.setData(invoice1);
      
    }
  }

  public void getInvoice(ActionRequest request, ActionResponse response) throws IOException {
    SimpleLegalService simpleLegalobj = Beans.get(SimpleLegalService.class);

    NewInvoice newinvoice = new NewInvoice();

    Result invoce =
        simpleLegalobj.GetInvoiceMapAxelor("inv_ce8b3b1262bb563e8099f506a3ec6cd41c642a6d");

    System.out.println("NewId:" + invoce.getId());
    System.out.println("VendorId:" + invoce.getVendorId());
    System.out.println("NativeCurrency:" + invoce.getNativeCurrency());
    System.out.println("FinalAmount:" + invoce.getFinalAmount());

    // NewInvoiceRepository invoiceRepo = new NewInvoiceRepository();
    // NewInvoice newinvoice = new NewInvoice();
    newinvoice.setInvoice_id(invoce.getId());
    newinvoice.setVendor_id(invoce.getVendorId());
    newinvoice.setMatter(invoce.getCurrency());
    newinvoice.setNative_amount(invoce.getInvoiceNumber());
    newinvoice.setPercentage(invoce.getInvoiceDate());

    // response.setValues(newinvoice);

  }
  

	
	  

  public void CreatePayment(ActionRequest request, ActionResponse response) throws IOException {
    SimpleLegalService simpleLegalobj = Beans.get(SimpleLegalService.class);

    simpleLegalobj.createPayment();
  }
  
  
  public void addUser(ActionRequest request, ActionResponse response) throws IOException {
		User user = request.getContext().asType(User.class);
		
		System.out.println(user.getEmail());
//
//		Partner par = request.getContext().asType(Partner.class);
//		
//		System.out.println(par.getEmailAddress().getAddress());
//
//		user.setEmail(par.getEmailAddress().getAddress());
	  
	  SimpleLegalService simpleLegalobj = Beans.get(SimpleLegalService.class);

	     simpleLegalobj.addUser(user);
	   
	      
	    
	  }
  
  public void getUser(ActionRequest request, ActionResponse response) throws IOException {
	    SimpleLegalService simpleLegalobj = Beans.get(SimpleLegalService.class);

	    SimpleLegalUser users = simpleLegalobj.viewUser();
	    List<com.atdev.apps.common.service.SimpleLegal.pojo.user.Result> user1 = users.getResults();
	    for (com.atdev.apps.common.service.SimpleLegal.pojo.user.Result user : user1) {
	      System.out.println("NewId:" + user.getId());
	     
	      System.out.println(user1);

	      
	    }
	    
	      response.setData(user1);

	  }
  

}
