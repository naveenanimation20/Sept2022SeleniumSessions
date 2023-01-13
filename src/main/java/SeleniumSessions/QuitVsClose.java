package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();//1. open browser -- 123

		//2. launch url:
		driver.get("https://www.google.com");
		
		//3. get the title:
		String title = driver.getTitle();
		System.out.println("page title: " + title);//Google
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.quit();//close the browser//123
		
		driver.close();//close the browser//123
		
//		//sid = null
		//sid =???
//
		//System.out.println(driver.getTitle());
//
//		//launch the browser again:
		driver = new ChromeDriver(); //456
		driver.get("https://www.google.com");//456
		System.out.println(driver.getTitle());//456

		
	}

}
