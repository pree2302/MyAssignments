package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
	     
		//click on Accounts button
	     driver.findElement(By.linkText("Accounts")).click();
	     
	     //click on create account
	     driver.findElement(By.linkText("Create Account")).click();
	     
	     //enter accountname
	     driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
	     
	     //enter description
	     driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester");
	     
	     //enter localname field
	     driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Debit Account");
	     
	     //enter sitename field
	     driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("Chennai");
	    
	     
	     
	     
	     //enter annualrevenue field
	     driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("25000");
	     
	   //select industry 
	     WebElement indus = driver.findElement(By.name("industryEnumId"));
	     Select opts=new Select(indus);
	     opts.selectByVisibleText("Computer Software");
	     
	   //select ownership
	     WebElement own = driver.findElement(By.name("ownershipEnumId"));
	     Select owner=new Select(own);
	     owner.selectByVisibleText("S-Corporation");
	     
	     //select source
	     WebElement sou = driver.findElement(By.id("dataSourceId"));
	     Select source=new Select(sou);
	     source.selectByValue("LEAD_EMPLOYEE");
	     
	     //select marketing campaign
	     WebElement mark = driver.findElement(By.id("marketingCampaignId"));
	     Select camp=new Select(mark);
	     camp.selectByIndex(6);
	     
	    //select state or province
	     WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
	     Select prov=new Select(state);
	     prov.selectByValue("TX");
	     
	     //click on createaccount 
	     driver.findElement(By.xpath("//input[@value='Create Account']")).click();
	     
	     
	     Thread.sleep(1000);
	     
	     driver.close();
	     
	     
	     
	     
	     

	}

}
