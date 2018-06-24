package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
	List<Account> accounts = new LinkedList<Account>();
		
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
	String file = "/home/user/Документи/Java/JAVA_PROJECTS/src/bankaccountapp/NewBankAccounts.csv";
	List<String[]> newAccountHolders = utilities.CSV.read(file);
	for(String[] accountHolder : newAccountHolders) {
		//System.out.println("New Account: ");
		String name = accountHolder[0];
		String sSN = accountHolder[1];
		String accountType = accountHolder[2];
		double initDeposite = Double.parseDouble(accountHolder[3]);
		
		//System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposite);
	
		if (accountType.equals("Savings")) {
			//System.out.println("Open a Savings Account!");
			accounts.add(new Savings(name, sSN, initDeposite));
		}
		else if (accountType.equals("Checking")) {
			//System.out.println("Open a Chacking Account!");
			accounts.add(new Cheking(name, sSN, initDeposite));
		}
		else {
			System.out.println("Error readin Account Type!");
		}
		
		/*System.out.println(accountHolder[0]);
		System.out.println(accountHolder[1]);
		System.out.println(accountHolder[2]);
		System.out.println(accountHolder[3]);*/
	}
	
	//accounts.get(5).showInfo();
	for (Account acc : accounts) {
		System.out.println("\n****************");
		acc.showInfo();
	}

	}
	
	

}
