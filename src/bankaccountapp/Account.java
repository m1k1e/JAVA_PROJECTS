package bankaccountapp;

public abstract class Account implements IBaseRate {
// List common properties for saving and checking account
	String name;
	String sSN;
	double balance;
	static int index = 10000;
	String accountNumber;
	double rate;
	
// Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit + 100;
		System.out.println("Name: " + name + " sSN: " + sSN + " Balance: $" + balance);
		
// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		System.out.println("Account Number: " + this.accountNumber);
	}
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
				}

// List common methods
	
}
