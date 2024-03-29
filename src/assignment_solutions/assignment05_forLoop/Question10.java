package assignment_solutions.assignment05_forLoop;

public class Question10 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 7; i++) { //outer loop for 7 rows
			   
		    for(int j = 1; j <= i; j++) { //inner loop
		        
		    	System.out.print(i);
		    }
		    System.out.println();
		}

	}

}
