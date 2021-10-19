import java.util.*;

import BankOne.*;

public class TestAdapter {

  public static void main(String[] args) {
    Customer c1 = new Customer("Peter Chan", "20 Tsing Yi Road, Tsing Yi"); // the customer is from BankOne, he (Peter Chan) has two accounts in BankOne
    SavingAccount a1 = new SavingAccount("12-133-22", 1000.0);
    SavingAccount a2 = new SavingAccount("13-123-22", 2000.0);
    // set the links between customer and accounts
    



    // create client adapter to use the customer and accounts
    // we need to change the customer object in BankOne to client object in KWBank



    System.out.println("Customer " + client.getName() + ", " + client.getAddress());
    System.out.println("International Accounts");
    Enumeration ias = client.getInternationalAccounts();
    while (ias.hasMoreElements()) {
      //print out all the accounts of client c1 with balance in USD
      
    }

  }

}