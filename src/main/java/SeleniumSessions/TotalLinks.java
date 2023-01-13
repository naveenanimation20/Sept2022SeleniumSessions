package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
		
		//1. total links
		//2. print the text of each link
		//3. avoid the blank text

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		//html tag: <a>
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		System.out.println("total links: " + linksList.size());
		
//		for(int i=0; i<linksList.size(); i++) {
//			String text = linksList.get(i).getText();
//				if(!(text.length()==0)) {
//					System.out.println(i + "=" + text);
//				}
//		}
		
		//for each:
		int count = 1;
		for(WebElement e : linksList) {
			String text = e.getText();
			if(!(text.length()==0)) {
				System.out.println(count + "=" + text);
			}
			count++;
		}
		
		
	}

}
