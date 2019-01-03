import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/meher/eclipse-workspace/SeleniumFramework/Drivers/chromeDriver/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.google.com/");

	}

}
