package review_sessions.week3;

import java.util.Scanner;

public class Multiplier {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Enter number1:");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter number2:");
		int num2 = scanner.nextInt();
		
		int result = num1 * num2;
		
		System.out.println(num1 + "*" + num2 + "=" + result);
		
		

	}

}
