package review_sessions.week5;

public class Calculator {

	public static void main(String[] args) {
		
		int result = add(10, 20);
		System.out.println(result);
		
		int x = subtract(25, 5);
		System.out.println(x);
		
		System.out.println(add(5, 12) + subtract(6, 9) * 5 + add(10, 7));
		
	}
	
	public static int add(int num1,int num2) {
		
		int result = num1 + num2;
		
		return result;
	}
	
	public static int subtract(int num1,int num2) {
		
		int result = num1 - num2;
		
		return result;
	}

}
