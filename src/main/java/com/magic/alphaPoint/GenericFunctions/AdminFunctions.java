package com.magic.alphaPoint.GenericFunctions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.magic.alphaPoint.Utils.EnvironmentPropertiesReader;
import com.magic.alphaPoint.Utils.GenericUtils;

public class AdminFunctions {
	
	WebDriver driver;
	EnvironmentPropertiesReader epr;
	Properties probj;
	
	public AdminFunctions(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.CSS, using="input[placeholder=Username]")
	private WebElement usernameLoginTextField; 
	
	@FindBy(how=How.CSS, using="input[placeholder=Password]")
	private WebElement passwordLoginTextField; 
	
//	@FindBy(how=How.CSS, using="button#login-btn")
//	private WebElement loginButton; 
	
	@FindBy(css="button#login-btn")
	private WebElement loginButton;
	
	@FindBy(how=How.CSS, using="span#SignOut")
	private WebElement signOutButton; 
	
	@FindBy(how=How.CSS, using="button#OpenUserMenu")
	private WebElement openUsersMenuButton; 
	
	
	GenericUtils objGenericUtils=new GenericUtils(driver);
	
	public void AdminLogin()
	{
		try
		{
			probj = EnvironmentPropertiesReader.getInstance().PropertiesFile();
			String adminUserName=probj.getProperty("AdminName");
			String adminPassWord=probj.getProperty("AdminPassword");			
			GenericUtils.EnterText(usernameLoginTextField, adminUserName);
			GenericUtils.EnterText(passwordLoginTextField, adminPassWord);
			GenericUtils.Click(loginButton);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void AdminLogout()
	{
		
		try
		{
			Thread.sleep(2000);
			GenericUtils.Click(openUsersMenuButton);
			GenericUtils.Click(signOutButton);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
