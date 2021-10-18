
import java.util.*;

public class Customer {

  //declare attributes
  private String _name;
  private String _address;
  private Vector _accounts;

  //create a constructor
  
  public Customer(){
    _accounts = new Vector();
  }
  
  public Customer(String _name , String _address){
    this._name = _name;
    this._address = _address;
    this._accounts= new Vector();
  }

  public String getName() {
    return _name;
  }

  public String getAddress() {
    return _address;
  }
  public void addAccount(Account account) {
    _accounts.add(account);
  }

  public void removeAccount(Account account) {
    _accounts.remove(account);
  }

  public Enumeration getAccounts() {
    return _accounts.elements();
  }
}