package review_sessions.week3;

import java.util.Scanner;

public class SeasonFindder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter month:");
		int month = scanner.nextInt();
		
		switch(month) {  //byte,short,char,int,String
		case 3: case 4: case 5:
			System.out.println("It is spring");
			break;
		case 6: case 7: case 8:
			System.out.println("It is summer");
			break;
		case 9: case 10: case 11:
			System.out.println("It is fall");
			break;
		case 12: case 1: case 2:
			System.out.println("It is winter");
			break;
		default :
				System.out.println("invalid month");
			
		}
		
		

	}

}
