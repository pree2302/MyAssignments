package week3.day2.assignmnts;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		System.out.println("Duplicate Values are:");
		for (int i=0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[i]==arr[j])
				{
					
					System.out.println(arr[i]);
				}
			}
		}
		

	}

}
