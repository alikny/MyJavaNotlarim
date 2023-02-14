package src.review_sessions.week3;

import java.util.Scanner;  //step-1

public class EmailBuilder {

	public static void main(String[] args) {
		
/*      Welcome to your new Company!
		Enter first name, last name, company name:
		mike
		smith
		cybertek
		Your email: mike_smith@cybertek.com
*/
		
		Scanner scanner = new Scanner(System.in); //step-2
		
		System.out.println("Welcome to your new Company!"); 
		
		System.out.println("Enter first name, last name, company name:"); //step-3
		
		String firstName = scanner.nextLine();
		
		String lastName = scanner.next();
		
		String company = scanner.next();
		
		String email = firstName + "_" + lastName + "@" + company + ".com";
		
		System.out.println("Your email: " + email );
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
