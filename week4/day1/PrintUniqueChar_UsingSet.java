package week4.day1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PrintUniqueChar_UsingSet {
	public static void main(String[] args) {
		
	

	//Take your name as input
		String str="preethi";
		
		//convert the string into charArray
		char[] ch = str.toCharArray();
		
		//create a new set -->Hashset
		Set<Character> set=new HashSet<Character>(); 
		
		
		//add each character to the set and if it is already there, remove it
		//finally print the set
		for(int i=0; i<ch.length; i++)
		{
			set.add(ch[i]);
		}

		//now store it in list in order to compare and get the unique character
		List<Character> list=new LinkedList<Character>(set);
		
		//now compare the list with the array ch and when it was not more than one print it.
		for (int i=0; i < list.size(); i++)
		{
			int c=0;//to count the occurrence 
			for (int j=0; j< ch.length; j++)
			{
				if(list.get(i)==ch[j])
				{
					c++;
				}
			}
			if (c==1)
			{
				System.out.println(list.get(i)); //we get only unique characters
			}
		}

}
}


