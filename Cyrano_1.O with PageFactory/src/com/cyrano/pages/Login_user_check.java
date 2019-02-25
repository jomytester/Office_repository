package com.cyrano.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class Login_user_check {
	
	
	WebDriver driver;
	
	
	@FindBy(name= "username") WebElement username;
	@FindBy(id="next") WebElement click_on_next;
	@FindBy(name="password") WebElement pwd;
	@FindBy(id="login") WebElement Login_button;

	@FindBy(xpath = "//span[@class='errortxt-cls']" )static WebElement loginFailed_Errormsg;
	
	
	public Login_user_check(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void login_credential(String user_id , String password) {
		
		username.sendKeys(user_id);
		click_on_next.click();
		pwd.sendKeys(password);
		Login_button.click();
				
	}
	
	
   public void login_username(String user_id ) {
		
		username.sendKeys(user_id);
		click_on_next.click();
		 
		}
   
   public void login_password( String password) {
	   
	   pwd.sendKeys(password);
   }
	
    public void login_button() {
	   
	 Login_button.click();
		
   }
    
   

    public static String login_failedMsg() {
    	
    	
    	String error_msg = loginFailed_Errormsg.getText();
    	return error_msg;
    }
     
}
