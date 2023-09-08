package week4.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC_WindowHandle {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		

	}

}
