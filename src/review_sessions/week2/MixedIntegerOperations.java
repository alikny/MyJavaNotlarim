package review_sessions.week2;

public class MixedIntegerOperations {

	public static void main(String[] args) {
		
		byte b = 32;
		char c = 'z';
		short s = 256;
		int i = 10_000;
		float f =3.5f;
		double d=0.5;
		
		double v = (d*i) + (f* -b) - (c/s);
				//(double*integer) + (float * int) - (int / int)
				//double + float - int
		        //double - int
		        //double
		System.out.println(v);
		
		byte s1 = 25;
		byte h1 = 30;
		byte result = (byte)(s1+h1);
		
		

	}

}
