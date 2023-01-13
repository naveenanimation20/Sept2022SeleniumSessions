package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopHandle {

	static WebDriver driver;

	public static void main(String[] args) {

//		driver = new ChromeDriver();
//		if(doLogin("admin", "admin", "the-internet.herokuapp.com/basic_auth")) {
//			System.out.println("logged in successfully");
//		}
		
		
	}

	public static boolean doLogin(String username, String password, String url) {
		driver.get("https://" + username + ":" + password + "@" + url);
		String mesg = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
		if(mesg.contains("Congratulations! You must have the proper credentials.")) {
			return true;
		}
		return false;
	}

}

