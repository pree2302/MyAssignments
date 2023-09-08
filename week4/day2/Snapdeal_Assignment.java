package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal_Assignment {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. Go to Mens Fashion
		WebElement mensfashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mensfashion).perform();
		
		//3. Go to Sports Shoes
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		
		//4. Get the count of the sports shoes
	    String count = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
	    System.out.println("Sports Shoes Count:" +count);
		
		
		//5. Click Training shoes
	    driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
	    
	    
		//6. Sort by Low to High
	    driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
	    driver.findElement(By.xpath("//ul/li[@data-sorttype='plth']")).click();
	    
	    
	    
		
	    
	    
	    		

	}

}
