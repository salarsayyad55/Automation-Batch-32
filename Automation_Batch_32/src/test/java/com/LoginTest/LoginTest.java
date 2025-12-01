package com.LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
WebDriver driver;
	@BeforeMethod
	public void Setup() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}

	@Test
	
	public void VerifyLogin() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getText_EmailID().sendKeys("Abc@gmail.com");
		login.getText_Password().sendKeys("hbsjhads");
		login.getButton_Login().click();
		
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}
}
