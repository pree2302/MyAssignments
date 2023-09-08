package week4.day2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.*;
public class Snapshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//step 1:take a snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//Create folder to save the img file	
		File destin =new File("./snap/amazon.png");
		//Merge source and destination
		FileUtils.copyFile(source, destin);

	}

}
