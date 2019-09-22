public class SavingAccount extends Account {
	protected double interestRate;

	public SavingAccount(double balance, double interestRate) {
		super(balance);  //must be first line, call superclass constructor
		this.interestRate = interestRate;
	}

	public void addInterest( )
	{
		double interest = getBalance( ) * interestRate / 100;
		deposit(interest);
	}
}
