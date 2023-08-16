package week1.day2;

public class Convertnegativetopositive {
	
	public static void main(String[] args) {
		
		int number=-40;
		
		if (number<0)
		{
			System.out.println(number + "  is negative.  ");
		}
		
		number = number *-1;
		
		System.out.println("Conversion of negative to positive:" +number);
	}

}
