import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popup3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		try {
			
		driver.get("https://www.qaclickacademy.com");
		WebDriverWait wait=new WebDriverWait(driver, 20000000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='NO THANKS']")));
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		driver.findElement(By.cssSelector("a[href*='sign_in']")).click();
		
		//driver.quit();
		
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

}
