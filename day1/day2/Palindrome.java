package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
	
		int num=34343;
		int sum=0;
		int temp,rem;
		
		temp=num;
		for (sum = 0; num >0; num/=10)
		{
			rem=num%10;
			sum=(sum*10)+rem;
		}
		
		if (temp==sum)
		{
		System.out.println("Given number is a Palindrome.");
		} 
		else 
		{
		System.out.println(" Given number is not a Palindrome.");
		}
	}

}
