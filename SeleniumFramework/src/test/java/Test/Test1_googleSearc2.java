package Test;
import Pages.GoogleSearchPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_googleSearc2 {
	
	static WebDriver driver= null;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleSearch();

	}
	
	public static void GoogleSearch() {
		System.setProperty("webdriver.chrome.driver", "/Users/meher/eclipse-workspace/SeleniumFramework/Drivers/chromeDriver/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("here&Now");
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		GoogleSearchPage.textbox_Search(driver).sendKeys("here");
//		GoogleSearchPage.button_Search(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		System.out.println("successful");
		
		
	}

}
