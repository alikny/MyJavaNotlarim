package review_sessions.week7;

public class String_Contains {

	public static void main(String[] args) {
		
		String str = "Amazon Website";
		
		System.out.println(str.contains("Amazon"));

		
		if(str.contains("Web")) {
			System.out.println("There is web in the string");
		}else {
			System.out.println("There is no web in the string");
		}
		
		//TC123
		String title = "Porsche HOME - Porsche USA";
		if(title.contains("Porsche")) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
		
		String email = "employee@hotmail.com";
		if(email.contains("@gmail")) {
			System.out.println("Google Account");
		}else if(email.contains("@yahoo")) {
			System.out.println("Yahoo Account");
		}else if(email.contains("@hotmail")) {
			System.out.println("Hotmail Account");
		}else {
			System.out.println("Some Other Account!");
		}
		
		
		
		
	}

}
