package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverTopCastingOptions {
	
	static WebDriver driver;

	public static void main(String[] args) {


		//A. creating the object of browser driver class
		//valid top casting and we use it for local specific browser execution
		//1. 
//		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
//		ChromeDriver driver = new ChromeDriver();

		//2.
//		System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
//		FirefoxDriver driver = new FirefoxDriver();
		
		//3. 
//		System.setProperty("webdriver.edge.driver", "/Users/naveenautomationlabs/Downloads/edgedriver");
//		EdgeDriver driver = new EdgeDriver();
		
		//B. top casting: cross browser testing
		//valid top casting and we use it for local execution
		//to run test cases locally
//		String browser = "chrome";
//		
//		if(browser.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
//			driver = new ChromeDriver();
//		}
//		else if(browser.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
//			driver = new FirefoxDriver();
//		}
//		else if(browser.equals("edge")) {
//			System.setProperty("webdriver.edge.driver", "/Users/naveenautomationlabs/Downloads/edgedriver");
//			driver = new EdgeDriver();
//		}
//		else if(browser.equals("safari")) {
//			driver = new SafariDriver();
//		}
//		else {
//			System.out.println("please pass the right browser...");
//		}
		
		
		//c. WD = RWD : to run test cases at the remote machine/cloud/grid
		//valid top casting and we use it for remote execution
		//driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		//D. SC = CD/FD/SD/ID -- valid but we dont use it practically
		//SearchContext sc = new ChromeDriver();
		
		
		//E. RWD = CD/FD/WD/ID/ED
		//valid and can be used for local execution:
//		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
//		RemoteWebDriver driver = new ChromeDriver();
		
		
		//F. SC = RWD
		//valid but we dont use it...it will access only FE/FEs
		//SearchContext sc = new RemoteWebDriver(remoteAddress, capabilities);
				
		
		// 2. launch url:
		driver.get("https://www.google.com");

		// 3. get the title:
		String title = driver.getTitle();
		System.out.println("page title: " + title);

		// validation point/checkpoint/act vs exp:
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");
		}

		// automation steps + validation ==> Automation Testing

		driver.quit();// close browser
		
		
		
		// WD = new CD
		// RWD = new CD
		
		

	}

}
