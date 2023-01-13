package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlertsType {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement alertBtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement confirmBtn = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement promptBtn = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		
		alertBtn.click();
		Alert al1 = driver.switchTo().alert();
		Thread.sleep(4000);

		System.out.println(al1.getText());
		al1.accept();
		
		Thread.sleep(4000);
		
		confirmBtn.click();
		Alert al2 = driver.switchTo().alert();
		Thread.sleep(4000);

		System.out.println(al2.getText());
		al2.dismiss();
		
		Thread.sleep(4000);

		
		promptBtn.click();
		Alert al3 = driver.switchTo().alert();
		Thread.sleep(4000);

		al3.sendKeys("hello testing accept");
		al3.accept();
		
		Thread.sleep(4000);

		
		promptBtn.click();
		Alert al4 = driver.switchTo().alert();
		Thread.sleep(4000);

		al4.sendKeys("hello testing dismiss");
		al4.dismiss();
		
		Thread.sleep(4000);



	}

}
