package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesudoElementConcept {

	public static void main(String[] args) {

//window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('content')

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String mand_text = js.executeScript("return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"),'::before').getPropertyValue('content')")
					.toString();
		System.out.println(mand_text);
		
		if(mand_text.contains("*")) {
			System.out.println("this is a mandatory field");
		}
		
	}

}
