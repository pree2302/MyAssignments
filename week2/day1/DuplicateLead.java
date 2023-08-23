package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
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
	     
	    //click on leads
	     driver.findElement(By.linkText("Leads")).click();
	     
	     //clcik on create lead
	     driver.findElement(By.linkText("Create Lead")).click();
	     
	   //enter company name
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
	     
	     //enter firstname
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preethi");
	     
	     //enter lastname
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raja");
	     
	     //enter firstname(local)
	     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Preeti");

	     //enter dept field
	     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non IT");
	     
	     //enter description field
	     driver.findElement(By.name("description")).sendKeys("From July 2023 batch");
	     
	     //enter email
	     driver.findElement(By.name("primaryEmail")).sendKeys("pree2302@yahoo.com");
	     
	     //click on create lead button
	     driver.findElement(By.name("submitButton")).click();
	     
	     //get the title of the window
	     String title=driver.getTitle();
	     System.out.println("Title of the Window: " +title);
	     
	     //click on duplicate button
	     driver.findElement(By.linkText("Duplicate Lead")).click();
	     
	     //Clear the CompanyName Field using .clear() And Enter new CompanyName
	     driver.findElement(By.id("createLeadForm_companyName")).clear();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
	     
	     //Clear the FirstName Field using .clear() And Enter new FirstName
	     driver.findElement(By.id("createLeadForm_firstName")).clear();
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PreethiMuruge");
	     
	     //click on create lead button
	     driver.findElement(By.name("submitButton")).click();
	     
	     //get the title of the window
	     String title1=driver.getTitle();
	     System.out.println("Title of the Window: " +title1);
	     
	     Thread.sleep(1000);
	     driver.close();
	
	}

}
