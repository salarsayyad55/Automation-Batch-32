package learningAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		// Web Element Identified
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		// bugspotter -- shift key - down -value send - shift key up

		act.keyDown(username, Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();

		// cntr+a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		// cntrl+c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		// Element click
          driver.findElement(By.xpath("//input[@type='password']")).click();
	
		// cntr+v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

}
