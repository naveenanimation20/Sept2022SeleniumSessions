package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		
		System.out.println(suggList.size());
		
		for(WebElement e : suggList) {
			String text = e.getText();
				System.out.println(text);
					if(text.equals("selenium testing")) {
						e.click();
						break;
					}
		}
		
	}

}
