package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
//		String hrefVal = driver.findElement(By.id("nav-logo-sprites")).getAttribute("href");
//		System.out.println(hrefVal);
		
//		WebElement ele = driver.findElement(By.id("nav-logo-sprites"));
//		
//		String hrefVal = ele.getAttribute("href");
//		String label = ele.getAttribute("aria-label");
//		
//		System.out.println(hrefVal);
//		System.out.println(label);
//		
//		String type = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("type");
//		System.out.println(type);	
		
		By logo = By.id("nav-logo-sprites");
		By search = By.id("twotabsearchtextbox");
		
		String hrefVal = doGetAttributeValue(logo, "href");
		String label = doGetAttributeValue(logo, "aria-label");
		String type = doGetAttributeValue(search, "type");

		System.out.println(hrefVal);
		System.out.println(label);
		System.out.println(type);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetAttributeValue(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	

}
