package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackFwdSimulation {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();//1. open browser

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getTitle());

		
		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		System.out.println(driver.getTitle());

		
		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().refresh();//refresh the page
		
		
	}

}
