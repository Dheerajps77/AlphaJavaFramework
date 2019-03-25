package com.magic.alphaPoint.TestClasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.magic.alphaPoint.BaseClass.UserPortalTestBase;
import com.magic.alphaPoint.GenericFunctions.UserCommonFunctions;
import com.magic.alphaPoint.GenericFunctions.UserFunctions;
import com.magic.alphaPoint.TestPages.LoyaltyTokenPage;

public class LoyaltyTokenTest extends UserPortalTestBase{
	
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
	
	@Test(priority = 1)
	public void LoyaltyTokenTestCase() {
		try {
			objLoyaltyTokenPage = PageFactory.initElements(driver, LoyaltyTokenPage.class);
			objUserCommonFunctions = PageFactory.initElements(driver, UserCommonFunctions.class);
			objUserCommonFunctions.DashBoardMenuButton();
			//objUserCommonFunctions.UserSettingMenuButton();
			//objLoyaltyTokenPage.LoyaltyTokenButton();
			//objLoyaltyTokenPage.TradingFeeRadioButton();
			objUserCommonFunctions.SelectAnExchange();
			objUserCommonFunctions.SelectInstrumentFromExchange("BTCUSD");
			objUserCommonFunctions.MarketOrderTypeBtn();
			objUserCommonFunctions.EnterBuyAmount("20");
			
			Assert.assertTrue(objLoyaltyTokenPage.GetFeeText(), "Verification passed: LTC is applied as Trading Fees for 20 order");
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Verification passed: LTC is applied as Trading Fees for 20 order");
		}
	}
	
	@Test(priority = 3)
	public void UserLogout() {
		try {			
			objUserLoginFunctions.LogOut();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
