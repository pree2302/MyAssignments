package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfRows_Cols_WebTable {

	public static void main(String[] args) {
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		System.out.println("--------Table 1----------");
		//locate the table 1
		WebElement tbl1 = driver.findElement(By.xpath("//div[@class='render']/table"));
		
		//row count of table 1
		List<WebElement> tbl1rowcount = tbl1.findElements(By.tagName("tr"));
		System.out.println("Row count of table1:       " +tbl1rowcount.size());
		
		//column count of table 1
		List<WebElement> tbl1colcount = tbl1.findElements(By.tagName("th"));
		System.out.println("Column count of table1:    " +tbl1colcount.size());
		
		
		
		System.out.println("--------Table 2----------");
		//locate the table 2
		WebElement tbl2 = driver.findElement(By.xpath("//div[@class='related-pages']/table"));
		
		//row count of table 2
		List<WebElement> tbl2rowcount = tbl2.findElements(By.tagName("tr"));
		System.out.println("Row count of table2:      " +tbl2rowcount.size());
		
		//column count of table 2
		List<WebElement> tbl2colcount = tbl2.findElements(By.tagName("th"));
		System.out.println("Column count of table2:    " +tbl2colcount.size());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
