package AutomationTestNg;

import org.testng.annotations.Test;

public class Automation_S4 {

	@Test(groups = { "CriticalRegression" })
	public void xyz() {
		System.out.println("Test Xyz");
	}

	@Test (groups= {"Regression"})
	public void pqr() {
		System.out.println("Test pqr");
	}

	@Test(groups = { "CriticalRegression" })
	public void abc() {
		System.out.println("Test abc");
	}
	@Test
	public void mno() {
		System.out.println("Test mno");
	}
	@Test(groups= {"Regression"})
	public void efg() {
		System.out.println("Test efg");
	}
}
