package com.cyrano.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.cyrano.pages.Login_user_check;
import com.cyrano.pages.Role_permission;

import Helper.Browser_val;

public class Login_valid_credential {
	
	WebDriver driver;
	SoftAssert assertion = new SoftAssert();
	Login_user_check login_check;
	Role_permission rp;
	
	@BeforeMethod
	public void Browser_setup() {
		
		 driver = Browser_val.startbrowser("Chrome", "https://www.cyranolab.io/#/login");
	     login_check = PageFactory.initElements(driver, Login_user_check.class);		
	}
	

	@Test(priority = 2)
    public void login_Error_validation() throws InterruptedException
    {
	     login_check.login_credential("itpark@mailinator.com", "Test@234");
	     String actual_result = Login_user_check.login_failedMsg();
	     assertion.assertEquals(actual_result, actual_result.contains("Login failed"));
	     login_check.login_button();
	     login_check.login_button();
	     login_check.login_button();
	     login_check.login_button();
	     String actual_result1 = Login_user_check.login_failedMsg();
	     assertion.assertEquals(actual_result1, actual_result1.contains("Your account has been locked"));
	  }

    @Test(priority = 3)
	public void login_Valid_credential_check() throws InterruptedException {
		
		     login_check.login_credential("itpark@mailinator.com", "Test@2345");   
		     rp.user_role_permission();
	}
    
    @AfterMethod
    public void browser_Close() {
    	
    	driver.quit();
    }
}
    
 