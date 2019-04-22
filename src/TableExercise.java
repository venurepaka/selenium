import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/baba/Downloads/Udemy/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.espncricinfo.com/series/8048/scorecard/1178415/rajasthan-royals-vs-delhi-capitals-40th-match-indian-premier-league-2019");
		
	//parent child css selector or xpath
	//get table, then get corresponding elements using xpath or css.
		
//	 List<WebElement> findElements = driver.findElements(By.cssSelector("#gp-inning-00 > div.scorecard-section.batsmen>div.flex-row>div.wrap.batsmen div:nth-child(3)"));
		List<WebElement> findElements = driver.findElements(By.xpath("//*[@id=\"gp-inning-00\"]/div[1] //div[@class='flex-row']/div[@class='wrap batsmen']/div[3]"));
	
		
	 for(WebElement webElement : findElements) {
		System.out.println(webElement.getText());
		}
		
	}
}
