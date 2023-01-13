package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverBasics {

	public static void main(String[] args) {
		//win:
		//System.setProperty("webdriver.chrome.driver", "c:\\users\\naveen\\downloads\\chromedriver.exe");
		
		//mac:
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		options.addArguments("--window-position=500,500");
		options.addArguments("--enable-logging");
		Map<String, Object> prefs = new HashMap<String, Object>();

		// Set the preference to disable images
		prefs.put("profile.default_content_setting_values.images", 2);

		// Add the preferences to the options object
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-notifications");


		
		WebDriver driver = new ChromeDriver(options);//1. open browser

		//2. launch url:
		driver.get("https://www.justdial.com/Bangalore/Bakeries");
		
		//3. get the title:
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		
		
		//validation point/checkpoint/act vs exp:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		//automation steps + validation ==> Automation Testing
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String pgSrce = driver.getPageSource();
//		System.out.println(pgSrce);
		
		if(pgSrce.contains("Copyright The Closure Library Authors")) {
			System.out.println("this info is present");
		}
		
		
		//driver.quit();//close browser
		
		
		
	}

}
