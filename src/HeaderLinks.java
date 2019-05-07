import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HeaderLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		try {
			
		driver.get("https://www.yahoo .com");
		Thread.sleep(2000);
		WebElement header = driver.findElement(By.cssSelector("div.mh__nav-container"));
		
		int links = header.findElements(By.tagName("a")).size();
		
		System.out.println(links);
		
		
		driver.quit();
		
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		
		
	}

}
