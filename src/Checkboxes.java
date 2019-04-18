import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes {
	
	
	
	public static void  main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement checkbox = driver.findElement(By.cssSelector("input#checkBoxOption1"));
		checkbox.click();
		Assert.assertEquals(checkbox.isSelected(), true);
		checkbox.click();
		Assert.assertEquals(checkbox.isSelected(), false);

		System.out.println(driver.findElements(By.cssSelector("input[type=checkbox]")).size());
		
		driver.quit();
		
		
		
	
	}
	
	
}
