package assignment_solutions.assignment05_forLoop;

public class Question3 {

	public static void main(String[] args) {
		
		int counter = 0;
		
		for(int i = 5; i <= 50; i++) {
			
			if(i % 2 == 0) {
				
				counter++;
				
			}
			
		}
		
		System.out.println("There are " + counter + " even numbers between 5 and 50.");

	}

}
