package AutomationTestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass {
  
	@Test
	public void m2() {
		
		System.out.println("Email -test@gmail");
		System.out.println( "Pass - 12345");
		System.out.println("login -click");
		
		//verify
		String Actual ="Xyz";
		String Expected = "Xyz";
		
		SoftAssert soft= new SoftAssert();  /// we need to create an object for softassert
		soft.assertEquals(Actual, Expected);
		
		System.out.println(" Payment button click");
		System.out.println(" Add to cart");
		System.out.println(" Friend request");
		
		soft.assertAll();
		
		
		
		
	}

}
