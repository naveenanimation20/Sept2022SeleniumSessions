package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {

		//ImplicitlyWaitConcept : dynamic wait
		//10 secs --> 2 secs ---> 8 secs will be canceled
		
		//its applied only for web elements
		//it will be applied for all the web element by default once its declared
		//not applicable for non web elements: alerts, title, urls
		//its a global wait
		
		WebDriver driver = new ChromeDriver();
		
		//sel 3.x:
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//sel 4.x:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//home page: 10 secs
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		WebElement e1 = driver.findElement(By.linkText("MacBook11111"));
		System.out.println(e1.getAttribute("href"));
		
		//e2
		//e3
		//e4
		
		//login page: 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//e5, e6, e7: 20 secs
		
		//home page: 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//e1, e2, e4, e5: 10 secs
		
		//register page: 5 secs:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//product page: 0 secs:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		//20 secs : e1 to e100
		
		
		

		
	}

}
