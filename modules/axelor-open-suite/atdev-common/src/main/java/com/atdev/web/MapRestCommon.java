package com.atdev.web;

import javax.ws.rs.QueryParam;

import com.axelor.apps.common.db.CallJournaling;
import com.axelor.apps.common.db.CreateContact;
import com.fasterxml.jackson.databind.JsonNode;

public interface MapRestCommon {
	public JsonNode getPartnerByMobile(@QueryParam("mobilePhone") String mobilePhone);
	public JsonNode getPartnerById(@QueryParam("contactID") long contactID);
	public JsonNode createContact(CreateContact createContact);
	public void createCallJournaling(CallJournaling callJornaling);
}
