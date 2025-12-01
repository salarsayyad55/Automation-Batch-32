package learningAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstAutomationCode {

	public static void main(String[] args) {
	
	//facebook url
		
		//browser executable
		WebDriverManager.chromedriver().setup();
		//browser object
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php/");
	
	}

}
