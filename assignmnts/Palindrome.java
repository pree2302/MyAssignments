package week3.day2.assignmnts;

public class Palindrome {

	public static void main(String[] args) {
		
		String str="Madam";
		str=str.toLowerCase();
		
		
		String rev="";
		
		for (int i = str.length() - 1; i >= 0; i--) 
		{
            rev = rev + str.charAt(i);
        }
		
		if(str.equals(rev))
		{
			System.out.println(str+ " Is a Palindrome String");
		}
		else
			System.out.println(str+ " Not A Palindrome String");

	}

}
