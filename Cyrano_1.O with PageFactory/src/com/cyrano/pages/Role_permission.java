package com.cyrano.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Role_permission {
	
	
	WebDriver driver;
	
	
	
	
	@FindBy(xpath= "//ul[@class='nav navbar-nav topNavigation_menu']//li//a//span") List<WebElement> User_role;
	
	
	
	public Role_permission(WebDriver driver)
	
	{
		
		this.driver = driver;
	}
	
	public void user_role_permission() throws InterruptedException {
		
		
		for(int i=0;i<User_role.size();i++)
		{
			String[] myArray= new String[User_role.size()];
			
			myArray[i] = User_role.get(i).getText();
			
			
			
		   if(myArray[i].equalsIgnoreCase("Home"))	{
			   
			   
			   System.out.println("he has Viewer role");
		   }
		   
		   else if(myArray[i].equalsIgnoreCase("Produce"))	{
			   
			   
			   System.out.println("he has CONTENT WRITER role");
		   }
            else if(myArray[i].equalsIgnoreCase("Publish"))	
            
            {
			   
			   
			   System.out.println("he has CONTENT MANAGER role");
			   
		   }  else if(myArray[i].equalsIgnoreCase("Setup"))	{
			   
			   
			   System.out.println("he has ADMIN role");
		   }
		   
		
		}
		

		
		
		
		
		
				
		}
			
	}


