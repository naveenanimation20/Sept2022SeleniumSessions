package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FESGEnericMethods {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By footerLinks = By.xpath("//div[contains(@class,'footer-left-section')]//a");
		
		int actFooterCount = totalElementsCount(footerLinks);
		System.out.println(actFooterCount);
		if(actFooterCount == 21) {
			System.out.println("footer count -- PASS");
		}
		
		List<String> actEleTextList = getElementsTextList(footerLinks);
		System.out.println(actEleTextList);
		
		if(actEleTextList.contains("Investors")) {System.out.println("PASS");}
		if(actEleTextList.contains("Affiliates")) {System.out.println("PASS");}
		if(actEleTextList.contains("Contact us")) {System.out.println("PASS");}

	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int totalElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);	
		}
		
		return eleTextList;
	}

}
