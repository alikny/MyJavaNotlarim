package src.assignment_solutions.assignment05_forLoop;

public class Question6 {
	
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

	public static void main(String[] args) {
		
		int count = 8;
		int pre1 = 0, pre2 = 1;
		String print="";
		System.out.println("Fibonacci Series of "+count+" numbers:");
		
		System.out.print(pre1 + " ");
		
		for (int i = 1; i <= count; ++i){
		    
			System.out.print(pre2 + " ");
			
		/* On each iteration, we are assigning second number to the first number and 
		 * assigning the sum of last two
		 * numbers to the second number*/
			
		   int sumOfPrevTwo = pre1 + pre2;
		   pre1 = pre2;
		   pre2 = sumOfPrevTwo;
		   
		}

	}

}
