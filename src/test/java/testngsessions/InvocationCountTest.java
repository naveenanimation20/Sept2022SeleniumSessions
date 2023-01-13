package testngsessions;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount = 10)
	public void searchTest() {
		System.out.println("searchTest");
	}
	

}
