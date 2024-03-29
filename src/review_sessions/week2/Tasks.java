package review_sessions.week2;

public class Tasks {

	public static void main(String[] args) {
		
		int pies=10,people=4;
		double piesPerson;
		
		piesPerson = pies/people; //int/int = int  = > 10/4 =  2
		System.out.println(piesPerson); // int to double 
		
		piesPerson = pies / (double)people; // int / double = double  = > 10 / 4.0
		System.out.println(piesPerson);
		
		piesPerson = (double)(pies/people); // (double)(int/int) = > (double)2
		System.out.println(piesPerson);
		
		piesPerson = (double)pies / people; // double / int = double = > 10.0/4
		System.out.println(piesPerson);
		
		double result = (1/2)*2; //(int/int) * int = > int * int = > int = > 0 * 2  = 0
		System.out.println(result);
		

	}

}
