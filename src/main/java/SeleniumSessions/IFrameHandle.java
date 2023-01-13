package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser - ch

		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame-one748593425");
		
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("test-12345");
		
		driver.switchTo().defaultContent();

		driver.findElement(By.partialLinkText("Log in")).click();
		
	}

}
