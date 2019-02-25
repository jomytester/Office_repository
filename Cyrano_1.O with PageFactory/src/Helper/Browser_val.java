package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_val {
	
	
static WebDriver driver;
	
	
	public  static WebDriver startbrowser(String browsername , String urllink ) {
		
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "c:\\Users\\innobot-win-user-2\\Documents\\Selenium\\Softwares\\Chrome Driver\\chromedriver.exe");
			driver = new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}
		else if (browsername.equalsIgnoreCase("Firefox"))
		{
			
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(urllink);
		
		return driver;
		
	}
	
	
	
	
	

}
