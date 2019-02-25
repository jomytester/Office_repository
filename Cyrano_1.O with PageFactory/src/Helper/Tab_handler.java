package Helper;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Tab_handler {
	
	WebDriver driver;
	String parent_window;
	
	public Tab_handler(WebDriver driver)
	
	{
		
		this.driver = driver;
		
	}
 
	
	public String parent_tab() {
		
	
	    parent_window =driver.getWindowHandle();
		return parent_window;
	}
	
	
	public void window_handler_tab() {
		
		
    Set<String> allwindows =driver.getWindowHandles();
		
		
		for(String child:allwindows)
		{
			
			
			
			
			if(!parent_window.equalsIgnoreCase(child));
			
			{
				
				driver.switchTo().window(child);
				
			}
			
		}
		
		String title_child = driver.getTitle();
		
		
		System.out.println(title_child);
		
	}
	

	
}
