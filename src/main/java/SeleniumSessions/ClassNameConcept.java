package SeleniumSessions;

import org.openqa.selenium.By;

public class ClassNameConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//form-control private-form__control login-email
		
		By.xpath("//input[@class='form-control private-form__control login-email']");//valid
		By.className("form-control private-form__control login-email");//invalid
		By.className("login-email");//valid
		By.cssSelector(".form-control.private-form__control.login-email");//valid
		
		By.className("private-form__control login-email");//invalid
		By.className("private-form__control");//valid



	}

}
