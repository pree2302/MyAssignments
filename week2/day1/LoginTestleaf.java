package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestleaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver =new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the window
		driver.manage().window().maximize();
		//findElement Enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Thread.sleep(2000);
		//findElement Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//findElement click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//verify the page is open
		//To get the title of the page
		Thread.sleep(2000);
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
	     //Click CreateLead Button
         driver.findElement(By.name("submitButton")).click();
         //verify my created or not
         String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println(text);
		 driver.close();
	}

}
