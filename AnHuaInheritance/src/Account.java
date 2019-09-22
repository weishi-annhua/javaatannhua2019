public class Account {
	protected double balance;
	public Account(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public boolean deposit (double amt){
		if (amt > 0) {
		   balance +=amt;
		   return true;
		}
		else
		    return false;
	}
	public boolean withdraw (double amt){
	    	if (amt <= balance) {
		    balance -=amt;
		    return true;
		}
		else
	        return false;
	}
}
