package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/abu-dhabi-t10-2022-23-1344972/bangla-tigers-vs-delhi-bulls-19th-match-1345003/full-scorecard");
		
		Thread.sleep(4000);
		
		
		String wkTkrName = getWicketTakerName("Joe Clarke");
		System.out.println(wkTkrName);
	}
	
	
	public static String getWicketTakerName(String playerName) {
		return driver.findElement(By.xpath("(//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td)[1]"))
				.getText();
	}
	

}
