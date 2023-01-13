package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		// window handler api

		WebElement LnkdEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		LnkdEle.click();

		// child window opens
		// switch driver to child window

		// 1st: capture the window IDs
		Set<String> handles = driver.getWindowHandles();
		
		//convert set to list:
		List<String> handlesList = new ArrayList<String>(handles);
		String PWID = handlesList.get(0);
		String CHWID = handlesList.get(1);
		
		driver.switchTo().window(CHWID);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(PWID);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
	}

}
