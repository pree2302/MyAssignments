package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws IOException {
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       //Locate the webelement
		WebElement makeup = driver.findElement(By.xpath("(//a[text()='makeup'])[2]"));
		//create obj for Action
		Actions builder =new Actions(driver);		
		builder.moveToElement(makeup).perform();
		
		//verification
		//snapshot
		//step 1:take a snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//Create folder to save the img file	
		File destin =new File("./snap/makeup.png");
		//Merge source and destination
		FileUtils.copyFile(source, destin);
		 
		
		
		
		
		
	}

}
