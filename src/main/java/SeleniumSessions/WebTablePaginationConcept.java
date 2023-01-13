package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationConcept {
	
	//FE - NSE
	//FEs - empty list --> 0

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		
		//multiple selection:
				while (true) {

					if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
						selectMultipleCountry("India");
					}

						// pagination logic:
						WebElement next = driver.findElement(By.linkText("Next"));
						
							if(next.getAttribute("class").contains("disabled")) {
								System.out.println("pagination is over...");
								break;
							}
						
						next.click();
						Thread.sleep(1000);

				}

		
//		//single selection:
//		while (true) {
//
//			if (driver.findElements(By.xpath("//td[text()='Denmark']")).size() > 0) {
//				selectCountry("Denmark");
//				break;
//			}
//
//			else {
//				// pagination logic:
//				WebElement next = driver.findElement(By.linkText("Next"));
//				
//					if(next.getAttribute("class").contains("disabled")) {
//						System.out.println("pagination is over...country is not found....");
//						break;
//					}
//				
//				next.click();
//				Thread.sleep(1000);
//			}
//
//		}

	}

	public static void selectCountry(String country) {
		driver.findElement(By.xpath("//td[text()='" + country + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();

	}
	
	public static void selectMultipleCountry(String country) {
		List<WebElement> checkboxList = 
				driver.findElements(By.xpath("(//td[text()='"+country+"'])/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e : checkboxList) {
			e.click();
		}
	}

}
