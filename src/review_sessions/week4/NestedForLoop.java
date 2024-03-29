package review_sessions.week4;

public class NestedForLoop {

	public static void main(String[] args) {
		
		/*
		for(int outer=1 ; outer<=5 ; outer++) {
			
			System.out.println("Outer:" + outer);
			
			for(int inner = 0 ; inner<=9 ; inner++) {
				
				System.out.print(inner + " ");
				
			}
			System.out.println();
		}
		*/
		
		
		/*
		 0    //row 0  0
		 01   //row 1  0 1 
		 012  //row 2  0 1 2 
		 0123
		 01234
		 012345
		 0123456
		 01234567
		 012345678
		 0123456789
		 012345678
		 01234567
		 0123456
		 012345
		 01234
		 0123
		 012
		 01
		 0
		 
		 
		 
		 */
		
		for(int i=0;i<=9;i++) {
			
			for(int j=0 ; j<=i ; j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		for(int i=8 ; i>=0 ; i--) {
			
			for(int j=0 ; j<=i ; j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
			
			
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
