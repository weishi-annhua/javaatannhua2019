public class Main {
	public Main() {
	}
	public static void main(String[] args) {
		CheckingAccount myChecking = new CheckingAccount(100);
		SavingAccount mySaving = new SavingAccount(200, 5);
		myChecking.deposit(132.14);
		mySaving.deposit(132.14);
		mySaving.addInterest( );
		System.out.println("Checking balance is: " + myChecking.getBalance()); 	
		System.out.println("Saving balance is: " + mySaving.getBalance( ));
		
		
	}
}