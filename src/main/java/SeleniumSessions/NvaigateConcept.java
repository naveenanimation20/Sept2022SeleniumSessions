package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NvaigateConcept {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();//1. open browser
		
		//driver.navigate().to("https://www.google.com");
		
		driver.navigate().to(new URL("https://www.google.com"));
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		
		
		//validation point/checkpoint/act vs exp:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		driver.quit();

	}

}
