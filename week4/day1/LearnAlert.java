package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//simple alert:
		
		//find the element and click show
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		
		//handle the alert
		Alert alert = driver.switchTo().alert();//ctr+2
		
		//print the information from the alert box
		System.out.println(alert.getText());
		alert.accept();
		
		//verification
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		
		
		//confirmation alert:
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//handle the alert
		Alert alert2 = driver.switchTo().alert();
		//print the msg in alert box
		System.out.println(alert2.getText());
		alert2.dismiss();
		//verification
		String text2 = driver.findElement(By.id("result")).getText();
		System.out.println(text2);

		
		
		
		//prompt alert:
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//handle the alert
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Princila");
		System.out.println(alert3.getText());
		alert3.accept();
		
	
		
		
		
		
		

	}

}
