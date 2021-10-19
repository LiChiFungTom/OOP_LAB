import BankOne.*;
import KWBank.*;

public class InternationalAdapter extends InternationalAccount{
    private Account _account;

    public InternationalAdapter(Account _account){
        super();
        this._account = _account;
    }

    public void increase(double amount) {
        _account.credit(amount);
      }
    
      public void decrease(double amount) {
        _account.debit(amount);
      }

      public double showBalanceInUSD() {
        //return USD
        //if the currency in the account is HKD, change to USD
        if(_account.getBalance().equals(USD)){
          return _account._balance;}
        else{
          return _account._calculator.HKD2USD(_account._balance);
        }
      }

    public String getAccountNumber() {
        return _account.getAccountNumber();
    }

    public void setClient(Client client) {
        super.setClient(client);
    }

   

}