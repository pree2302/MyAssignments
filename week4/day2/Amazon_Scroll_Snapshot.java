package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Amazon_Scroll_Snapshot {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones", Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		// step 1:Get the window Handles
		Set<String> windowHandles = driver.getWindowHandles();
		
		// step 2:Convert the set to list
		List<String> lstWindow = new ArrayList<String>(windowHandles);
		
		// step :switch the driver focus to new open window
		driver.switchTo().window(lstWindow.get(1));
		
		//scroll the element
		WebElement scroll = driver.findElement(By.xpath("//span[text()='Sponsored']"));
		Actions builder =new Actions(driver);
		builder.scrollToElement(scroll).perform();
		
		//step 1:take a snapshot
				File source = driver.getScreenshotAs(OutputType.FILE);
				//Create folder to save the img file	
				File destin =new File("./snap/amazon.png");
				//Merge source and destination
				FileUtils.copyFile(source, destin);
				
		// Get the title of the page
		System.out.println(driver.getTitle());
		
		// print the 5,997 ratings from open window
		String text = driver.findElement(By.id("acrCustomerReviewText")).getText();
		System.out.println(text);


	}

}
