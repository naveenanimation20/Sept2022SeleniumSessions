package SeleniumSessions;

import org.openqa.selenium.By;

public class CustomXpath {

	public static void main(String[] args) {

		
		//1. absolute xpath: 
		///html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/h4/a
		//2. custom/relative xpath:
		
		//htmltag[@attr='value']
		
		//input[@placeholder='E-Mail Address']
		//input[@type='text']
		//input[@type='submit']
		
		//htmltag[@attr1='value' and @attr2='value']
		//input[@type='submit' and @value='Login']
		//input[@type='text' and @name='email' and @id='input-email']
		
		//input[@type='text' or @name='email']
		
		//text():
		//htmltag[text()='value']
		//h2[text()='New Customer']
		//a[text()='Returns']
		
		//text() and attribute:
		//htmltag[text()='value' and @attr='value']
		//a[text()='Register' and @class='list-group-item']
		//a[@class='list-group-item' and text()='Register']
		
		//contains:
		//htmltag[contains(@attr,'value')]
		//input[contains(@id,'email')]
		//input[@id='input-email']
		
//		<div id=firstname_123>
//		<div id=firstname_455>
//		<div id=firstname_457>
		//div[contains(@id,'firstname_')]
		
		//contains() with text():
		//htmltag[contains(text(),'value')]
		//h2[contains(text(),'Returning')] --1 FE
		//a[contains(text(),'Amazon')] -20  FEs
		
		//contains() with one attr and another attr without contains
		//htmltg[contains(@attr1,'value') and @attr2='value']
		//input[contains(@name,'field') and @id='twotabsearchtextbox' and @type='text']
		
		//htmltg[contains(@attr1,'value') and contains(@attr2,'value')]
		//htmltg[contains(@attr1,'value') and @attr2='value']

		//starts-with():
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@name,'field')]
		//input[starts-with(@name,'field') and @id='twotabsearchtextbox']
		//input[starts-with(@name,'field') and starts-with(@id,'twotabsearch')]
		
		//starts-with() and contains():
		//input[starts-with(@name,'field') and contains(@id,'search')]
		
		//ends-with(): NA
		
		
		//indexing:
		// (//input[@class='form-control'])[1]
		By fn = By.xpath("(//input[@class='form-control'])[1]");
		By ln = By.xpath("(//input[@class='form-control'])[2]");

		// (//input[@class='form-control'])[position()=6]
		
		// (//input[@class='form-control'])[last()]
		// (//input[@class='form-control'])[last()-1]
		// ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
		
		
		//htmltag[@attr='value']
		//200 - 10 input tags
		//input[@name='naveen'] - 1
		//*[@name='naveen'] - 1
		
		
		
		
		
	}

}
