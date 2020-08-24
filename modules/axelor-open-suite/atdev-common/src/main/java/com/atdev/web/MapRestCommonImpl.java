package com.atdev.web;

import com.axelor.apps.common.db.CallJournaling;
import com.axelor.apps.common.db.CreateContact;
import com.axelor.apps.common.db.repo.CallJournalingRepository;
import com.axelor.apps.common.db.repo.CreateContactRepository;
import com.axelor.apps.base.db.Partner;
import com.axelor.apps.base.db.repo.PartnerRepository;
import com.axelor.apps.base.service.MapRestService;
import com.axelor.db.Query;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/map")
public class MapRestCommonImpl implements MapRestCommon {
  @Inject private MapRestService mapRestService;

  @Inject private PartnerRepository partnerRepo;
  
  @Inject private CreateContactRepository createContactRepo;
  
  @Inject private CallJournalingRepository callJournalingRepo;

  JsonNodeFactory nodeFactory = JsonNodeFactory.instance;

  public static Partner findByMobilePhone(String mobilePhone) {
    return Query.of(Partner.class)
        .filter("self.mobilePhone = :mobilePhone")
        .bind("mobilePhone", mobilePhone)
        .fetchOne();
  }

  @Path("/getPartner")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public JsonNode getPartnerByMobile(@QueryParam("mobilePhone") String mobilePhone) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode rootNode = mapper.createObjectNode();

    ObjectNode mainNode = nodeFactory.objectNode();
    //	  ArrayNode arrayNode = nodeFactory.arrayNode();
    ObjectNode objectNode = nodeFactory.objectNode();
    try {
      Partner partners = findByMobilePhone(mobilePhone);

      objectNode.put("id", partners.getId());
      objectNode.put("firstname", partners.getName());
      objectNode.put("lastname", partners.getFirstName());
      objectNode.put("mobilephone", partners.getMobilePhone());
      objectNode.put("email", partners.getEmailAddress().getAddress());
      ((ObjectNode) rootNode).set("contact", objectNode);
    } catch (Exception e) {
      mapRestService.setError(mainNode, e);
    }
    System.out.println("Result is"+rootNode);
    return rootNode;
  }

  @Path("/show")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public JsonNode getPartnerById(@QueryParam("contactID") long contactID) {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode rootNode = mapper.createObjectNode();
    ObjectNode mainNode = nodeFactory.objectNode();
    ObjectNode objectNode = nodeFactory.objectNode();
    try {
      Partner partners = partnerRepo.find(contactID);
      objectNode.put("fullname", partners.getFullName());
      ((ObjectNode) rootNode).set("contact", objectNode);
    } catch (Exception e) {
      mapRestService.setError(mainNode, e);
    }
    System.out.println("Result is"+rootNode);
    return rootNode;
  }

  @Path("/create")
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Transactional
  public JsonNode createContact(CreateContact createContact) {
  	ObjectMapper mapper = new ObjectMapper();
    JsonNode rootNode = mapper.createObjectNode();
    ObjectNode mainNode = nodeFactory.objectNode();
    ObjectNode objectNode = nodeFactory.objectNode();
    
    System.out.println(createContact.toString());

    CreateContact obj = createContactRepo.save(createContact);
    System.out.println("Result is obj"+obj.getId());
    
    try {
        CreateContact obj2 = createContactRepo.find(obj.getId());
        objectNode.put("id", obj2.getId());
        objectNode.put("firstname", obj2.getFirstname());
        objectNode.put("mobilephone", obj2.getMobilephone());
        ((ObjectNode) rootNode).set("contact", objectNode);
    } catch(Exception e) {
    	mapRestService.setError(mainNode, e);
    }
    
    String output = createContact.toString();
    System.out.println("Result is"+output);
    return rootNode;
  }

  @Path("/createCall")
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Transactional
  public void createCallJournaling(CallJournaling callJornaling) {
    System.out.println(callJornaling.toString());
    String output = callJornaling.toString();

    CallJournaling obj = callJournalingRepo.save(callJornaling);
    System.out.println("Obj "+obj.getId());
    System.out.println("Result is"+output);
  }
}
