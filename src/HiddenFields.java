import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenFields {
	public static void main1(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("testemail");//email is hidden
//		System.out.println(driver.findElement(By.id("email")).getText());
		
		// this is hidden... otherwise, you would get text instead of $0
		
		//Open the selenium ran window and inspect on the email field <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email"> ==$0
		//Fix: Use JavaScripExecutor, which will extract hidden elements
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String scriptEmail = "return document.getElementById(\"email\").value;";
		System.out.println(js.executeScript(scriptEmail));
		
		
	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
	
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String scriptPlace = "return document.getElementById(\"fromPlaceName\").value;";
//		System.out.println(js.executeScript(scriptPlace));
		String scriptValue = (String)js.executeScript(scriptPlace);
		
		for(; !scriptValue.equalsIgnoreCase("BENGALURU");) {
			
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			
			 js = (JavascriptExecutor)driver;
			 scriptValue = (String)js.executeScript(scriptPlace);
		}
		System.out.println(js.executeScript(scriptPlace));
		
	}
}
