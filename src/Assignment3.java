import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		try {
			
		driver.get("https://the-internet.herokuapp.com/");	
		
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
//		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name=frame-top]")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name=frame-middle]")));
		System.out.println(driver.findElement(By.cssSelector("div#content")).getText());
		
		
		driver.quit();
		
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		
	}
}
