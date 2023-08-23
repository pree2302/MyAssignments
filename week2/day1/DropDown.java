package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();    
        driver.get("https://www.leafground.com/select.xhtml ");       
        driver.manage().window().maximize();   
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        //Select UI Automation tool
        WebElement uitool = driver.findElement(By.className("ui-selectonemenu"));
        Select UI=new Select(uitool);
        UI.selectByVisibleText("Puppeteer");
        
        
       //Choose the course
        driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
        
        
        //Choose country
        driver.findElement(By.xpath("//label[text()='Select Country']")).click();
        driver.findElement(By.xpath("//li[text()='India']")).click();
        
        
        //Choose language
        driver.findElement(By.xpath("//label[text()='Select Language']")).click();
        driver.findElement(By.xpath("//li[text()='Tamil']")).click();
        
        
        //Confirm city
        driver.findElement(By.xpath("//label[text()='Select City']")).click();
        driver.findElement(By.xpath("//li[text()='Bengaluru']")).click();
        
        
        //select 'Two'
        driver.findElement(By.xpath("//label[text()='Select Values']")).click();
        driver.findElement(By.xpath("//li[text()='இரண்டு']")).click();
        
        
        String Title=driver.getTitle();
        System.out.println("Title of the Window:" +Title);
        
        
        Thread.sleep(2000);
        driver.close();
       
        
       
        
        

	}

}
