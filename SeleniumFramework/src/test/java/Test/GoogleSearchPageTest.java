package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		googleSearchTest();
		}
	
	public static void googleSearchTest() {
	
		System.setProperty("webdriver.chrome.driver", "/Users/meher/eclipse-workspace/SeleniumFramework/Drivers/chromeDriver/chromedriver");
		 driver = new ChromeDriver();
		
		GoogleSearchPageObject g = new GoogleSearchPageObject(driver);
	    driver.get("http://www.google.com/");
		g.sendTextInSearchBox("hihjkjkj");
		 
	}

}
