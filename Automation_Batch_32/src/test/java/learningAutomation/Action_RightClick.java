package learningAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//Scenario number - Right Click
		
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//act.contextClick(rightClick).build().perform();
		
		WebElement quit =driver.findElement(By.xpath("//span[text()='Quit']"));
       
		act.contextClick(rightClick).click(quit).build().perform();
	}

}
