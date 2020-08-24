package com.atdev.apps.customize.common.module;

import com.atdev.apps.customize.service.AddressServiceExd;
import com.atdev.apps.customize.service.AddressServiceExdImpl;
import com.axelor.app.AxelorModule;
import com.axelor.apps.account.service.AccountManagementServiceAccountImpl;
import com.axelor.apps.base.service.tax.AccountManagementServiceImpl;

public class CommonModule extends AxelorModule {
	 @Override
	  protected void configure() {
    bind(AddressServiceExd.class).to(AddressServiceExdImpl.class);

	 }
}
