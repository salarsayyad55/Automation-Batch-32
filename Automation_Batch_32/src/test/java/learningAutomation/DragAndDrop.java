package learningAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		//WebElement sourceElement_Bank=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		//WebElement destnElement_DebitAccount=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		//act.dragAndDrop(sourceElement_Bank, destnElement_DebitAccount).build().perform();

		WebElement sourceElement_fivethousand=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destnElement_Amount=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		act.dragAndDrop(sourceElement_fivethousand, destnElement_Amount).build().perform();
	}

}
