package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable_KeyboardEvents {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //handle the frame
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		
	//individual click
		Actions builder =new Actions(driver);
		//builder.click(item1).click(item4).click(item5).click(item6).perform();		
		
		//Multiple select using mouse action
		//builder.clickAndHold(item1).moveToElement(item6).release().perform();
		
		//keys action
		builder.keyDown(Keys.CONTROL).click(item1).click(item4).click(item6).keyUp(Keys.CONTROL).perform();
		
		

	}

}
