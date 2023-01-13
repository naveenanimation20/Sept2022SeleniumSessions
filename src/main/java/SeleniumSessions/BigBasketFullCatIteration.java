package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketFullCatIteration {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		WebElement mainCat = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(mainCat).build().perform();
		
		Thread.sleep(3000);
		
		List<WebElement> level1List = driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
		
		for(WebElement e1 : level1List) {
			
			act.moveToElement(e1).build().perform();
			System.out.println(e1.getText());
			
			List<WebElement> level2List = driver.findElements(By.xpath("(//ul[contains(@class,'nav-pills')])[2]//a"));

				for(WebElement e2 : level2List) {
					
					act.moveToElement(e2).build().perform();
					System.out.println(e2.getText());
					
					List<WebElement> level3List = driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[last()-1]//a"));

						for(WebElement e3 : level3List) {
							act.moveToElement(e3).build().perform();
							System.out.println(e3.getText());
						}
					
					
				}
			
			
			
			
		}
		
	}

}
