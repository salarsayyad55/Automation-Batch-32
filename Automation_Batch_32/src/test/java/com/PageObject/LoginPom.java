package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {

	@FindBy(how=How.XPATH, using="//input[@name='email']") private WebElement Text_emailID;   //username
	
	@FindBy(how=How.XPATH, using="//input[@name='pass']") private WebElement Text_Password;  //password
	
	@FindBy(how=How.XPATH, using="//button[@name='login']") private WebElement Button_Login; //button
	
	//getter
	
	public WebElement getText_EmailID(){
		
		return Text_emailID;
	}
	
	public WebElement getText_Password() {
		
		return Text_Password;
	}
public WebElement getButton_Login() {
		
		return Button_Login;
	}
	
}
