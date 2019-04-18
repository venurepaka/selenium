
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelectEx {
	private static WebDriver driver;
	public static void main(String[] args) {
		String s = 
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
//		try {
//			Thread.sleep(2000);
//		
//		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("a[value='GWL']")).click();
//		Thread.sleep(2000);
//		 
//		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		Thread.sleep(2000);
//		
////		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();  // if you don't want top use index, use the below way to get the correct xpath of 2nd and last li element on  the page.
//		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();
//		Thread.sleep(2000);
//		
//		
//		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
//		//System.out.println(driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).getText());
//		
		
		
//		boolean enabled = driver.findElement(By.id("Div1")).getAttribute("style").contains("1");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		boolean enabled = driver.findElement(By.id("Div1")).getAttribute("style").contains("1");
		System.out.println(enabled);
		
		//
//		driver.get("https://www.makemytrip.com");
//		
//		driver.findElement(By.id("fromCity")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.id("fromCity")).sendKeys("HYD");
//		Thread.sleep(2000);
//		System.out.println("hyder = "+driver.findElement(By.id("fromCity")).getText());
		
		driver.quit();
		
//		} catch (Exception e) {
//			driver.quit();
//			e.printStackTrace();
//			
//		}
		
	}
}
