package KWBank;



import java.util.*;

public class Client {

  //declare attributes
  private String _name;
  private String _address;
  private Vector _internalAccounts;

  public Client(){
    _internalAccounts = new Vector();
  }

  //create a constructor
  public Client(String name , String address){
    this._name = name;
    this._address = address;
    _internalAccounts = new Vector();
  }

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
