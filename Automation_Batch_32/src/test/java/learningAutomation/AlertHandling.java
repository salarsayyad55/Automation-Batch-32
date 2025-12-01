package learningAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alt=driver.switchTo().alert();
		String textAlert1=alt.getText();
		System.out.println(textAlert1);
		alt.accept();
		//alt.dismiss();
		
		Thread.sleep(2000);
		
		String textAlert2=alt.getText();
		System.out.println(textAlert2);
		alt.accept();
		
		
		

	}

}
