package week3_day1_assignmnts;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String test="changeme";
		
		
		char[] ch=test.toCharArray();
		
		for(int i=0; i<ch.length-1; i++)
		{
				if(i % 2 ==0)
				{
					ch[i] = Character.toUpperCase(ch[i]);
				}
				
		}
		System.out.println(new String(ch));
	}

}
