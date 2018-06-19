package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
	Cheking chkacc1 = new Cheking("Tom Wilson", "321456879", 1500);
	
	Savings savacc1 = new Savings("Rich Lowe", "4566557897", 2500);
	
	savacc1.showInfo();
	
	System.out.println("**************");
	
	chkacc1.showInfo();
	
  // Read a CSV file then create new accounts based on that data 

	}

}
