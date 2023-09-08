package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
		//Locate the webelement
        WebElement drag = driver.findElement(By.id("form:conpnl_header"));
        Point location = drag.getLocation();
        System.out.println(location);

        //create obj for Action
		Actions builder =new Actions(driver);
		builder.dragAndDropBy(drag, 100, 0).perform();
		
		//verification
		System.out.println(drag.getLocation());
		System.out.println(drag.getLocation().getX());
		
		
		
		
		

	}

}
