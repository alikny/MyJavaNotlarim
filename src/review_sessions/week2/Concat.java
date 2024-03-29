package review_sessions.week2;

public class Concat {

	public static void main(String[] args) {
		
		int age = 60; 
		
		
		System.out.println("My Age is : " + age);  // My Age is + 35 
		
		String city1 = "Berlin";
		String city2 = "Munich";
		double ticketPrice = 130.50;
		
		//From New York to Chicago is $285.99
		
		System.out.println("From " + city1 + " to " + city2 + " is $" + ticketPrice);
		
		
		//How to seperate + for concat and addition
		System.out.println("Apple" + 45); //String + int => concat
		System.out.println(45 + "apple"); //int + String => concat
		System.out.println(45+45); //int + int => addition
		System.out.println(45+45+"apple"); //(int + int) + String = > int + String = >
		System.out.println("apple" + 45 + 45); //String + int + int => (String+int) + int = > String + int
		System.out.println("apple" + (45+45)); // String + (int+int) = >String + int 
		System.out.println("apple" + 45 + 45 + "apple"); //String + int + int  + String
														//(string+int) + int + String 
														// (String + int) + String 
														// String + String 
		System.out.println( ("45"+ "45") + 45 + 45);
		// (String+String) + int + int = > String + int + int => string + int = > String
		
		
		
	
		
	}

}
