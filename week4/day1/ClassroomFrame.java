package week4.day1;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomFrame {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//handle the frame
		driver.switchTo().frame("iframeResult");
		
		//click on Try it
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//handle the alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//getText
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);


	}

}
