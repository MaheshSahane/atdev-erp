package com.atdev.apps.extension.common.module;


import com.atdev.apps.extension.web.LoginObserver;
import com.axelor.app.AxelorModule;

public class CommonModule extends AxelorModule {

  @Override
  protected void configure() {

    bind(LoginObserver.class);
  }
}
