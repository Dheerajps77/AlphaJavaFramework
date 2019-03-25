package com.magic.alphaPoint.TestClasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import com.magic.alphaPoint.BaseClass.AdminPortalTestBase;
import com.magic.alphaPoint.GenericFunctions.AdminFunctions;

public class AdminLoginTest extends AdminPortalTestBase{
	
	AdminFunctions objAdminLoginFunctions=new AdminFunctions(driver);
	
	
	@Test(priority=0)
	public void AdminLogin()
	{
		try
		{
			objAdminLoginFunctions=PageFactory.initElements(driver, AdminFunctions.class);
			objAdminLoginFunctions.AdminLogin();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void AdminLogOut()
	{
		try
		{
			objAdminLoginFunctions=PageFactory.initElements(driver, AdminFunctions.class);
			objAdminLoginFunctions.AdminLogout();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
