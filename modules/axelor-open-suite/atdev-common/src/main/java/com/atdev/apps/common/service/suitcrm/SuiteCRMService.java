package com.atdev.apps.common.service.suitcrm;

import com.axelor.apps.base.db.Partner;
import com.sugaronrest.SugarRestClient;
import com.sugaronrest.SugarRestResponse;

public interface SuiteCRMService {
  public SugarRestResponse createContact(SugarRestClient client, Partner partner);

  public SugarRestResponse ReadContact(SugarRestClient client, String count);

  public SugarRestResponse ReadAllContact(SugarRestClient client, int count);
}
