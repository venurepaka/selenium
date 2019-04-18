import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.alaskaair.com/?semid=Google%7c%7cSEMBrand%7c%7c&gclid=Cj0KCQjwwODlBRDuARIsAMy_28Ud7Lbd-IBerHerugyma6wNagsoC1FCSy3u_pzGwmE2TVKFSDWdUOMaAnPVEALw_wcB&gclsrc=aw.ds");
		
		System.out.println(driver.findElement(By.cssSelector("div.page-title")).getText());
		
		
	}
}
