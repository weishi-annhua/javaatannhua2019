
public class CreditCardAccount extends CheckingAccount {
	public CreditCardAccount(double balance) {
		super(balance);  //must be first line, call superclass constructor
	}

	public boolean withdraw (double amt){
	    balance -=amt;
	    return true;
	}
	
	public boolean deposit (double amt){
		if (amt > 0) {
		  if (balance < 0)
		    balance -= 20;
		  balance += amt;
		  return true;
		}
		else
		    return false;
	}
	
}
