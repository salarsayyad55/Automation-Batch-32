package learningAutomation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WidnowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/popup.php");

		driver.manage().window().maximize();

		
		String parentWindowID = driver.getWindowHandle(); // Parent Window ID

		System.out.println(parentWindowID);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		// to get parentWindowID + ChildWindowID

		Set<String> AllID = driver.getWindowHandles();
		
		//System.out.println(AllID);
		List<String> list=new ArrayList(AllID);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//to switch focus of driver from parent to child window
		
		driver.switchTo().window(list.get(1));
		
		driver.findElement(By.name("emailid")).sendKeys("Test@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().window(parentWindowID);
		
		
		//MainPage(Parentwindow --Child Window --Main Page (ParentWindow)

	}

}
