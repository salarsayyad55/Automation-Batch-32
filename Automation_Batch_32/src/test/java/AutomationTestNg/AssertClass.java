package AutomationTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass {
   
	@Test
	public void verifym1() {
		
		System.out.println("Email -test@gmail");
		System.out.println( "Pass - 12345");
		System.out.println("login -click");
		
		//verify
	//String titleofhomepage=	driver.getitle();   //string 
		
		String   Expected ="Xyz";
		String Actual = "ABC";
		
		Assert.assertEquals(Actual, Expected);    //hard assert
		
		System.out.println(" Payment button click");
		System.out.println(" Add to cart");
	}
}
