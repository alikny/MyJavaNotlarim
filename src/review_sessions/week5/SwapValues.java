package review_sessions.week5;

public class SwapValues {

	public static void main(String[] args) {
	
		
		swapNumbers(10, 20);
		
		swapNumbers(100, 250);
	}
	
	
	public static void swapNumbers(int number1,int number2) {  //10 20 
		
		number2 = number1 + number2;  //10 + 20 = 30
		number1 = number2 - number1;  //30 - 10 = 20
		number2 = number2 - number1;  //30 - 20 = 10
		
		System.out.println("number1:" + number1);
		System.out.println("number2:" + number2);
		
	}

}
