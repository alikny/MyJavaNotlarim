package src.assignment_solutions.assignment04_selection_statements;

public class Question3 {

	public static void main(String[] args) {
		
		int year = 2000;

		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
		    System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is NOT a leap year");
		}

	}

}
