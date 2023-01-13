package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test()
	public void aTest() {
		System.out.println("aTest");
	}
	
	
	@Test()
	public void bTest() {
		System.out.println("bTest");
	}
	
	@Test()
	public void cTest() {
		System.out.println("cTest");
	}
	
	
	@Test(priority = 1)
	public void dTest() {
		System.out.println("dTest");
	}
	
	
	@Test(priority = 2)
	public void eTest() {
		System.out.println("eTest");
	}
	
	
	

}
