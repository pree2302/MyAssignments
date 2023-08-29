package week3_day2_assignmnts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		
		String[] str = {"HCL", "Wipro", "Aspire Systems", "CTS"};
        int length = str.length;
        
        List<String> list1 = Arrays.asList(str); 
        Collections.sort(list1); 
        
        for (int i = length - 1; i >= 0; i--) 
        { 
            System.out.print(list1.get(i));
            if (i != 0) {
                System.out.print(", ");
            }
        }
}
}
