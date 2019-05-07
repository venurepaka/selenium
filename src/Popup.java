import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		try {
			
		driver.get("https://www.qaclickacademy.com");
		int displayFlag = driver.findElements(By.xpath("//button[text()='NO THANKS']")).size();
		if(displayFlag>0) {
			driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
			driver.findElement(By.cssSelector("a[href*='sign_in']")).click();
			}
		else
			driver.findElement(By.cssSelector("a[href*='sign_in']")).click(); 
		
		//driver.quit();
		
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

}
