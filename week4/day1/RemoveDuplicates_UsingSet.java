package week4.day1;

import java.util.*;

public class RemoveDuplicates_UsingSet {

	public static void main(String[] args) {
		
		//input text
		String text="We learn java basics as part of java sessions in java week1";
		
		//initialise the tree set with character data type
		Set<Character> data = new TreeSet<Character>();
		
		//initialize the loop iteration from 0 to the length of the text
		for(int i=0; i<text.length(); i++)
		{
			//add the input to set
			data.add(text.charAt(i));
		}
		
		//iterate with for loop to get the expected output
		for(Character c : data)
		{
			System.out.print(c.toString());
		}
	}
}
