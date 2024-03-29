package review_sessions.week3;

public class NestedIf {

	public static void main(String[] args) {
		
		int n1=100;
		int n2=20;
		int n3=15;
		int largest;
		
		if(n1>n2) {
			
			if(n1>n3) { //dependent on condition line-12 
				
				largest = n1;
			}
			
		}else {
			
			if(n2>n3) {
				
				largest=n2;
				
			}else {
				
				largest=n3;
			}
			
		}
		
		//System.out.println(largest);
		


	}

}
