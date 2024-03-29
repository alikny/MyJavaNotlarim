package review_sessions.week2;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		
		int x=2;
		
		int y = x++;
		
		//int y = ++x;
		
		
		System.out.println(y);
		System.out.println(x);
		
		int a = 5;
		int b = a*5 - a++; // 5*5 - 5 = 20
		//a =6
		
		System.out.println(a);
		System.out.println(b);
		
		a=5;
		b = a-- + ++a + ++a - a--;  
		
		//memory  : 5 - > 4 - > 5 - > 6 - > 5
		//result  : 5 + 5 + 6 - 6 = 10
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(!!true);
		
		
		

	}

}
