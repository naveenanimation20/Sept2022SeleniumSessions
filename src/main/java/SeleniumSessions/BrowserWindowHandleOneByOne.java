package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleOneByOne {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);

		//1
		WebElement LnkdEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		LnkdEle.click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		String childWindowId = it.next();

		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);

		//2
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		fbEle.click();

		Set<String> handles2 = driver.getWindowHandles();
		Iterator<String> it2 = handles2.iterator();

		 parentWindowId = it2.next();
		 childWindowId = it2.next();

		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);

	}

}
