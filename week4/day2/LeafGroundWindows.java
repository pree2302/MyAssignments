package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWindows {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		       //click open 
		        driver.findElement(By.xpath("//span[text() = 'Open']")).click();
		
		        //step1:
				//get the title of opened window
				String openwindowtitle = driver.getTitle();
				System.out.println(openwindowtitle);
				
				//retrieving the current open window handle
				System.out.println(driver.getWindowHandle());
				
				
				//step2:
				//retrieving the multiple window handle
				Set<String> windowHandles = driver.getWindowHandles();
				//convert the set into list
				List<String> childwindow= new ArrayList<String>(windowHandles);
				//switch the ctrl to the childwindow
				driver.switchTo().window(childwindow.get(1));
				
				//size of the window
				System.out.println(windowHandles.size());
				
				//print the title of childwindow
				System.out.println(driver.getTitle());
				
				
				//how to close the current opened window
				driver.close();
				//passing ctrl to the parent window
				driver.switchTo().window(childwindow.get(0)).getTitle();
				
				System.out.println("-----------------------------");
				
				
				
				
			
				//click open multiple
				driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
				
				//step1: get the title of the window
				System.out.println(driver.getTitle());
				driver.getWindowHandle();
				
				//step2: 
				Set<String> windowHandles2 = driver.getWindowHandles();
				List<String> lstwindow=new ArrayList<String>(windowHandles2);
				driver.switchTo().window((lstwindow.get(2)));
				
				
				System.out.println(driver.getWindowHandle());
				System.out.println(windowHandles2.size());
				System.out.println(driver.getTitle());
				
				driver.close();
				driver.switchTo().window(lstwindow.get(1)).getTitle();
				
				System.out.println("-----------------------------");
				
				
				
				
				
			  /*  //click close windows
				driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
				
				//step1: get the title of the window
				System.out.println(driver.getTitle());
				driver.getWindowHandle();
				
				//step2: 
				Set<String> windowHandles3 = driver.getWindowHandles();
				List<String> lstwindow1=new ArrayList<String>(windowHandles3);
				driver.switchTo().window((lstwindow1.get(3)));
				
				
				System.out.println(driver.getWindowHandle());
				System.out.println(windowHandles3.size());
				System.out.println(driver.getTitle());
				
				driver.close();
				driver.switchTo().window(lstwindow1.get(2)).getTitle();
				
				System.out.println("-----------------------------");*/
				
				
				//click close windows
				driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
				
				//step1: get the title of the window
				System.out.println(driver.getTitle());
				driver.getWindowHandle();
				
				//step2: 
				Set<String> windowHandles4 = driver.getWindowHandles();
				List<String> lstwindow2=new ArrayList<String>(windowHandles4);
				driver.switchTo().window((lstwindow2.get(4)));
				
				
				System.out.println(driver.getWindowHandle());
				System.out.println(windowHandles4.size());
				System.out.println(driver.getTitle());
				
				driver.close();
				driver.switchTo().window(lstwindow2.get(3)).getTitle();
				
				System.out.println("-----------------------------");

				
				driver.quit();
				
	}

}
