package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoadConcept {

	static WebDriver driver;
	
	
	public static boolean isPageLoaded(WebDriver driver) {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		  String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\'complete\'")).toString();
		  return Boolean.parseBoolean(flag);
		}
	
	

	public static void waitForPageLoad(int timeOut) {

		long endTime = System.currentTimeMillis() + timeOut;

		while (System.currentTimeMillis() < endTime) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String pageState = js.executeScript("return document.readyState").toString();
			System.out.println(pageState);
			if (pageState.equals("complete")) {
				System.out.println("page DOM is fully loaded now.....");
				break;
			}
			
		}

	}

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/pricing.html");
		waitForPageLoad(10);
		if(isPageLoaded(driver)) {
			System.out.println("page is loaded");
		}

	}

}
