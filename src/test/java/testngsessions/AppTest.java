package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	
	@Test(description = "open cart title test", priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Account Login", "....open cart login page title is incorrect.....");
	}

	@Test(description = "open cart logo test", priority = 3)
	public void logoTest() {
		boolean flag = driver.findElement(By.cssSelector("div#logo img")).isDisplayed();
		Assert.assertEquals(flag, true, ".....logo is not present.....");
	}

	@Test(description = "open cart forgot pws test", priority = 2)
	public void forgotPwdLinkExistTest() {
		boolean flag = driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
		Assert.assertEquals(flag, true, "....forgot pwd link is not present....");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
