package review_sessions.week7;

public class String_SubString {

	public static void main(String[] args) {
		
		String word = "java is fun";
		
		System.out.println(word.substring(5));
		
		System.out.println(word.substring(0,4)); 
		
		System.out.println(word.substring(5,7));
		
		System.out.println(word.substring(3,3));
		
		//how to get a particular substring
		String s1 = "the best Java Core course in Europe is Cybertek.";
		String myTarget = "Europe";
		
		int beginIndex = s1.indexOf(myTarget); //29
	
		int endIndex = beginIndex + myTarget.length(); //   29 + 6 = 35
		
		System.out.println(s1.substring(beginIndex, endIndex)); // (29,35)
		
		//how to find all substrings of a given String 
		String s2 = "Cybertek";
		
		for(int i=0;i<s2.length();i++) {
			for(int j=i+1;j<=s2.length();j++) {
				System.out.println(s2.substring(i,j));
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
