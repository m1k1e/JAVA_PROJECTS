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
		//System.out.println("Name: " + name + " sSN: " + sSN + " Balance: $" + balance);
		
// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
		//System.out.println(getBaseRate());
		//System.out.println("Account Number: " + this.accountNumber);
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
				}

// List common methods
	public void showInfo() {
		System.out.println(
				"NAME: " + name +
				"\nACCOUNT NUMBER: " + accountNumber + 
				"\nBALANCE: " + balance +
				"\nRATE: " + rate + "%"
				);
	}
	
}
