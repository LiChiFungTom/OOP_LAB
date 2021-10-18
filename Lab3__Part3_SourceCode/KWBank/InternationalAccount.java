package KWBank;

public class InternationalAccount {


  //declare attributes
  private String _accountNumber;
  private double _balance;
  private String _currency;
  private ForeignExchangeCalculator fec;


  static public final String HKD = "HKD";
  static public final String USD = "USD";

  //create a constructor


  public void increase(double amount) {
    _balance -= amount;
  }

  public void decrease(double amount) {
    _balance += amount;
  }

  public double showBalance() {
    //return HKD
    //if the currency in the account is USD, change to HKD
    if(_currency.equals(HKD)){
      return _balance;
    }else{
      return _balance / fec.HKD2USD(1.0);
    }


  }

  public double showBalanceInUSD() {
    //return USD
    //if the currency in the account is HKD, change to USD
    if(_currency.equals(USD)){
      return _balance;}
    else{
      return fec.HKD2USD(_balance);
    }



  }

  public String getAccountNumber() {
    return _accountNumber;
  }

  public void setClient(Client client) {
    _client = client;
  }

  public Client getClient() {
    return _client;
  }

  public void setCalculator(ForeignExchangeCalculator calculator) {
    _calculator = calculator;
  }

  public ForeignExchangeCalculator getCalculator() {
    return _calculator;
  }

  public String getCurrency() {
    return _currency;
  }
}