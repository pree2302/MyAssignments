package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click open 
		driver.findElement(By.xpath("//span[text() = 'Open']")).click();
		
		
		//step1:
		//get the title of opened window
		String openwindowtitle = driver.getTitle();
		System.out.println(openwindowtitle);
		
		//retrieving the current open window handle
		System.out.println(driver.getWindowHandle());
		
		
		//step2:
		//retrieving the multiple window handle
		Set<String> windowHandles = driver.getWindowHandles();
		//convert the set into list
		List<String> childwindow= new ArrayList<String>(windowHandles);
		//switch the ctrl to the childwindow
		driver.switchTo().window(childwindow.get(1));
		
		//size of the window
		System.out.println(windowHandles.size());
		
		//print the title of childwindow
		System.out.println(driver.getTitle());
		 
		//how to close the current opened window
		driver.close();
		driver.switchTo().window(childwindow.get(0)).getTitle();//passing ctrl to the parent window
		
	     //to close all opened windows
		driver.quit();
		
		


	}

}
