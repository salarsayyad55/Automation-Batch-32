package learningAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Handling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		// select[@name='country']
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));

		Select s = new Select(dropdown);

		// s.selectByIndex(4);

		s.selectByVisibleText("INDIA");

		List<WebElement> allOption = s.getOptions();

		int count = allOption.size();
		System.out.println(count);
		
		//print all options from listbox
		
		for(int i=0; i<count; i++) {
		String ss=	allOption.get(i).getText();
		System.out.println(ss);
		}
		
	

	}

}
