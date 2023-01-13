package SeleniumSessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowSizeConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();		
		driver.manage().window().setSize(new Dimension(500, 400));
		
		driver.get("https://www.google.com");
	}

}
