package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> companyName =new TreeSet<String>();
		//Set<String> companyName =new HashSet<String>();
		//Set<String> companyName =new LinkedHashSet<String>();
		
		//add element in set
		companyName.add("Testleaf");
		companyName.add("Qeagle");
		companyName.add("hp");
		companyName.add("Amazon");
		companyName.add("CTS");
		companyName.add("hp");
		companyName.add("Amazon");
		
		//print my set
		System.out.println(companyName);
		
		//get implementation
		//System.out.println(companyName.get);
		
		//remove
		System.out.println(companyName.remove("hp"));
		System.out.println(companyName);
		
		//check the element
		System.out.println(companyName.contains("CTS"));
		
        //clear
		//companyName.clear();
		System.out.println(companyName);
		
		//length of set
		System.out.println(companyName.size());
		
		//for each
		for (String output : companyName) {
			System.out.println(output);
		}
		
		//set into list, list  into set 
		List<String> lstName=new ArrayList<String>(companyName);
		System.out.println(lstName);
		
	}

}
