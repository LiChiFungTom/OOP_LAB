package KWBank;

import java.util.*;

public class Client {

  //declare attributes


  //create a constructor


  public String getName() {
    return _name;
  }

  public String getAddress() {
    return _address;
  }
  public void addInternationalAccount(InternationalAccount account) {
    _internalAccounts.add(account);
  }

  public void removeInternationalAccount(InternationalAccount account) {
    _internalAccounts.remove(account);
  }

  public Enumeration getInternationalAccounts() {
    return _internalAccounts.elements();
  }
}
