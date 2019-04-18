import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		try {
			
		driver.get("https://the-internet.herokuapp.com/");	
		
		
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		
		
			 driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
			 
			 
			 Set<String> windowHandles2 = driver.getWindowHandles();
				Iterator<String> it2 = windowHandles2.iterator();
				String parent = it2.next();
				String child = it2.next();
				
			 driver.switchTo().window(child);
			 System.out.println(driver.findElement(By.cssSelector("div.example")).getText());
		
			 driver.switchTo().window(parent);
			 System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());
		
		
		
		
		
		driver.quit();
		
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		
	}
}
