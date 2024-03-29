package review_sessions.week8;

import java.util.Scanner;

public class ArrayWithScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter score " + (i+1));
			scores[i] = scan.nextInt();
		}
		
		//print all scores in one line
		for(int score : scores) {
			System.out.print(score + " ");
		}
		
		System.out.println();
		
		//find the max /largest score 
		int max=0;
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>max) {
				max = scores[i];
			}
		}
		
		System.out.println("Max=" + max);
		
		
		//find min score 
		int min = scores[0]; //assume first one is min
		for(int num : scores) {
			if(num<min) {
				min = num;
			}
		}
		
		System.out.println("Min=" + min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
