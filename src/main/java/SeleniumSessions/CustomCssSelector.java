package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		//css: cascaded style sheet
		//id
		//#id
		//.class
		
		// #input-email
		// input#input-email
		By.cssSelector("#input-email");
		
		// .form-control
		// input.form-control
		
		// #id.class
		// .class#id
		// #input-email.form-control
		// .form-control#input-email
		// input.form-control#input-email
		
		//.c1.c2.c3....cn
		// input.btn.btn-primary
		// input.form-control.input-lg
		// .form-control.input-lg
		// .form-control.private-form__control.login-email
		// input.login-email
		
		
		// htmltag[attr='value']
		
		// input[type='submit'] - css
		//input[@type='submit'] - xpath
		// input[type='submit'][value='Login'] -- css
		
		//input[@type='submit' and @value='Login'] - xpath
		
		
		// htmltag[attr*='value']
		// input[id*='email'] -- contains
		// input[id^='input'] -- starts with
		// input[id$='email'] -- ends with
		// input[id$='email'][placeholder^='E-Mail'][name*=email]
		
		//text? - no support in CSS
		
		
		//parent to child:
		// select#Form_getForm_Country > option ---> direct child elements
		// select#Form_getForm_Country  option  --> direct + indirect child elements
		
		// form#hs-login > div -- 8
		// form#hs-login  div  -- 20
		
		//child to parent: backward traversing not supported
		
		//sibling in css:
		//preceding sibling is not supported
		// label[for='input-email']+input  --> following sibling
		
		//comma in css:
		// input#username,input#password,button#loginBtn,input#remember -- 4
		By mand_eles = By.cssSelector("input#username,input#password,button#loginBtn, input#remember");
		int mand_eles_count = driver.findElements(mand_eles).size();
		if(mand_eles_count == 4) {
			System.out.println("imp elements are available on the page");
		}
		else {
			System.out.println("imp elements are not available on the page");
		}
		
		//indexing in css:
		// div.row ul.footer-nav li:nth-of-type(5)
		
	//	xpath vs css:
		
		//syntax: css
		//text: xpath
		//contains/startswith/endswith: Both
		//contains + text + attr : xpath
		//backward traversing: xpath
		//siblings: xpath
		//dynamic: both
		//comma: css
		//indexing: xpath
		//performance: both
		
		
//		svg - elements, graph
//		shadowDOM
//		Relative Locators
//		Psuedo Elements
		//normalize-space()
		//not in css
		
		//canvas - html5 , graphs
		
		
		
			
		
	}

}
