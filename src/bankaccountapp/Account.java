package bankaccountapp;

public abstract class Account implements IBaseRate {
// List common properties for saving and checking account
	String name;
	String sSN;
	double balance;
	
	String accountNumber;
	double rate;
	
// Constructor to set base properties and initialize the account
	public Account(String name) {
		System.out.println("Name: " + name);
		System.out.print("New Account: ");
	}

// List common methods
	
}
