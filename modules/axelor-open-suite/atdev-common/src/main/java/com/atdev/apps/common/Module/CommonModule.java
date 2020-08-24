package com.atdev.apps.common.Module;

import com.atdev.apps.common.service.SimpleLegal.*;
import com.atdev.apps.common.service.Stripe.*;
import com.atdev.apps.common.service.Stripe.StripeService;
import com.atdev.apps.common.service.Stripe.StripeServiceImpl;
import com.atdev.apps.common.service.easyship.ShipmentService;
import com.atdev.apps.common.service.easyship.ShipmentServiceImpl;
import com.atdev.apps.common.service.suitcrm.*;
import com.axelor.app.AxelorModule;

public class CommonModule extends AxelorModule {

  @Override
  protected void configure() {
    bind(StripeService.class).to(StripeServiceImpl.class);
    bind(SimpleLegalService.class).to(SimpleLegalServiceImpl.class);
    bind(SuiteCRMService.class).to(SuiteCRMServiceImpl.class);
    bind(ShipmentService.class).to(ShipmentServiceImpl.class);
  }
}
