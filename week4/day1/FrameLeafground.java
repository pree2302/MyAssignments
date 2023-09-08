package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLeafground {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		

		//Click Me (Inside frame)		
		//firstly, need to switch it to the frame and select it.
		driver.switchTo().frame(0);
		
		//secondly, click on "click me" inside the frame
		WebElement firstFrame = driver.findElement(By.id("Click"));
		firstFrame.click();
		System.out.println(firstFrame.getText());
		
		//switch your frame to control window //come out of the frame
		driver.switchTo().defaultContent();
		
		
		
		
		
		//Click Me (Inside Nested frame)
		//we need to switch it to the frame and select it.
		driver.switchTo().frame(2);
		
		//enter into another frame
		driver.switchTo().frame("frame2");
		
		//click on "Click Me" inside that frame
		WebElement secondFrame = driver.findElement(By.id("Click"));
		secondFrame.click();
		System.out.println(secondFrame.getText());
		
		//switch your frame to control window  //i.e., come out of the frame
		driver.switchTo().defaultContent();
		
		
		
		
		
		//How many frames in this page?
		//get using tagname
		List<WebElement> outerFrame = driver.findElements(By.tagName("iframe"));
		int count = outerFrame.size();
		System.out.println("Total no. of Frames:" +count);
		int count1=0;
		count1 = count + outerFrame.size();
		
		//entering into each frame and counting the no. of frames
		for (int i = 0; i < outerFrame.size(); i++) {
			driver.switchTo().frame(i);
			List<WebElement> innerFrame = driver.findElements(By.tagName("iframe"));
			count1  = count + innerFrame.size();
			driver.switchTo().defaultContent();
		}
		System.out.println(count1);
		
		
		
	}

}
