package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

//		boolean flag = driver.findElement(By.name("search")).isDisplayed();
//		
//		if(flag) {
//			System.out.println("ele is displayed");
//		}
//		else {
//			System.out.println("ele is not displayed");
//		}

		By search = By.name("search");
		By logo = By.xpath("//img[@title='naveenopencart']");
		
		

//		if(doIsDisplayed(search)) {System.out.println("PASS");}
//		if(doIsDisplayed(logo)) {System.out.println("PASS");}

//		int count = driver.findElements(search).size();
//		if(count == 1) {
//			System.out.println("ele is displayed");
//		}

		if (isSingleElementExist(search)) {
			System.out.println("ele is displayed");
		}
		if (isSingleElementExist(logo)) {
			System.out.println("ele is displayed");
		}
		// if(isMultipleElementExist(logo, 1)) {System.out.println("logo is displated
		// one time");}

		if (isMultipleElementExist(logo, 3)) {
			System.out.println("logo is displated 3 times");
		} else {
			System.out.println("FAIL");
		}

	}

	public static boolean isSingleElementExist(By locator) {
		int actCount = getElements(locator).size();
		System.out.println("actual count of element ===" + actCount);
		if (actCount == 1) {
			return true;
		}
		return false;
	}

	public static boolean isTwoElementExist(By locator) {
		int actCount = getElements(locator).size();
		System.out.println("actual count of element ===" + actCount);
		if (actCount == 2) {
			return true;
		}
		return false;
	}

	public static boolean isMultipleElementExist(By locator) {
		int actCount = getElements(locator).size();
		System.out.println("actual count of element ===" + actCount);
		if (actCount > 1) {
			return true;
		}
		return false;
	}

	public static boolean isMultipleElementExist(By locator, int expElementCount) {
		int actCount = getElements(locator).size();
		System.out.println("actual count of element ===" + actCount);
		if (actCount == expElementCount) {
			return true;
		}
		return false;
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}
