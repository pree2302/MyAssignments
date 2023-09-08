package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa_Assignment {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//2) Mouseover on Brands and Search L'Oreal Paris
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brands).perform();
		
		
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		
		
		//3) Click L'Oreal Paris
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		
		
		//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		System.out.println("Title of the window:" +driver.getTitle());
		
		//5) Click sort By and select customer top rated
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		
		
		
		//6) Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//div[@class='filter-open css-1gdff5r']/span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
		
		//7) Click->Concern->Color Protection
		driver.findElement(By.xpath("//div[@class='filter-open css-1gdff5r']/span[text()='Concern']")).click();
		driver.findElement(By.xpath("(//label[@class='control control-checkbox'])[11]")).click();
		
		//8)check whether the Filter is applied with Shampoo
		String text = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]")).getText();
		System.out.println("Filter is applied with :" +text);
		
		//9) Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		
		//10) GO to the new window and select size as 180ml
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		
		//11) Print the MRP of the product
		String price = driver.findElement(By.className("css-1jczs19")).getText();
		System.out.println("Price of the product:" +price);
		
		//12) Click on ADD to BAG
		driver.findElement(By.xpath("(//span[@class='btn-text'])[1]")).click();
		
		
		//13) Go to Shopping Bag 
		
		
		//14) Print the Grand Total amount
		//15) Click Proceed
		//16) Click on Continue as Guest
		//17) Check if this grand total is the same in step 14
		//18) Close all windows

	}

}
