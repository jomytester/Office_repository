package com.cyrano.testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cyrano.pages.Forgetpassowrd_check;

import Helper.Browser_val;
import Helper.Tab_handler;

public class Forget_password {
	
	
	WebDriver driver;
	Forgetpassowrd_check fc;
	
	@BeforeClass
	public void classprint() {
		
		
		System.out.println("Print Before class");
	}
	
	
	@BeforeMethod
	public void StartTest() {
		
		driver = Browser_val.startbrowser("Chrome", "https://www.cyranolab.io/#/login");
		 fc = PageFactory.initElements(driver, Forgetpassowrd_check.class);
		
		
	}
	@Test
	public void Check_forgetpassword_credential() throws InterruptedException {
		
		
		
		fc.forgetpassword_check("itpark1111@mailinator.com");
		fc.submit_button();

		String error_ms = driver.findElement(By.xpath("//*[@id=\"errordiv_padding\"]")).getText();
		if(error_ms.equalsIgnoreCase("user does not exist"));
		{
			
			System.out.println("Test Passed");
			
		}	
		
		driver.quit();
	
	}
	
	@Test
	
	public void Check_forgetpassword_credential12() {
	
	fc.forgetpassword_check("dfvm454");
	fc.submit_button();
	String invalid_for = driver.findElement(By.xpath("/html/body/cyrano-app/ng-component/form/div/div/fieldset/div[2]/div/p/span")).getText();
	System.out.println(invalid_for);

	
	}
/*	
	@Test
	public void read_forgetpwd() throws InterruptedException {
		
		fc.forgetpassword_check("ibot.cliq@mailinator.com");
		fc.cancel_button();
		fc.forgetpassword_check("ibot.cliq@mailinator.com");
		fc.submit_button();
		Thread.sleep(2000);
		fc.ok_button1();
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin\", \"ibot.cliq@gmail.com");
		fc.mail_navigator("ibot.cliq@gmail.com","Test@2345");
			
	    Tab_handler th = new Tab_handler(driver);
	    String parent_window =th.parent_tab();
	     
	 	th.window_handler_tab();
	 	
	 	fc.password_validator("Test@2345", "Test@2345");
	 	fc.resetpassword_btn();
	
		
	}
	
*/
	
	
	@AfterMethod
	public void browser_quit() {
		
		driver.quit();
	}
	
	@AfterClass
	public void classprint1() {
		
		
		System.out.println("Print Before class");
	}
	
	
}
