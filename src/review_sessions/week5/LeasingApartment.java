package review_sessions.week5;

public class LeasingApartment {

	public static void main(String[] args) {
		
		
		int monthlyIncome = 3000;
		
		double net = monthlyIncome - (calculateRent(2) + calculateExpense(2));
		
		if(net<1000) {
			System.out.println("Enroll Cybertek");
		}else {
			System.out.println("Enjoy with the life");
		}


	}
	
	public static int calculateRent(int room) {
		
		int rent=0;
		
		if(room==1) {
			rent=1100;
		}else if(room==2) {
			rent=1850;
		}else if(room==3) {
			rent=2550;
		}
		
		return rent;
		
	}
	
	public static double calculateExpense(int room) {
		
		return calculateRent(room) * 0.5;
		
	}
	

}
