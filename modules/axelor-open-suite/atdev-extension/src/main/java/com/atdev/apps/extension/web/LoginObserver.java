package com.atdev.apps.extension.web;

import com.axelor.apps.common.db.Login;
import com.axelor.apps.common.db.repo.LoginRepository;
import com.axelor.auth.db.User;
import com.axelor.event.Observes;
import com.axelor.events.PostLogin;
import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.inject.Named;

public class LoginObserver extends LoginRepository {

  @Inject private LoginRepository loginRepo;

  @Transactional
  void onLoginSuccess(@Observes @Named(PostLogin.SUCCESS) PostLogin event) {
    User user = event.getUser();
    String UserName = user.getName();
   
    LocalDateTime loginTime = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
   
    Login login = new Login();
    login.setUser_name(UserName);
    login.setLogin_time(loginTime.format(format));
    loginRepo.save(login);
  }
}
