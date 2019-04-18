import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	private static WebDriver driver;

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
//		driver.get("https://www.facebook.com");
//		driver.navigate().back();
//		System.out.println("google = "+driver.getCurrentUrl());
//		
//		driver.navigate().forward();
//		System.out.println("yahoo="+driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[1]/input[@name='q']")).sendKeys("abcdeffffffff");
		
		
		driver.quit();
		
	}

}
