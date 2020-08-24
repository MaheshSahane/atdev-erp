package com.atdev.apps.common.web;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

import com.atdev.apps.common.service.GlobalConnectionApi;
import com.atdev.apps.common.service.SimpleLegal.SimpleLegalService;
import com.atdev.apps.common.service.SimpleLegal.pojo.InvoiceSimpleLegal;
import com.atdev.apps.common.service.SimpleLegal.pojo.Result;
import com.atdev.apps.common.service.suitcrm.SuiteCRMServiceImpl;
import com.axelor.apps.base.db.Address;
//import com.atdev.apps.common.service.suitcrm.SuiteCRMServiceImpl;
import com.axelor.apps.base.db.Partner;
import com.axelor.inject.Beans;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.axelor.rpc.Request;
import com.sugaronrest.SugarRestClient;
import com.sugaronrest.SugarRestResponse;
import com.sugaronrest.modules.Contacts;

public class SuiteCRMController {
	
	  private static String SugarRestClientURL = null;
	  private static String SugarRestClientUSERNAME = null;
	  private static String SugarRestClientPASSWORD = null;

	
	  public static void  getProperties() throws IOException {

		  SugarRestClientURL = GlobalConnectionApi.getApplicationProperty("SugarRestClientURL");
		  SugarRestClientUSERNAME = GlobalConnectionApi.getApplicationProperty("SugarRestClientUSERNAME");
		  SugarRestClientPASSWORD = GlobalConnectionApi.getApplicationProperty("SugarRestClientPASSWORD");


		  }
	  
	
	//public static SugarRestClient client = new SugarRestClient("http://13.232.243.118/suitecrm/service/v4_1/rest.php", "admin", "manage123");

	
	 public void CreateContact(ActionRequest request, ActionResponse response) throws IOException {
		 
	//	 SugarRestClient client = new SugarRestClient("http://13.232.243.118/suitecrm/service/v4_1/rest.php", "admin", "manage123");
	
		 SuiteCRMController.getProperties();
		 SugarRestClient client = new SugarRestClient(SugarRestClientURL,SugarRestClientUSERNAME,SugarRestClientPASSWORD);
 
		 Partner PartnerfromReq = request.getContext().asType(Partner.class);
		
		    
		 
		 
		 
		 
		 
		 System.out.println("Before call");
		 
		 SuiteCRMServiceImpl simpleLegalobj = Beans.get(SuiteCRMServiceImpl.class);

		 SugarRestResponse SugarRestResponse = simpleLegalobj.createContact(client,PartnerfromReq);

		 System.out.println("After call");

		   }
	 
	 
	 
	 public void ReadContact(ActionRequest request, ActionResponse response) throws IOException {
	 
		 SuiteCRMController.getProperties();
		 SugarRestClient client = new SugarRestClient(SugarRestClientURL,SugarRestClientUSERNAME,SugarRestClientPASSWORD);
 
		 SuiteCRMServiceImpl simpleLegalobj = Beans.get(SuiteCRMServiceImpl.class);
		 SugarRestResponse SugarRestResponse = simpleLegalobj.ReadContact(client,"3a4bfd66-b382-a35a-ce50-5f27ed30ed6d");
		 System.out.println(SugarRestResponse.getData());
		 System.out.println(SugarRestResponse.getJData());
		 System.out.println(SugarRestResponse.getJsonRawRequest());
		 System.out.println(SugarRestResponse.getJsonRawResponse());
		 System.out.println(SugarRestResponse.getStatusCode());
		 
		 
		Contacts cm =(Contacts) SugarRestResponse.getData();
	
		System.out.println("Contacts"+cm.getFirstName());
		System.out.println("getLastName:"+cm.getLastName());
		System.out.println("getDescription:"+cm.getDescription());
		System.out.println("getAltAddressPostalcode:"+cm.getAltAddressPostalcode());





		 response.setValues(cm);
		 
		 
		 
	 
	 
	 }
	 
	 public void ReadAllContact(ActionRequest request, ActionResponse response) throws IOException {
		 
		 SuiteCRMController.getProperties();
		 SugarRestClient client = new SugarRestClient(SugarRestClientURL,SugarRestClientUSERNAME,SugarRestClientPASSWORD);
 
		 SuiteCRMServiceImpl simpleLegalobj = Beans.get(SuiteCRMServiceImpl.class);
		 SugarRestResponse SugarRestResponse = simpleLegalobj.ReadAllContact(client, 4);
		 System.out.println(SugarRestResponse.getData());
		 System.out.println(SugarRestResponse.getJData());
		 System.out.println(SugarRestResponse.getJsonRawRequest());
		 System.out.println(SugarRestResponse.getJsonRawResponse());
		 System.out.println(SugarRestResponse.getStatusCode());
		 
		 
	List	<Contacts> cm = (List<Contacts>) SugarRestResponse.getData();
	


System.out.println(cm.get(0).getFirstName());
System.out.println(cm.get(0).getLastName());
System.out.println(cm.get(0).getFirstName());




		 response.setData(cm);
		 
		 
		 
	 
	 
	 }
	 
	 
	 
	
	 
  }



