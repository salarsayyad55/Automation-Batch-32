package learningAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_S8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login.php/");

		driver.manage().window().maximize();

	/*	WebElement Email = driver.findElement(By.id("email"));

		Email.sendKeys("Test@123");

		WebElement password = driver.findElement(By.name("pass"));
   
		password.sendKeys("hdhcv@17t7t137");*/
		
		//Id  Name ClassName  linkText
		
		//driver.findElement(By.className("inputtext")).sendKeys("Test@123");
		
		//WebElement forgotPass=driver.findElement(By.linkText("Forgotten account?"));
		
		
	//String text_Of_ForgotAccount_Link=	forgotPass.getText();
	 
	//System.out.println(text_Of_ForgotAccount_Link);
	//forgotPass.click();
		
		//Absolute Xpath
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")).sendKeys("Test@12345");
	}
}
