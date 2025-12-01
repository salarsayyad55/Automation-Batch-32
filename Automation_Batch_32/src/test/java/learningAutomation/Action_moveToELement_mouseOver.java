package learningAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_moveToELement_mouseOver {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		WebElement seleniumMouseOver=driver.findElement(By.xpath("//a[text()='Selenium']"));
		
		act.moveToElement(seleniumMouseOver).build().perform();
		
		//mouseOver + click
		
		act.moveToElement(seleniumMouseOver).click().build().perform();
		


	}

}
