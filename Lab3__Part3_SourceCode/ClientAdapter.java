import java.util.*;

import BankOne.*;
import KWBank.*;


public class ClientAdapter extends Client{
    Customer _customer;

    public ClientAdapter(Customer _customer){
        super();
        this._customer = _customer;
    }

    public String getName() {
        return _customer.getName();
      }

      public String getAddress() {
        return _customer.getAddress();
      }

      public void addInternationalAccount(InternationalAccount account) {
        _customer.addInternationalAccount(account);
      }

      public void removeInternationalAccount(InternationalAccount account) {
        _customer._internalAccounts.remove(account);
      }

      public Enumeration getInternationalAccounts() {
        Vector a = new Vector();
        Enumeration accounts = _customer.getInternationalAccounts();
        while (accounts.hasMoreElements()){
            

        
        }



        return _customer._internalAccounts.elements();
      }

}
