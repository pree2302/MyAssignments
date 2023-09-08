package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveDuplicates_UsingSet_Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones", Keys.ENTER);

		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        
		//after convert string into Integer need to change the List Generic type
		List<Integer> sortPrice = new ArrayList<Integer>();

		for (int i = 0; i < price.size(); i++) {
			String text = price.get(i).getText();
			
            //replace the , by empty
			String replaceAll = text.replaceAll("[^0-9]", "");
			
			//convert string into integer
			int parseInt = Integer.parseInt(replaceAll);
			
			//add the converted data to new list
			sortPrice.add(parseInt);

		}
		//Arrange the list 
		Collections.sort(sortPrice);
		
		//print the list
		System.out.println(sortPrice);
		
		//print lowest value,0 index return lowest result
		System.out.println(sortPrice.get(0));
		
		//set to remove duplicates, convert list into set
		Set<Integer> uniqueSet = new LinkedHashSet<Integer>(sortPrice);
		
		//get the size of set
	    System.out.println(uniqueSet.size());
		
		System.out.println(uniqueSet);
		
		
		
	}
	
}

	


