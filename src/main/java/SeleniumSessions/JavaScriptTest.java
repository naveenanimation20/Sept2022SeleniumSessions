package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		System.out.println(jsUtil.getTitleByJS());
//		
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		if(pageText.contains("Deal Pipeline")) {
//			System.out.println("PASS");
//		}
		
		
		//jsUtil.refreshBrowserByJS();
		
		//jsUtil.generateAlert("login page is displayed");
		
//		WebElement emailid = driver.findElement(By.id("input-email"));
//		jsUtil.drawBorder(emailid);
//		
//		WebElement rightPanel = driver.findElement(By.id("column-right"));
//		jsUtil.drawBorder(rightPanel);
//
//		jsUtil.flash(emailid);
//		emailid.sendKeys("test@gmail.com");
//		jsUtil.flash(rightPanel);
		
		
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(2000);
//		jsUtil.scrollPageDown("1200");
		
//		WebElement watch = driver.findElement(By.xpath("//h2[text()='Shop activity trackers and smartwatches']"));
//		jsUtil.scrollIntoView(watch);

		WebElement help = driver.findElement(By.linkText("Help"));
		jsUtil.clickElementByJS(help);
		
		//JS click:
		//click -- ElementNotInteractableException or 
		//Actions Click : 
		//Js Click -- 100%
		
		
		
	}

}
