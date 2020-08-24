package com.atdev.apps.common.service.SimpleLegal;

import com.atdev.apps.common.service.SimpleLegal.pojo.*;
import com.atdev.apps.common.service.SimpleLegal.pojo.user.SimpleLegalUser;
import com.axelor.auth.db.User;

import java.io.IOException;

public interface SimpleLegalService {
  public InvoiceSimpleLegal GetAllInvoice() throws IOException;

  public Result GetInvoice(String InvID) throws IOException;

  public void createPayment() throws IOException;

  public Result GetInvoiceMapAxelor(String InvID) throws IOException;
  
  public void addUser(User obj) throws IOException;
  
  public SimpleLegalUser viewUser() throws IOException;

  
  
  
  
}
