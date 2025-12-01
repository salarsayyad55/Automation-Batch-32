package learningAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewEdgeDriver {

	public static void main(String[] args) throws Exception {
		
/*		WebDriverManager.edgedriver().setup();
		
	//ChromeDriver driver = new ChromeDriver();
	
	EdgeDriver driver = new EdgeDriver();
	
	driver.get("https://www.facebook.com/login.php/");*/
		
		/*WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php/");*/
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(2000);
		 driver.navigate().refresh(); 
		
	//String url=	driver.getCurrentUrl();
	//System.out.println(url);
	
	//String pageSource_HTML_WholeCode=driver.getPageSource();
	//System.out.println(pageSource_HTML_WholeCode);
		
		//driver.close();   //current opened window - close
		
		//driver.quit();  // it will close all opened window along with the browser
	

	}

}
