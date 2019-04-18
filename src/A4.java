import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4 {
	public static void main(String[] args) {

		
		
			
			System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
	WebDriver driver = new ChromeDriver();
	try {
		
	driver.get("https://www.yahoo.com/");	
	Thread.sleep(8000);
	//driver.findElement(By.id("homepage")).sendKeys(Keys.ESCAPE);
	
//	String parentWindowId = driver.getWindowHandle();
//	driver.findElement(By.id("uh-logo")).click();
//	
//	Set<String>allWindows = driver.getWindowHandles();
//	List<String> allWindowsList = new ArrayList<String>(allWindows);
//	
//	for(String childWindow: allWindowsList) {
//		if(parentWindowId != childWindow) {
//			driver.switchTo().window(childWindow);
//			System.out.println(driver.getTitle());
//		}else {
//			driver.switchTo().window(parentWindowId);
//			System.out.println(driver.getTitle());
//		}
//	
//	}
	
	//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	int linksSize = driver.findElements(By.tagName("a")).size();
	String parentWindowId = driver.getWindowHandle();
	
	for(int i=0; i<5; i++) {
		try {
		String clickUsingCommandOrCtrl = Keys.chord(Keys.COMMAND, Keys.ENTER);
		links.get(i).sendKeys(clickUsingCommandOrCtrl);
		Thread.sleep(5000);
		}catch(Exception e1) {
			List<WebElement> links1 = driver.findElements(By.tagName("a"));
			String clickUsingCommandOrCtrl = Keys.chord(Keys.COMMAND, Keys.ENTER);
			links1.get(i).sendKeys(clickUsingCommandOrCtrl);
			Thread.sleep(5000);
		}
		
//		Set<String>allWindows = driver.getWindowHandles();
//		List<String> allWindowsList = new ArrayList<String>(allWindows);
//		
//		for(String childWindow: allWindowsList) {
//			if(parentWindowId != childWindow) {
//				driver.switchTo().window(childWindow);
//				System.out.println(driver.getTitle());
//			}else {
//				driver.switchTo().window(parentWindowId);
//				System.out.println(driver.getTitle());
//			}
//		
//		}
		
	}
	
	Set<String> windowHandles = driver.getWindowHandles();
	
	for(String windowHandle : windowHandles) {
		
		driver.switchTo().window(windowHandle);
		System.out.println(driver.getTitle());
	}
	
	
	
	driver.quit();
	
	}catch(Exception e) {
		e.printStackTrace();
		//driver.quit();
	}
	
			
	}
}
