package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Assignment {
	public static void main(String[] args) throws IOException {
		
	
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//search as oneplus 9 pro 
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro ", Keys.ENTER);
	
	//get the price of the first product
	String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	System.out.println("Price of the product:" +price);
	
	//Print the number of customer ratings for the first displayed product
	String ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
	System.out.println("Ratings:" +ratings);
	
	//Click the first text link of the first image
	 driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	 
	 //Take a screen shot of the product displayed
	 File source = driver.getScreenshotAs(OutputType.FILE);
	 File destination =new File("./snap/amazon1.png");
	 FileUtils.copyFile(source, destination);
	 
	 //click add to cart button
	 driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]")).click();
	 
	 WebElement carttot = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
	 System.out.println(carttot);
	 
	 if(price.equals(carttot))
	 {
		 System.out.println("The price is correct");
	 }
	 
	 driver.close();
	
	
	
	}

}
