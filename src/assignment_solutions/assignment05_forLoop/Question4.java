package assignment_solutions.assignment05_forLoop;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int product=0;
		
		while(product<100) {
			
			System.out.print("Enter number:");
			
			product = scanner.nextInt() * 10;
			
		}
		
		System.out.println("Product is:" + product);



	}

}
