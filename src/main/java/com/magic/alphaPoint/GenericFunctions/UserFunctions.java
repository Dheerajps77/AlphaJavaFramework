package com.magic.alphaPoint.GenericFunctions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.magic.alphaPoint.Utils.EnvironmentPropertiesReader;
import com.magic.alphaPoint.Utils.GenericUtils;

public class UserFunctions {

	protected WebDriver driver;	
	public UserFunctions(WebDriver driver)
	{
		this.driver=driver;
	}

	EnvironmentPropertiesReader epr;
	Properties probj;

	@FindBy(how = How.CSS, using = "select[name = tradingServer]")
	private WebElement selectServer;

	@FindBy(how = How.CSS, using = "input[name = username]")
	private WebElement userLoginName;

	@FindBy(how = How.CSS, using = "input[name=password]")
	private WebElement userLoginPassword;

	@FindBy(how = How.CSS, using = "button.ap-button__btn.ap-button__btn--additive.login-form__btn.login-form__btn--additive")
	private WebElement userLoginButton;

	@FindBy(how = How.CSS, using = "div.standalone-form__footer.login-form__footer a[href='/signup']")
	private WebElement signUpLink;

	@FindBy(how = How.CSS, using = "input[data-test=Email]")
	private WebElement signUpEmail;

	@FindBy(how = How.CSS, using = "input[data-test=Password]")
	private WebElement signUpPassword;

	@FindBy(how = How.CSS, using = "input[data-test='Retype Password']")
	private WebElement signUpRetypePassword;

	@FindBy(how = How.CSS, using = "button.ap-button__btn.ap-button__btn--additive.standalone-form.signup-form__btn.standalone-form.signup-form__btn--additive")
	private WebElement signUpButton;

	@FindBy(how = How.CSS, using = "div.standalone-form__header.signup-form__header")
	private WebElement signUpSuccess;

	@FindBy(how = How.CSS, using = "input[data-test=Username]")
	private WebElement signUpUserName;

	@FindBy(how = How.XPATH, using = "//button[@class='user-summary__popover-menu-trigger page-header-user-summary__popover-menu-trigger']")
	private WebElement loggedInUserName;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class,'popover-menu__item-label') and text()='Sign Out']")
	private WebElement userSignOutButton;
	
	
	GenericUtils objGenericUtils=new GenericUtils(driver);
	
	public void LogIn() {
		try {
			probj = EnvironmentPropertiesReader.getInstance().PropertiesFile();

			String serverName = probj.getProperty("UserPortalServerUrlName");
			String userName = probj.getProperty("UserName");
			String UserPassword = probj.getProperty("UserPassword");

			objGenericUtils.selectElement(selectServer, serverName);
			GenericUtils.EnterText(userLoginName, userName);
			GenericUtils.EnterText(userLoginPassword, UserPassword);
			GenericUtils.Click(userLoginButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void LogOut() {
		try {
			Thread.sleep(2000);
			GenericUtils.Click(loggedInUserName);
			GenericUtils.Click(userSignOutButton);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
