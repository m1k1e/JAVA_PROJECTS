package bankaccountapp;

public class Savings extends Account {
// List properties specific to the Saving account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;

// Constructor to initialize settings for the Savings properties
public Savings(String name, String sSN, double initDeposit) {
	super(name, sSN, initDeposit);
	accountNumber = "1" + accountNumber;
	
	setSafetyDepositBox();
	//System.out.println("Account Number: " + this.accountNumber);
	//System.out.println("New Savings Account!");
}


private void setSafetyDepositBox() {
	safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
	safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	//System.out.println(safetyDepositBoxID);
}
// List any methods specific to savings account

public void showInfo() {
	super.showInfo();
	System.out.println(
			" Your Savings Account Features" +
			"\n Safety Deposit Box ID: " + safetyDepositBoxID + 
			"\n Sefety Deposite Box Key: " + safetyDepositBoxKey
			);
	//System.out.println("ACCOUNT TYPE: Savings!");
}

@Override
public void setRate() {
	//System.out.println("Implements rate for Savings");
	rate = getBaseRate() - .25;
}

}
