package review_sessions.week7;

import java.util.Scanner;

public class String_Equals {

	public static void main(String[] args) {
		
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = new String("Welcome to Java");
		
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
		
		System.out.println("----------");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the capital of USA?");
		
		String capital = scan.next();
		
		capital = capital.toUpperCase();
		capital = capital.toLowerCase();
		
		if(capital.equals("DC")) {
			System.out.println("Your answer is correct");
		}else {
			System.out.println("Your answer is not correct");
		}
		
		

	}

}
