package review_sessions.week5;

public class ChnageConverter {

	public static void main(String[] args) {
		
		changeConverter(45);
		
		changeConverter(65);
		

	}
	
	public static void changeConverter(int priceInCentes) {
		
		int change = 100 - priceInCentes;   //25 10 5
	
		int quarter = change / 25;  //1 leftover 15 cents 1 dime(10 cents)
		
		int dimes = (change % 25) / 10;  // 1 
		
		int nickles =  ( (change % 25) % 10 ) / 5;
		
		System.out.println("Your change is " + quarter + " quarters, " + dimes + " dimes," + nickles + " nickels");
	}

}
