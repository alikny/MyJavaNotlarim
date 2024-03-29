package review_sessions.week6;

public class CheckingAccountTest {

	public static void main(String[] args) {
		
		//create an account //create an object from CheckingAccount class
		CheckingAccount clientOne = new CheckingAccount();
		int x = 5;
		
		
		System.out.println(x);//5
		System.out.println(clientOne);
		
		clientOne.accountNumber = 3412546576868L;
		clientOne.accountHolder = "Mike";
		clientOne.balance = 500.0;
		
		clientOne.getAccountInfo();
		
		//create another account and set data using method
		CheckingAccount client2 = new CheckingAccount();
		client2.setInfo(300.0, 34253546464L, "Ozzy");
		
		
		//test deposit
		clientOne.deposit(300);
		clientOne.getAccountInfo();
		
		//test withdraw method 
		clientOne.withdraw(100);
		clientOne.getAccountInfo();
		
		//call purchase method
		CheckingAccount myAccount = new CheckingAccount();
		myAccount.setInfo(200, 222138465476L, "Mike Smith");
		myAccount.purchase("Book", 120);
		
		System.out.println("Current Balance:" + myAccount.balance);
		
		myAccount.purchase("Shoes", 100);
		myAccount.getAccountInfo();
		
		myAccount.deposit(10000);
		myAccount.getAccountInfo();
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
