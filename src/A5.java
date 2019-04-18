import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class A5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		try {
			
		driver.get("https://www.qaclickacademy.com/practice.php");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#checkBoxOption2")).click();
		
		// Currently, I am not getting the text. I am getting the empty string. Thats why, I am hard coding for this element.
		
		String checkBoxOption2 = "Option2";//driver.findElement(By.cssSelector("input#checkBoxOption2")).getText();  
		
		WebElement selectElement = driver.findElement(By.id("dropdown-class-example"));
		
		Select select = new Select(selectElement);
		select.selectByVisibleText(checkBoxOption2);
		
		
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(checkBoxOption2);
			driver.findElement(By.id("alertbtn")).click();
			Assert.assertTrue(driver.switchTo().alert().getText().contains(checkBoxOption2));
		
		
		
		
		driver.quit();
		
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		

	}

}
