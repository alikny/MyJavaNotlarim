package assignment_solutions.assignment06_nested_forLoop;

public class Question5 {

	public static void main(String[] args) {
		
		int row=7;
		int column=7;
		
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=column;j++) {
				
				if(j>row-i) {
					System.out.print(i);
				}else {
					System.out.print("1");
				}
				
			}System.out.println();
		}

	}

}
