package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();//1. open browser
		
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();

		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();

		driver.manage().window().minimize();
		
	}

}
