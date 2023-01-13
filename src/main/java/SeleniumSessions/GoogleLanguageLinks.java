package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		By langLocator = By.xpath("//div[@id='SIvCob']/a");
		doClickOnElement(langLocator, "मराठी");
	}
	
	public static void doClickOnElement(By locator, String linkText) {
		List<WebElement> linksList = driver.findElements(locator);
		System.out.println("total links : " + linksList.size());
		for (WebElement e : linksList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(linkText)) {
				e.click();
				break;
			}
		}
	}
	

}
