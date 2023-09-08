package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//step 1 locate the table
		WebElement table = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table"));
		
		//get the row count using list
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));

		//print the row count
		System.out.println(rowCount.size());

		//get the column count
		List<WebElement> columnCount = table.findElements(By.tagName("th"));

		//print the column count
		System.out.println(columnCount.size());

		//print particular value
		String text = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr[3]/td[2]")).getText();		      
		System.out.println(text);
		       
		//dynamic
        for (int i = 1; i <rowCount.size() ; i++) {
		for (int j = 1; j <columnCount.size() ; j++) {
			//String country = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr["+i+"]/td[1]")).getText();
		        String country = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr["+i+"]/td["+j+"]")).getText();
		         System.out.println(country);
		        }
		
	}
        

}
}