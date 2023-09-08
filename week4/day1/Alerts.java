package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//alert(simple dialog)
		System.out.println("------------Alert (Simple Dialog)--------------");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert simplealert = driver.switchTo().alert();
		System.out.println(simplealert.getText());
		simplealert.accept();
		//to verify - print the msg
		System.out.println(driver.findElement(By.id("simple_result")).getText());
		
		System.out.println();
		
		//alert(confirm dialog)
		System.out.println("--------Alert (confirm dialog)-----------------");
		driver.findElement(By.xpath("(//button/span[text()='Show'])[2]")).click();
		Alert confirmalert = driver.switchTo().alert();
		System.out.println(confirmalert.getText());
		confirmalert.dismiss();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		System.out.println();
		
		//sweet alert(simple dialog)
		System.out.println("-------------Sweet Alert (Simple Dialog)--------");
		driver.findElement(By.xpath("(//button/span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class ='ui-button-text ui-c'])[4]")).click();
		//driver.findElement(By.xpath("//p[contains(text(), 'You have clicked')]")).getText();
		
		System.out.println();
		
	/*
		//sweet modal dialog
		 * System.out.println("------------sweet modal dialog---------------");
		driver.findElement(By.xpath("(//button/span[text()='Show'])[4]")).click();
		driver.findElement(By.xpath("(//a/span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		*/
		
		System.out.println();
		
		//alert (prompt dialog)
		System.out.println("----------Alert (Prompt Dialog)------------------");
		driver.findElement(By.xpath("(//button/span[text()='Show'])[5]")).click();
		Alert promptalert = driver.switchTo().alert();
		System.out.println(promptalert.getText());
		promptalert.sendKeys("Preethi");
		promptalert.accept();
		
		System.out.println();
		
		
		//sweet alert (confirmation)
		System.out.println("---------Sweet Alert (Confirmation)-----------------");
		driver.findElement(By.xpath("//button/span[text()='Delete']")).click();
		driver.findElement(By.xpath("//button/span[text()='Yes']")).click();
		
		
		System.out.println();
		
		
		//minimize and maximize
		System.out.println("----------Minimize and Maximize-------------------");
		driver.findElement(By.xpath("(//button/span[text()='Show'])[6]")).click();
		driver.findElement(By.xpath("(//a/span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		
		
		
		
	}

}
