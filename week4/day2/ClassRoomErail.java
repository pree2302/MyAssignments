package week4.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassRoomErail {

	public static void main(String[] args) {
		
        ChromeOptions option=new ChromeOptions();
        
        //To disable the notification
        option.addArguments("--disable-notifications");
        // Launch the browser
        ChromeDriver driver=new ChromeDriver(option);
        
        // Step1: Launch the URL - https://erail.in/
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Uncheck the check box - sort on date
        driver.findElement(By.id("chkSelectDateOnly")).click();
        
        // clear and type in the source station
        driver.findElement(By.id("txtStationFrom")).clear();
        driver.findElement(By.id("txtStationFrom")).sendKeys("Mas",Keys.ENTER);
        
        // clear and type in the destination station
        driver.findElement(By.id("txtStationTo")).clear();
        driver.findElement(By.id("txtStationTo")).sendKeys("CBE",Keys.ENTER);
        
        //Locate the table
        WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
	   
        //Get rowCount
        List<WebElement> rowCount = table.findElements(By.tagName("tr"));
        System.out.println(rowCount.size());
      
        //Get columncount
        List<WebElement> columnCount = table.findElements(By.tagName("th"));
	    System.out.println(columnCount.size());
	    List<String> lstTrain =new ArrayList<String>();
	    
	    Set<String> setTrain =new LinkedHashSet<String>();
	    for (int i = 2; i <rowCount .size(); i++) {
			String trainNames = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
		    //System.out.println(trainNames);
	    
			//add data into list
			lstTrain.add(trainNames);
			
			//add data into set
			setTrain.addAll(lstTrain);
	    }
	    System.out.println("List Size"+lstTrain.size());
	    
	    System.out.println("Set Size"+setTrain.size());
	   
	    //duplicate present or not
	    if(lstTrain.size()==setTrain.size()) {
	    	System.out.println("No duplicate");
	    }
	    else {
	    	System.out.println("Duplicate present");
	    }
		
		

	}

}
