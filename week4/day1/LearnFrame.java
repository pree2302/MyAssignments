package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//handle the frame
		driver.switchTo().frame(0);
		
		//click the element
		driver.findElement(By.id("Click")).click();
		
		//verification
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		//switch your control to main window
		driver.switchTo().defaultContent();
		
		//Nested frame
		//enter into parent frame
		driver.switchTo().frame(2); //using index
		
		//now enter into child frame
		driver.switchTo().frame("frame2");//using attribute
		
		//click
		driver.findElement(By.id("Click")).click();
		
		//immediate  parent
		driver.switchTo().parentFrame();
		
		
		
		
		
		
		
		
		
		

	}

}
