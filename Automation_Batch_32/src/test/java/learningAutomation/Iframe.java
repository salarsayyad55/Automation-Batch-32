package learningAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		// frame1

		driver.switchTo().frame(0);  //main page to frame1
		driver.findElement(By.name("mytext1")).sendKeys("Bugspotter");

		driver.switchTo().defaultContent();  //main page
		// frame2

		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
         driver.switchTo().frame(frame2);  //main page to frame2
         
         driver.findElement(By.name("mytext2")).sendKeys("Batch 32");
         
         driver.switchTo().defaultContent();
         
         //frame3
         WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
         driver.switchTo().frame(frame3);//mainpage to frame3
         
         driver.findElement(By.name("mytext3")).sendKeys("Software Testing");
         
         driver.switchTo().defaultContent();
         WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
         driver.switchTo().frame(frame4);
         driver.findElement(By.name("mytext4")).sendKeys("Devops");
         
         driver.switchTo().defaultContent();
         WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
         driver.switchTo().frame(frame5);
         driver.findElement(By.name("mytext5")).sendKeys("Devops");
         
         driver.switchTo().defaultContent();
         
	}

}
