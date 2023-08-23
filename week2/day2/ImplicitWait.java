package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();    
        driver.get("https://login.salesforce.com/");       
        driver.manage().window().maximize();    
        
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        //enter the username
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        Thread.sleep(2000);        
        
        //enter the password
        driver.findElement(By.id("password")).sendKeys("Leaf$1234");        
        
        //click login button
        driver.findElement(By.id("Login")).click();
        Thread.sleep(2000);
        String title = driver.getTitle();     
        System.out.println(title);
        
        //Click AppLauncher
        driver.findElement(By.className("slds-icon-waffle")).click();

	}

}
