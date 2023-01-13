package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenCartTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@Test(enabled = false)
	public void loginPageTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Account Login11", "....open cart login page title is incorrect.....");

		boolean flag = driver.findElement(By.cssSelector("div#logo img")).isDisplayed();		
		Assert.assertEquals(flag, true, ".....logo is not present.....");
		
		flag = driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
		Assert.assertEquals(flag, true, "....forgot pwd link is not present....");

	}
	
	
	
	@Test(description = "open cart title test")
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Account Login", "....open cart login page title is incorrect.....");
		System.out.println(".....Ending test.....");
	
	}

	@Test(description = "open cart logo test")
	public void logoTest() {
		boolean flag = driver.findElement(By.cssSelector("div#logo img")).isDisplayed();
		Assert.assertEquals(flag, true, ".....logo is not present.....");
	}

	@Test(description = "open cart forgot pws test")
	public void forgotPwdLinkExistTest() {
		boolean flag = driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
		Assert.assertEquals(flag, true, "....forgot pwd link is not present....");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
