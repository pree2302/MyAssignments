package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
	     
	     //select source
	     WebElement sou = driver.findElement(By.id("createLeadForm_dataSourceId"));
	     Select source=new Select(sou);
	     source.selectByVisibleText("Employee");
	     
	     //select marketing campaign id
	     WebElement mark = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	     Select camp=new Select(mark);
	     camp.selectByValue("9001");
	     
	     //select ownership
	     WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	     Select owner=new Select(own);
	     owner.selectByIndex(5);
	     
	     //select countryfield
	     WebElement count = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	     Select field=new Select(count);
	     field.selectByVisibleText("India");
	     
	     //click on create lead button
	     driver.findElement(By.name("submitButton")).click();
	     
	     //get the title of the window
	     String title=driver.getTitle();
	     System.out.println("Title of the Window: " +title);
	     
	     
	     
	     Thread.sleep(1000);
	     driver.close();
	     

	}

}
