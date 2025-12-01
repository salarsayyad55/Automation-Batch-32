package learningAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		

		TakesScreenshot ts= (TakesScreenshot)driver;
		
		 File source= ts.getScreenshotAs(OutputType.FILE);
		 
		 
		 File destination = new File("F:\\JavaPrograms\\Automation_Batch_32\\guru99.png");
		 
		 FileHandler.copy(source, destination);
		                 
		  WebElement logoScreenshot=driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']"));      
		  
		File source1=  logoScreenshot.getScreenshotAs(OutputType.FILE);
		
		File destination1 = new File("F:\\JavaPrograms\\Automation_Batch_32\\logo.png");
		
		FileUtils.copyFile(source1, destination1);
		
		//driver.quit();		
		
		
		                 
		                 

	}

}
