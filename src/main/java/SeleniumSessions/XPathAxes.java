package SeleniumSessions;

public class XPathAxes {

	public static void main(String[] args) {

		
		//parent to child:
		//div[@class='private-form__input-wrapper']/input[@id='username']
		
		//div[@class='private-form__input-wrapper']/child::input[@id='username']
		
		//child to parent:
		//input[@id='username']/../../../../../../../../../..
		//input[@id='username']/parent::div
		//input[@id='username']/..
		
		//input[@id='input-email']/preceding-sibling::label
		//label[text()='E-Mail Address']/following-sibling::input[@id='input-email']
		
		
		//div[text()='Get to Know Us']/following-sibling::ul//a
		//div[text()='Make Money with Us']/following-sibling::ul//a
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		
		
	}
	
	
	public static String getXpath(String headerName) {
		String xpath = "//div[text()='"+headerName+"']/following-sibling::ul//a";
		return xpath;
	}
	
	
	

}
