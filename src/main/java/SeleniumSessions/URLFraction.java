package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class URLFraction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/@SelectorsHub/playlists");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		try {
//			if (wait.until(ExpectedConditions.urlContains("product/special"))) // invalid url factor
//			{
//				System.out.println("Url fraction is matching with expections");
//			}
//		} catch (Exception e) {
//			System.out.println("Url fraction is not matching ...........");// this message is not printing
//
//		}
		driver.findElements(By.cssSelector("h3.style-scope.ytd-grid-playlist-renderer a#video-title")).stream()
				.forEach(e -> System.out.println(e.getAttribute("title")+ "\n" + e.getAttribute("href")+"\n"+"\n"));

	}

}
