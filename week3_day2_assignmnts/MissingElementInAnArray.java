package week3_day2_assignmnts;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i+1 != arr[i])
			{
				System.out.println("Missing Element in An Array: "+(i+1));
				break;
			}
	
			
		}
		
		
	}
}


