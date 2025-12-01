package AutomationTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_S3 extends BaseClass {

	@Test
	public void test1() throws Exception {
		Thread.sleep(2000);
		  WebElement username = driver.findElement(By.id("email"));
	         username.sendKeys("abc@gmail.com");
	}
	@Test
	public void test2() {
		driver.findElement(By.name("pass")).sendKeys("ahsh@17e63");  // password
	}
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
	}
