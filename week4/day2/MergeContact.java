package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();    
        driver.get("http://leaftaps.com/opentaps/control/login");       
        driver.manage().window().maximize();   
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
       //enter the username
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        
        //enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        //click on loginbutton
        driver.findElement(By.className("decorativeSubmit")).click();
        
        //click on CRM/SFA
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     
	     //click on contacts button
	     driver.findElement(By.linkText("Contacts")).click();
	     
	     //click on merge contacts
	     driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	     
	    //click on widget of from contact
	     driver.findElement(By.xpath("(//a/img)[4]")).click();
	     
	     //click on first resulting contact
	     driver.findElement(By.xpath("//div/a[text()='DemoContact2']")).click();
	     
	     //click on widget of to contact
	     driver.findElement(By.xpath("(//a/img)[5]")).click();
	     	     
	     //click on first resulting contact
	     driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[text()='DemoContact2']")).click();
	     
	     //click on merge button
	     driver.findElement(By.xpath("//a[text()='Merge']")).click();
	     
	     //accept the alert
	     Alert alert = driver.switchTo().alert();
	     alert.accept();
	     
	     //get the title of window
	     System.out.println(driver.getTitle());

	}

}
