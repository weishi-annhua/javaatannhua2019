
public class PrivilegedAccount extends SavingAccount {
	
	public PrivilegedAccount(double balance, double interestRate) {
		super(balance, interestRate);  //must be first line, call superclass constructor
	}
	
	public boolean withdraw (double amt){
	    balance -=amt;
	    return true;
	}
	
}
