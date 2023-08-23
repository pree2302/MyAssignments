package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver =new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();		
		
		//Loginpage
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Thread.sleep(2000);
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		
		//click submit button
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		
		//get the title of the window to check whether the page is loaded succesffully
		String title = driver.getTitle();     //assign local variable ctrl+2
		System.out.println(title);
		
		
		// Click on CRM/SFA
	     driver.findElement(By.linkText("CRM/SFA")).click();
		//click on lead
	     driver.findElement(By.linkText("Leads")).click();
	     //click createLead
	     driver.findElement(By.partialLinkText("Create")).click();
	     // Enter Company name
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	     // Enter FirstName
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preethi");
	     //Enter Lasstname
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");
	     
	     
	     //Dropdown
	     	
	     	// Step:1 Locate the dropdown web element
	        WebElement tools = driver.findElement(By.id("createLeadForm_dataSourceId"));
	        
	        // Step:2 Instantiate Select class
	        Select drop1 = new Select(tools);
	        
	        // Step:3 Call select class method to pick the option from dropdown
	        
	        //drop1.selectByIndex(2);
	        
	        drop1.selectByVisibleText("Conference");
	        
	        //drop1.selectByValue("ui-selectonemenu-label");
	     
	     
	     
	     //Click CreateLead Button
         driver.findElement(By.name("submitButton")).click();
         
         
         //verify my created or not
         String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println(text);
		 driver.close();

	}

}
