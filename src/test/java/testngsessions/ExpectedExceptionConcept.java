package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class}, priority = 1, description = "exception test")
	public void calTest() {
		System.out.println("calTest");
		int a = 9/0;
		ExpectedExceptionConcept obj = null;
		obj.name = "Tom";
	}

}
