package review_sessions.week4;

public class PrintNumberDivisibleBy7 {

	public static void main(String[] args) {
		
		int start  = 3;
		int end = 245;
		
		
		
		///print ALL numbers between these range divisible by 7   
		int counter=0;  //helper or dummy bucket
		
		
		
		
		for(int i = start ; i<=end ; i++) {
			
			if(i%5==0) {
				
				//System.out.println(i);
				counter++;
			}
			
		}
		
		System.out.println(counter);
		
		

	}

}
