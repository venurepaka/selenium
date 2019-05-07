import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		try {
			
		driver.get("https://www.qaclickacademy.com");
		try {
			driver.findElement(By.xpath("//button[text()='NO THANKS']")).isDisplayed();
			driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
			}
		catch(Exception e){
			System.out.println("inside catch - popup element not displayed, so continue login process ****");
		}
			driver.findElement(By.cssSelector("a[href*='sign_in']")).click(); 
		//driver.quit();
		
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

}
