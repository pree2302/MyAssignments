package week1.day2;
import java.util.Arrays;

public class Missingelementinanarray {

	public static void main(String[] args) {
	
		int[] arr= {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		for (int i = arr[0]; i < arr.length; i++)
		{
			if(i!=arr.length)
			{
				System.out.println(arr);
			}
			break;
		}

	}

}
