package KWBank;

import java.util.*;

class Main {
  public static void main(String[] args) {
    Client c1 = new Client("Peter Chan", "20 Tsing Yi Road, Tsing Yi");
    InternationalAccount a1 = new InternationalAccount("12-133-22", 1000.0, "HKD");
    InternationalAccount a2 = new InternationalAccount("13-123-22", 2000.0, "USD");

    ForeignExchangeCalculator calculator = new ForeignExchangeCalculator();

    // set the links between account and customer



    // set the links between account and calculator

    
    
    
    System.out.println("Customer " + c1.getName() + ", " + c1.getAddress());
    System.out.println("International Accounts");
    Enumeration accounts = c1.getInternationalAccounts();
    while (accounts.hasMoreElements()) {

      //print out all the accounts of client c1 with balance

    }
  }
}