package Daily_Challenge;

public class RetunLastWrd_String {

	public static void main(String[] args) {

		String str1="Hello World";		
		String str1len =str1.substring(6, 11);
		System.out.println("The Last Word is " +str1len+ " with length " +str1len.length());
		
		
		String str2="fly me to the moon";
		String str2len=str2.substring(14, 18);
		System.out.println("The Last Word is " +str2len+ " with length " +str2len.length());
		
		
		String str3="luffy is still joyboy";
		String str3len=str3.substring(15, 21);
		System.out.println("The Last Word is " +str3len+ " with length " +str3len.length());
		
	}

}
