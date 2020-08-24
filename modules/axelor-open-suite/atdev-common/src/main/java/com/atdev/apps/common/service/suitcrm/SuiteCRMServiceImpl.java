package com.atdev.apps.common.service.suitcrm;

import com.axelor.apps.base.db.Partner;
import com.axelor.apps.base.db.repo.PartnerRepository;
import com.google.inject.persist.Transactional;
import com.sugaronrest.NameOf;
import com.sugaronrest.RequestType;
import com.sugaronrest.SugarRestClient;
import com.sugaronrest.SugarRestRequest;
import com.sugaronrest.SugarRestResponse;
import com.sugaronrest.modules.Contacts;
import java.util.ArrayList;
import java.util.List;

public class SuiteCRMServiceImpl implements SuiteCRMService {

  public static List<String> getSelectedField() {
    List<String> selectedFields = new ArrayList<String>();

    selectedFields.add(NameOf.Contacts.FirstName);
    selectedFields.add(NameOf.Contacts.LastName);
    selectedFields.add(NameOf.Contacts.Title);
    selectedFields.add(NameOf.Contacts.Description);
    selectedFields.add(NameOf.Contacts.PrimaryAddressPostalcode);

    return selectedFields;
  }

  @Override
  public SugarRestResponse createContact(SugarRestClient client, Partner partner) {
    Contacts contact = new Contacts();
    System.out.println(partner.getName());
    System.out.println(partner.getFirstName());
    System.out.println(partner.getDescription());
    System.out.println(partner.getMainAddress().getAddressL2());

    contact.setFirstName(partner.getName());
    contact.setLastName(partner.getFirstName());
    contact.setDescription(partner.getDescription());
    contact.setAltAddressPostalcode(partner.getMainAddress().getAddressL2());
    SugarRestRequest request = new SugarRestRequest("Contacts", RequestType.Create);
    request.setParameter(contact);
    request.getOptions().setSelectFields(getSelectedField());

    return client.execute(request);
  }

  @Override
  @Transactional
  public SugarRestResponse ReadContact(SugarRestClient client, String count) {
    SugarRestRequest request = new SugarRestRequest("Contacts", RequestType.ReadById);
    request.setParameter(count);
    request.getOptions().setSelectFields(getSelectedField());
    request.getOptions().getSelectFields().add(NameOf.Contacts.Id);

    SugarRestResponse res = client.execute(request);

    Contacts cm = (Contacts) res.getData();
    Partner partner = new Partner();

    PartnerRepository repo = new PartnerRepository();

    partner.setName(cm.getFirstName());
    partner.setFirstName(cm.getFirstName());
    partner.setFullName(cm.getLastName());
    partner.setDescription(cm.getDescription());
    partner.setHeadOfficeAddress(cm.getAltAddressPostalcode());

    repo.save(partner);
    return res;
  }

  @Override
  public SugarRestResponse ReadAllContact(SugarRestClient client, int count) {
    SugarRestRequest request = new SugarRestRequest("Contacts", RequestType.BulkRead);
    request.getOptions().setSelectFields(getSelectedField());
    request.getOptions().getSelectFields().add(NameOf.Contacts.Id);

    // request.getOptions().setMaxResult(count);
    request.getOptions();
    return client.execute(request);
  }
}
