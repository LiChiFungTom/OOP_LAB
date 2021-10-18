
public class Account {

  //declare attributes
  private String _accountNumber;
  private double _balance;
  private Customer _customer;

  //create a constructor
  public Account(String _accountNumber , double _balance){
      this._accountNumber = _accountNumber;
      this._balance = _balance;
      this._customer = new Customer();
  }



  public void debit(double amount) {
    _balance -= amount;
  }

  public void credit(double amount) {
    _balance += amount;
  }

  public double getBalance() {
    return _balance;
  }

  public String getAccountNumber() {
    return _accountNumber;
  }

  public void setCustomer(Customer customer) {
    _customer = customer;
  }

  Customer getCustomer() {
    return _customer;
  }
}