package learningAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement1 {

	public static void main(String[] args) {
		        
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/login.php/");
				
				driver.manage().window().maximize();
				
		   //  driver.findElement(By.id("email")).sendKeys("abc@gmail.com");  //username
		         //WebElement username =driver.findElement(By.id("email"));
		         
		         WebElement username = driver.findElement(By.id("email"));
		         username.sendKeys("abc@gmail.com");

		         
		     //    driver.findElement(By.name("pass")).sendKeys("ahsh@17e63");  // password
		         
		       //  driver.findElement(By.id("loginbutton")).click(); //button -click*/
		         
		         // is.Enabled();       is.Displayed();   -- return type  true/false
		         // boolean 
		         
		       //boolean value =(driver.findElement(By.id("email"))).isEnabled();
		         
		        //System.out.println(value);
		         
		         /*boolean value1= (driver.findElement(By.id("email"))).isDisplayed();
		         
		        System.out.println(value1);
		       
		         if(value1==true) {
		        	 
		        	 driver.findElement(By.id("email")).sendKeys("abc");
		         }
		         else {System.out.println("Username/Email address field is not Displayed");
		        	 
		         }
		         
		         //Task 1- facebook login url - sendkeys method help -(username/password/login - locate)
		         
		         //Task 2 -  if-else - (is.Enabled())  - is.Displayed();*/

	}

}
