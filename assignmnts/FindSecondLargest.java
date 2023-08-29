package week3.day2.assignmnts;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		int count=6;
		
		System.out.println("The second largest element in the given array: ");
		System.out.println(data[count-2]); 

	}

}
