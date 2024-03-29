package review_sessions.week3;

public class CheckPinCode {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Bank of America");
		
		int secretPinCode = 2345;
		int inputPinCode = 2;
		
		if(inputPinCode == secretPinCode) {  //if(2345 == 2)
			
			System.out.println("Welcome to your account!");
		
		}else {
			
			System.out.println("Invalid Pincode");
			
		}
		
		System.out.println("Thank you for you business");
		
	}



}
