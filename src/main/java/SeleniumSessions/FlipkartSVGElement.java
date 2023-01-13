package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSVGElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String xpath = "//*[local-name()='svg']//*[name()='g' and @fill-rule='evenodd']";
		By searchIcon = By.xpath(xpath);
		driver.findElement(By.name("q")).sendKeys("macbook pro");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.click(driver.findElement(searchIcon)).build().perform();
		
		
		//driver.findElement(searchIcon).click();
		
		
		
	}

}
