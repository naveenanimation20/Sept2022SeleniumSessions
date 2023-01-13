package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
	// global pre condition - BeforeSuite, BEforetest, BeforeMethod
	// pre condition- BEfore
	// test steps -- test
	// validations : act vs exp result ---> Assertions -- Assert
	// post step -- After
	
	
	/**
	 * BS -- connectWithDB
       BT -- createUser
	   BC -- launchBrowser
	   
			BM -- Login to App
			cartTest
			AM - logout
			
			BM -- Login to App
			homePageTest
			AM - logout
			
			BM -- Login to App
			searchTest
			AM - logout
			
		AC - closeBrowser
		AT - deleteUser
		AS - disconnectWithDB

	 */
	
	
	
	
	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- connectWithDB");
	}

	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- createUser");
	}

	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launchBrowser");
	}

	//4 7 10
	@BeforeMethod
	public void login() {
		System.out.println("BM -- Login to App");
	}
	
	//8
	@Test
	public void homePageTest() {
		System.out.println("homePageTest");
	}

	//11
	@Test
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	//5
	@Test
	public void cartTest() {
		System.out.println("cartTest");
	}
	
	
	//6 9 12
	@AfterMethod
	public void logout() {
		System.out.println("AM - logout");
	}
	
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - closeBrowser");
	}
	
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT - deleteUser");
	}
	
	//15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS - disconnectWithDB");
	}
	
	
	
	
	
	
	
}
