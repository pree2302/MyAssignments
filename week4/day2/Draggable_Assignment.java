package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable_Assignment {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.switchTo().frame(0);
		//locate the element
		WebElement drag = driver.findElement(By.id("draggable"));
		
		Point location = drag.getLocation();
		System.out.println(location);
       
		//actions class
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 100, 0);
		
		//verification
		System.out.println(drag.getLocation());
		System.out.println(drag.getLocation().getX());
		
		
		

	}

}
