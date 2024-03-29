package review_sessions.week6;

import java.util.Scanner;

public class UserInput {


	public static void main(String[] args) {
		
		//Scanner, String, Array, Math, Random.....
		
		Scanner sc = new Scanner(System.in);  //I am creating an object from Scanner class - to able to use properties(variable + methods) belongs to that class
		
		System.out.println("Enter first  number:");
		int num1 = sc.nextInt(); //I am calling the method 
		
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		
		//sc.nextLine(); ///if u want to use nextLine after nextInt - you need to put one extra nextLine before nextline
		
		System.out.println("Enter a string:");
		//String str = sc.nextLine();
		
		String str = sc.next();
		
		System.out.println(str);
		
		
		

	}

}
