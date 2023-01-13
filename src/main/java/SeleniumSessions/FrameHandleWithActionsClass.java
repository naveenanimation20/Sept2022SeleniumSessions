package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FrameHandleWithActionsClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		WebDriver driver = new ChromeDriver(co);

		driver.get("https://classic.crmpro.com/index.html");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.switchTo().frame("mainpanel");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).build().perform();
		act.click(driver.findElement(By.linkText("New Contact"))).build().perform();
		
		driver.findElement(By.id("first_name")).sendKeys("Naveen");
		driver.quit();


	}

}
