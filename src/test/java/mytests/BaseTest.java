package mytests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

	WebDriver driver;

	@Parameters({ "url", "browser", "headless" })
	@BeforeTest
	public void setup(String url, String browserName, String headLess) {

		System.out.println("launching browser : " + browserName);
		ChromeOptions co = new ChromeOptions();
		
		
		if (browserName.equalsIgnoreCase("chrome")) {
			co.setHeadless(Boolean.parseBoolean(headLess));
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("plz pass the right browser...." + browserName);
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(url);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
