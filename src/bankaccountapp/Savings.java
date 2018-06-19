package bankaccountapp;

public class Savings extends Account {
// List properties specific to the Saving account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;

// Constructor to initialize settings for the Savings properties
public Savings(String name, String sSN, double initDeposit) {
	super(name, sSN, initDeposit);
	accountNumber = "1" + accountNumber;
	//System.out.println("Account Number: " + this.accountNumber);
	//System.out.println("New Savings Account!");
}
// List any methods specific to savings account

public void showInfo() {
	super.showInfo();
	System.out.println("ACCOUNT TYPE: Savings!");
}

}
