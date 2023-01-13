package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelectTag {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		Thread.sleep(3000);

//		WebElement county = driver.findElement(By.id("Form_getForm_Country"));
//		Select select = new Select(county);
//		
//		//select.selectByIndex(5);
//		//select.selectByVisibleText("Bahrain");
//		select.selectByValue("Cambodia");
		
		//state
		//Select -- state
		//select.text("Delhi")
		
		//1 to 10 -- select 
		
		By country = By.id("Form_getForm_Country");
//		doSelectDropDownByIndex(country, 5);
		doSelectDropDownByVisibleText(country, "In1111");
		//doSelectDropDownByValue(country, "Brazil");
		
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	

}
