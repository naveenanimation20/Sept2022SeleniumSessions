package SeleniumSessions;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	static WebDriver driver;

	public WebDriver launchBrowser(String browserName) {
		System.out.println("browser name is : " + browserName);

		switch (browserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
			driver = new FirefoxDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		case "edge":
			System.setProperty("webdriver.edge.driver", "/Users/naveenautomationlabs/Downloads/edgedriver");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("plz pass the right browser name...." + browserName);
			break;
		}

		return driver;

	}

	public void launchUrl(String url) {

		if (url == null) {
			System.out.println("url is null");
			throw new FrameworkException("URLISNULL");
		}

		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new FrameworkException("URLISBLANK or URLISEMPTY");
		}

		// https://wwww.gogle.com
		if (url.indexOf("http") != 0 && url.indexOf("https") != 0) {
			System.out.println("http(s) is mising in the URL");
			throw new FrameworkException("HTTP(S) is missing");
		}

		driver.get(url);
	}

	public void launchUrl(URL url) {

		String newUrl = String.valueOf(url);

		if (newUrl == null) {
			System.out.println("url is null");
			throw new FrameworkException("URLISNULL");
		}

		if (newUrl.length() == 0) {
			System.out.println("url is blank");
			throw new FrameworkException("URLISBLANK or URLISEMPTY");
		}

		// https://wwww.gogle.com
		if (newUrl.indexOf("http") != 0 && newUrl.indexOf("https") != 0) {
			System.out.println("http(s) is mising in the URL");
			throw new FrameworkException("HTTP(S) is missing");
		}

		driver.navigate().to(url);
	}

	public String getPageTitle() {
		return driver.getTitle();

	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	

}
