package com.magic.alphaPoint.TestClasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.magic.alphaPoint.BaseClass.UserPortalTestBase;

import com.magic.alphaPoint.GenericFunctions.UserCommonFunctions;
import com.magic.alphaPoint.GenericFunctions.UserFunctions;
import com.magic.alphaPoint.GenericFunctions.UserFunctions;
import com.magic.alphaPoint.TestPages.LoyaltyTokenPage;

public class UserLoginTest extends UserPortalTestBase {

	UserFunctions objUserLoginFunctions = new UserFunctions(driver);
	LoyaltyTokenPage objLoyaltyTokenPage = new LoyaltyTokenPage(driver);
	UserCommonFunctions objUserCommonFunctions = new UserCommonFunctions(driver);
	UserFunctions objUserLogoutFunctions = new UserFunctions(driver);
	
	
	
	@Test(priority = 0)
	public void UserLogin() {
		try {
			objUserLoginFunctions = PageFactory.initElements(driver, UserFunctions.class);
			objUserLoginFunctions.LogIn();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	@Test(priority = 2)
	public void LoyaltyTokenTest() {
		try {
			objLoyaltyTokenPage = PageFactory.initElements(driver, LoyaltyTokenPage.class);
			objUserCommonFunctions = PageFactory.initElements(driver, UserCommonFunctions.class);
			objUserCommonFunctions.DashBoardMenuButton();
			objUserCommonFunctions.UserSettingMenuButton();
			objLoyaltyTokenPage.LoyaltyTokenButton();
			objLoyaltyTokenPage.TradingFeeRadioButton();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
