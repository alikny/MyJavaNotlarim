package src.review_sessions.week4;



public class StartEnd {

	public static void main(String[] args) {
		
		int start = 6;
		int end = 13;
		/*
		for(int i = start ; i<=end ; i++) {
			
			System.out.print(i + " ");
		}
		*/
		
		int n;
		for(n = end ; n < start ; n--) {
			System.out.println(n);
		}
		
		System.out.println(n);
		
		
		/*
		 if start is less than end:
		 	print all the numbers between start and end
		 if start is bigger than end
		 	print all the numbers from end to start in reverse
		 */
		
		int startPoint = 14;
		int endPoint = 20;
		
		if(startPoint<endPoint) {
			
			for(int k = startPoint ; k<=endPoint ; k++) {
				
				System.out.println(k + " ");
			}
			
		}else {
			
			for(int k = startPoint ; k>=endPoint ; k--) {
				
				System.out.println(k + " ");
				
			}
		}
		
		

	}

}
