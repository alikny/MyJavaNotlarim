package review_sessions.week2;

public class TypeCasting {

	public static void main(String[] args) {
		
		int i = 100;
		long l = i; //implicit casting 
		float f = l; //implicit casting 
		
		System.out.println("Int value:" + i);
		System.out.println("Long value:" + l);
		System.out.println("Float value:" + f);
		
		System.out.println("-------------");
		
		double d = 100.04;
		long l2 = (long)d; 
		int i2 = (int)l2;
		System.out.println(i2);
		
		double d2 = 120.34;
		int i3 = (short)d2;
		
	
		
		
		

	}

}
