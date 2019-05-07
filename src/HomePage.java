import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		try {
			
			driver.get("https://www.visa.com");
	System.out.println(driver.findElement(By.cssSelector("div.visa-homepage.container-background-image")).isDisplayed());
		
		
		driver.findElement(By.cssSelector("a[href='https://usa.visa.com/pay-with-visa/find-card/'].task-link")).click();
		
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}

}
