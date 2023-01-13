package SeleniumSessions;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InfiniteScrolling {
	static WebDriver driver;
	static int sleepTime = 1000;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.swiggy.com/restaurants");
		driver.findElement(By.id("location")).sendKeys("Koramangala");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Koramangala, Bengaluru, Karnataka, India']")).click();
		Thread.sleep(15000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String last_height = js.executeScript("return document.body.scrollHeight").toString();
		List<WebElement> restList = null;

		while (true) {
			restList = driver.findElements(By.xpath("//div[@class='nA6kb']//ancestor::a"));
			System.out.println("Current restra size::::::::::: " + restList.size());
			restList.stream().forEach(ele -> System.out.println(ele.getText()));
			
			scrollPageDown();
			
			Thread.sleep(sleepTime);
			String new_height = js.executeScript("return document.body.scrollHeight").toString();
			if (new_height.equals(last_height)) {
				break;
			}
			last_height = new_height;
		}
	}

	public static void scrollPageDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
