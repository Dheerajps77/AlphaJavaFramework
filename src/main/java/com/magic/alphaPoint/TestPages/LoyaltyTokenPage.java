package com.magic.alphaPoint.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.magic.alphaPoint.Utils.GenericUtils;

public class LoyaltyTokenPage {

	WebDriver driver;

	public LoyaltyTokenPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "li[data-test='Loyalty Token']")
	private WebElement loyaltyTokenLink;

	@FindBy(how = How.CSS, using = "div.page-header-nav__menu-toggle")
	private WebElement userSettingMenu;

	@FindBy(how = How.CSS, using = "label[for=loyaltyToken5]")
	private WebElement tradingFee;

	@FindBy(how = How.CSS, using = "span[data-test=Fees]")
	private WebElement marketOrderFees;

	GenericUtils objGenericUtils = new GenericUtils(driver);

	public void LoyaltyTokenButton() {
		try {
			objGenericUtils.WaitForElementVisiblity(driver, loyaltyTokenLink, 15);
			GenericUtils.Click(loyaltyTokenLink);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void TradingFeeRadioButton() {
		try {
			objGenericUtils.WaitForElementVisiblity(driver, tradingFee, 15);
			GenericUtils.Click(tradingFee);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void UserSettingMenuButton() {
		try {
			objGenericUtils.WaitForElementVisiblity(driver, userSettingMenu, 15);
			GenericUtils.Click(userSettingMenu);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Boolean GetFeeText() {
		Boolean flag = false;
		try {
			Thread.sleep(2000);
			String feeText = marketOrderFees.getText();
			String[] str = feeText.split(" ");
			String feeLTCTextValue = str[0];
			if (feeLTCTextValue.equalsIgnoreCase("LTC")) {
				flag = true;

				System.out.println("Verfication passed");
				// logger.LogCheckPoint(String.Format(LogMessage.AppliedFeeIsLTC, feeText));
			} else {
				System.out.println("Verfication failed");
				// logger.LogCheckPoint(String.Format(LogMessage.AppliedFeeIsNotLTC, feeText));
			}
			return flag;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

}
