package learningAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingIterator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/popup.php");

		driver.manage().window().maximize();

		
		String parentWindowID = driver.getWindowHandle(); // Parent Window ID

		System.out.println(parentWindowID);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		//to get child windo ID with the help of ITERATOR
		
		Set<String> AllID=driver.getWindowHandles();
		
		//Iterator Method
		
		Iterator<String> IT=	AllID.iterator();
		
		while(IT.hasNext()) {
			String childwindowID=IT.next();
			if(!parentWindowID.equals(childwindowID)) {
				driver.switchTo().window(childwindowID);
				driver.findElement(By.name("emailid")).sendKeys("Test@gmail.com");
			}
		}
	  driver.switchTo().window(parentWindowID);
		

	}

}
