package com.cyrano.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cyrano.pages.Login_user_check;
import com.cyrano.pages.Role_permission;

import Helper.Browser_val;

public class Role_permisn {
	WebDriver driver;
	Role_permission rp;
	Login_user_check lc;
	
	@BeforeTest
	public void starts() {
		
		driver= Browser_val.startbrowser("Chrome", "https://v1.cyranolab.io/#/login");
	    rp = PageFactory.initElements(driver, Role_permission.class);
	    lc = PageFactory.initElements(driver, Login_user_check.class);
	}
	
	@Test
	public void role_permisn() throws InterruptedException {
		
		lc.login_credential("tidelpark@mailinator.com", "Test@2345");
		rp.user_role_permission();
		
	}
	
	
	@AfterTest
	public void ends() {
		
		driver.quit();
	}
}
