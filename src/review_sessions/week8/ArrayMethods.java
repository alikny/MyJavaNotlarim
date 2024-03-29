package review_sessions.week8;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		
		int[] nums1 = {4,5,2,10};
		int[] nums2 = {4,5,2,10};
		int[] nums3 = {10,4,5,2};
		int[] nums4 = {4,5,2,10,90};
		int[] nums5 = {54,23,54,123,54};
		
		System.out.println("nums1 == num2 >" + (nums1==nums2));
		System.out.println("nums1 == num2 >" + Arrays.equals(nums1, nums2));
		
		boolean bl1 = Arrays.equals(nums2, nums3);
		System.out.println("nums2 == num3 >" + bl1);
		
		System.out.println();
		
		Arrays.sort(nums2);
		Arrays.sort(nums3);
		
		System.out.println("After sorting:nums2 == num3 >" + Arrays.equals(nums2, nums3));
		
		System.out.println("--------");
		
		String[] cars1 = {"Toyota","Honda","Tesla","BMW","Dodge"};
		String[] cars2 = {"Toyota","Honda","Tesla","BMW","Dodge"};
		String[] cars3 = {"toyota","honda","tesla","bmw","dodge"};
		String[] cars4 = {"Toyota","Honda","Tesla"};
		
		System.out.println(Arrays.toString(cars1).toUpperCase());
		System.out.println(Arrays.toString(cars1));
		
		System.out.println("--------");
		
		String[] newCars = Arrays.copyOf(cars1, 4);
		System.out.println(Arrays.toString(newCars));
		
		System.out.println("--------");
		
		String[] companies = {"Cybertek","Capital One","Freddie Mac" ,"apple" ,"Google","Verizon","100"};
		Arrays.sort(companies);
		
		System.out.println(Arrays.toString(companies));
		
		
		
		
		
		
		
		
		
		
		

	}

}
