package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {

		//headless: no browser display
		//testing is happening behind the scene
		//faster than normal mode
		
		//htmlunit, phantomJS - ghostdriver, 
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		//co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		
	}

}
