package review_sessions.week8;

import java.util.Arrays;

public class SentenceSplit {

	public static void main(String[] args) {
		
		String sentence = "Java is fun";  //delimeter
		
		//find out how many words in the sentence and print
		
		String[] words = sentence.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		
		String[] words2 = words[0].split("a");
		System.out.println(Arrays.toString(words2));
		
		String results = "About 117,000,000 results (1.33 seconds)";
		String[] googleArr = results.split(" ");
		System.out.println(Arrays.toString(googleArr));
		
		
		/*
		for(String item : googleArr) {
			System.out.println(item);
		}
		*/
		

		
		
		
		
		
		
		

	}

}
