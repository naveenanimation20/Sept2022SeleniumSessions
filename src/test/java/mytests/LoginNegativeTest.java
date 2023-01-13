package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest{
	
	
	@DataProvider
	public Object[][] loginNegativeData() {
		return new Object[][] {
			
			{"asasas@gmail.com", "asaas123"},
			{"naveenanimation20@gmail.com", "asaas123"},
			{"naveenanimation20@gmail.com", "    "},
			{"naveenanimation22121210@gmail.com", "Selenium@12345"},
			{"    ", "   "},
			
		};
	}
	
	
	
	@Test(dataProvider = "loginNegativeData")
	public void loginNegativeTest(String username, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String errorMesg = 
				driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		
		Assert.assertTrue(errorMesg.contains("No match for E-Mail Address and/or Password"));
		
		
	}

}
