import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args)  {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		try {
			
			driver.get("https://www.cleartrip.com");
		driver.findElement(By.id("DepartDate")).click();
		
			Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();
		
		WebElement adultElement = driver.findElement(By.cssSelector("select#Adults"));
		WebElement childrenElement = driver.findElement(By.cssSelector("select#Childrens"));
		WebElement infantsElement = driver.findElement(By.cssSelector("select#Infants"));
		
		Select selectAdult = new Select(adultElement);
		
		selectAdult.selectByValue("1");
		
		Select childrenSelect = new Select(childrenElement);
		childrenSelect.selectByValue("1");
		
		Select infantsSelect = new Select(infantsElement);
		infantsSelect.selectByValue("1");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("a#MoreOptionsLink")).click();
		
		driver.findElement(By.cssSelector("input#AirlineAutocomplete")).sendKeys("indigo");
		
		
		driver.findElement(By.cssSelector("input#SearchBtn")).click();
		Thread.sleep(2000);
		
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div#homeErrorMessage")).getText(), "Sorry, but we can't continue until you fix everything that's marked in RED");
		
		
				
		
		
		
		driver.quit();
		
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
		

	}

}
