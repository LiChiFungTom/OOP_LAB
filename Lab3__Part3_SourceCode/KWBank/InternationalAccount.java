import java.util.Vector;

public class InternationalAccount {


  //declare attributes
  private String _accountNumber;
  private double _balance;
  private String _currency;
  private ForeignExchangeCalculator _calculator;
  private Client _client;

  static public final String HKD = "HKD";
  static public final String USD = "USD";

  //create a constructor
  public InternationalAccount(String accountNumber, double balance, String currency){
    this._accountNumber = accountNumber;
    this._balance = balance;
    this._currency = currency;
    this._client = new Client();
    _calculator = new ForeignExchangeCalculator();
  }




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
      return _balance / _calculator.HKD2USD(1.0);
    }

  }

  public double showBalanceInUSD() {
    //return USD
    //if the currency in the account is HKD, change to USD
    if(_currency.equals(USD)){
      return _balance;}
    else{
      return _calculator.HKD2USD(_balance);
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