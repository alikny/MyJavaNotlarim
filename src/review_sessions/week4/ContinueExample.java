package src.review_sessions.week4;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			
			if(i>=2 && i<=4) {
				
				System.out.println("Skipping-" + i);
				//continue;
				break;
			}
			
			System.out.println("i="+i);
		
		}
	

	}

}
