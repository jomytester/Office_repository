package com.cyrano.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgetpassowrd_check {
	
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/cyrano-app/ng-component/div/div/div/form/div[4]/div[1]/a") WebElement frgt;
	@FindBy(xpath="/html/body/cyrano-app/ng-component/form/div/div/fieldset/div[2]/input") WebElement forget_password;
	@FindBy(xpath = "/html/body/cyrano-app/ng-component/form/div/div/fieldset/div[4]/div/button[1]") WebElement submit_btn;
	@FindBy(xpath="/html/body/cyrano-app/ng-component/form/div/div/fieldset/div[4]/div/button[2]") WebElement cancel_btn;
	@FindBy(xpath = "/html/body/bs-modal/div/div/div/bs-modal-footer/div/button") WebElement ok_button;
	
	@FindBy(id="inboxfield") WebElement mailnator_id;
	@FindBy(xpath="/html/body/section[1]/div/div[3]/div[2]/div[2]/div[1]/span/button") WebElement go_mail;
	@FindBy(xpath="//*[@id=\"row_itpark-1547729321-6383725\"]/td[4]") WebElement Clickon_mail;
	@FindBy(xpath="/html/body/table/tbody/tr/td[2]/div/table[2]/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr/td/table/tbody/tr[2]/td/a") WebElement click_resetPwd;
	
	
	@FindBy(id="identifierId") WebElement gmail_username;
	@FindBy(id="identifierNext") WebElement gmail_clickNext;
	@FindBy(name="password") WebElement gmail_password;
	@FindBy(id="passwordNext") WebElement gmail_login_btn;
	@FindBy(xpath="//*[@id=\":33\"]") WebElement clickon_mail;
	@FindBy(partialLinkText="Reset") WebElement reset_pwd;
	
	@FindBy(id="newpassWord") WebElement NewPassword_creation;
	@FindBy(name="confirmPasswordVal") WebElement Reenter_newPassword;
	
	@FindBy(partialLinkText = "Reset") WebElement resetpassword_btn;
	@FindBy(partialLinkText = "Cancel") WebElement resetpassword_cancel_btn;
	
	public Forgetpassowrd_check(WebDriver Driver) {
		
		
		this.driver = driver;
		
	}
	
	
	public void forgetpassword_check(String enter_email)  {
		
		frgt.click();
		forget_password.sendKeys(enter_email);
	}
	

	public void submit_button()  {
		
		submit_btn.click();
	}
	
	public void cancel_button(){
		
		cancel_btn.click();
   	}
	
	public void ok_button1()  {
		
		ok_button.click();
		
	}
	
	public void mail_navigator( String user_id , String Pwd) throws InterruptedException {
		
    
		
		gmail_username.sendKeys(user_id);
		
		gmail_clickNext.click();
		
		gmail_password.sendKeys(Pwd);
		
		gmail_login_btn.click();

		clickon_mail.click();
	
        reset_pwd.click();
		
	}

	
	public void password_validator(String new_pwd ,String renew_pwd) {
		
		NewPassword_creation.sendKeys(new_pwd);
		Reenter_newPassword.sendKeys(renew_pwd);
	}
	
	public void resetpassword_btn() {
		
		resetpassword_btn.click();
	}
	
    public void resetpassword_cancel_btn() {
		
    	resetpassword_cancel_btn.click();
	}
	
}
