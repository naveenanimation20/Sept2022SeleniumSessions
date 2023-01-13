package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForTitleUrlAlert {
	static WebDriver driver;

	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//title:
//		String actTitle = waitForTitleContains("Register", 5);
//		System.out.println(actTitle);
		
		//url:
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.urlContains("jobs"));
//		System.out.println(driver.getCurrentUrl());
		
		//alerts:
		//waiting for the alert and switching to the alert also
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
		
		
	}
	
	
	public static Alert waitForAlertPresentAndSwitch(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertText(int timeOut) {
		return waitForAlertPresentAndSwitch(timeOut).getText();
	}
	
	public static void acceptAlert(int timeOut) {
		waitForAlertPresentAndSwitch(timeOut).accept();
	}
	
	public static void dismissAlert(int timeOut) {
		waitForAlertPresentAndSwitch(timeOut).dismiss();
	}
	
	public static void alertSendKeys(int timeOut, String value) {
		waitForAlertPresentAndSwitch(timeOut).sendKeys(value);
	}
	
	public static String waitForUrlContains(String urlFractionValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlContains(urlFractionValue))) {
			return driver.getCurrentUrl();
		}
		else {
			System.out.println("expected url is not visible...");
			return null;
		}
	}
	
	public static String waitForUrlIs(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlToBe(urlValue))) {
			return driver.getCurrentUrl();
		}
		else {
			System.out.println("expected url is not visible...");
			return null;
		}
	}
	
	
	
	
	public static String waitForTitleContains(String titleFractionValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleContains(titleFractionValue))) {
			return driver.getTitle();
		}
		else {
			System.out.println("expected title is not visible...");
			return null;
		}
	}
	
	public static String waitForTitleIs(String titleVal, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleIs(titleVal))) {
			return driver.getTitle();
		}
		else {
			System.out.println("expected title is not visible...");
			return null;
		}
	}
	
	
	
	
	
	
	

}
