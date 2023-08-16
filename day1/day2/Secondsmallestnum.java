package week1.day2;

public class Secondsmallestnum {

	public static void main(String[] args) {
		
		int[] arr= {23,45,67,32,89,22};
		int temp;
		int size=arr.length;
		
		
		
		for (int i = 0; i < size; i++) 
		{
		
			for (int j = i+1; j < size; j++) 
			{
			
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		System.out.println("Second smallest element in the given array:" +arr[0]);
		

	}

}
