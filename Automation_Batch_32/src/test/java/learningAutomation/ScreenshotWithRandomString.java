package learningAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class ScreenshotWithRandomString {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String rm= RandomString.make(5);
		File dest= new File("F:\\JavaPrograms\\Automation_Batch_32\\"+rm+".png");
		
		FileUtils.copyFile(src, dest);
		System.out.println("Done with the screenshot");
		driver.close();
		
	}

}
