package bankaccountapp;

public class Cheking extends Account {
// List properties specific to a Checking account
	int debitCardNumber;
	int debitCardPIN;

// Constructor to initialize checking account properties
	public Cheking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		System.out.println("New Checking Account!");
	}
	
// List any methods to the checking account
	
}
