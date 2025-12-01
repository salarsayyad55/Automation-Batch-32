package learningAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		// Set up ChromeDriver 
        WebDriver driver = new ChromeDriver();
        
        // Dummy URL with a prompt alert example
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        // Maximize window
        driver.manage().window().maximize();
        
        // Click on the button that triggers the prompt alert
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        
     // Switch to alert
        Alert promptAlert = driver.switchTo().alert();
        
     // Get alert text
        System.out.println("Alert message: " + promptAlert.getText());

        // Enter text into prompt alert
        promptAlert.sendKeys("Bugspotter");
        
        
	}

}
