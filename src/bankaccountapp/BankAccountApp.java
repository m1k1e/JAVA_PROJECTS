package bankaccountapp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
	String file = "/home/user/Документи/Java/JAVA_PROJECTS/src/bankaccountapp/NewBankAccounts.csv";
		
   /*Cheking chkacc1 = new Cheking("Tom Wilson", "321456879", 1500);
	
	Savings savacc1 = new Savings("Rich Lowe", "4566557897", 2500);
	
	//savacc1.compound();
	
	savacc1.showInfo();
	
	System.out.println("**************");
	
	chkacc1.showInfo();
	
	
	//savacc1.deposit(5000);
	//savacc1.withdraw(200);
	//savacc1.transfer("Brokerage", 3000);*/
	
	
  // Read a CSV file then create new accounts based on that data 
	List<String[]> newAccountHolders = utilities.CSV.read(file);
	for(String[] accountHolder : newAccountHolders) {
		System.out.println("New Account: ");
		System.out.println(accountHolder[0]);
		System.out.println(accountHolder[1]);
		System.out.println(accountHolder[2]);
		System.out.println(accountHolder[3]);
	}

	}

}
