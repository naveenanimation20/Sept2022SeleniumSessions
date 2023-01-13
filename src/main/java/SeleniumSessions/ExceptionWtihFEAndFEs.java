package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionWtihFEAndFEs {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		
		//driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");
		//NoSuchElementException
		
//		List<WebElement> linksList = driver.findElements(By.xpath("//div[@class='list-group11']/a"));
//		System.out.println(linksList.size());//0 - empty list
		
		List<WebElement> linksList = driver.findElements(By.xpath("//div[@@@@@class====='list-group11']/////a"));
		//InvalidSelectorException - syntax error
		System.out.println(linksList.size());
		
		
		
	}

}
