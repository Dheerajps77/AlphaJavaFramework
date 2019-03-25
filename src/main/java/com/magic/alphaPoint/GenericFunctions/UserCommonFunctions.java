package com.magic.alphaPoint.GenericFunctions;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.magic.alphaPoint.Utils.GenericUtils;

public class UserCommonFunctions {

	WebDriver driver;

	public UserCommonFunctions(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "div.page-header-nav__menu-toggle")
	private WebElement dashBoardMenu;

	@FindBy(how = How.CSS, using = "a[href='/exchange']")
	private WebElement selectExchangeLink;

	@FindBy(how = How.CSS, using = "a[href='/settings/profile']")
	private WebElement userSettingMenu;

	@FindBy(how = How.CSS, using = "button.instrument-selector__trigger")
	private WebElement clickOnInstrument;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='flex-table__column instrument-selector-popup__column instrument-selector-popup__column--coin' and text()='DASCUSD']")
	private WebElement selectInstrumentDASCUSD;
	
	@FindBy(how = How.XPATH, using = "//div[@class='flex-table__column instrument-selector-popup__column instrument-selector-popup__column--coin' and text()='BTCUSD']")
	private WebElement selectInstrumentBTCUSD;
	
	@FindBy(how = How.XPATH, using = "//div[@class='flex-table__column instrument-selector-popup__column instrument-selector-popup__column--coin' and text()='ETHCUSD']")
	private WebElement selectInstrumentETHCUSD;
	
	@FindBy(how = How.XPATH, using = "//div[@class='flex-table__column instrument-selector-popup__column instrument-selector-popup__column--coin' and text()='LTCBTC']")
	private WebElement selectInstrumentLTCBTC;
	
	@FindBy(how = How.XPATH, using = "//div[@class='flex-table__column instrument-selector-popup__column instrument-selector-popup__column--coin' and text()='BTCEUR']")
	private WebElement selectInstrumentBTCEUR;
	
	@FindBy(how = How.XPATH, using = "//div[@class='flex-table__column instrument-selector-popup__column instrument-selector-popup__column--coin' and text()='FUELBTC']")
	private WebElement selectInstrumentFUELBTC;
	
	@FindBy(how = How.XPATH, using = "//div[@class='flex-table__column instrument-selector-popup__column instrument-selector-popup__column--coin' and text()='ETHBTC']")
	private WebElement selectInstrumentETHBTC;
	
	@FindBy(how = How.XPATH, using = "//div[@class='flex-table__column instrument-selector-popup__column instrument-selector-popup__column--coin' and text()='LTCUSD']")
	private WebElement selectInstrumentLTCUSD;
		
	@FindBy(how = How.CSS, using = "label[data-test='Market Order Type']")
	private WebElement marketOrderTypeButton;
	
	@FindBy(how = How.CSS, using = "input[data-test='Buy Amount']")
	private WebElement buyAmountTextField;	
	
	GenericUtils objGenericUtils = new GenericUtils(driver);

	public void DashBoardMenuButton() {
		try {

			objGenericUtils.WaitForElementVisiblity(driver, dashBoardMenu, 15);
			GenericUtils.Click(dashBoardMenu);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectAnExchange() {
		try {
			objGenericUtils.WaitForElementVisiblity(driver, selectExchangeLink, 15);
			GenericUtils.Click(selectExchangeLink);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void UserSettingMenuButton() {
		try {

			objGenericUtils.WaitForElementVisiblity(driver, userSettingMenu, 15);
			GenericUtils.Click(userSettingMenu);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// This method click on market button in order entry page
    public void MarketOrderTypeBtn()
    {
        try
        {
            GenericUtils.Click(marketOrderTypeButton);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    // This method enters the Buy Amount value
    public void EnterBuyAmount(String amountEntered)
    {
        try
        {
            Thread.sleep(2000);
            GenericUtils.EnterText(buyAmountTextField, amountEntered);
        }
        catch (Exception e)
        {
        	 e.printStackTrace();
        }
    }
    
	// This method Navigates to Exchange selects the Instrument
	public void SelectInstrumentFromExchange(String instrument) throws InterruptedException
    {
        Thread.sleep(2000);
        GenericUtils.Click(clickOnInstrument);
        Thread.sleep(1000);
        if (instrument.equalsIgnoreCase("DASCUSD"))
        {
            for (int i = 0; i <= 2; i++)
            {
                try
                {
                    GenericUtils.Click(selectInstrumentDASCUSD);
                    break;
                }
                catch (StaleElementReferenceException e)
                {
                   e.printStackTrace();
                }
            }
        }
        
        else if (instrument.equalsIgnoreCase("BTCUSD"))
        {

            for (int i = 0; i <= 2; i++)
            {
                try
                {
                	GenericUtils.Click(selectInstrumentBTCUSD);
                    break;
                }
                catch (StaleElementReferenceException e)
                {
                	 e.printStackTrace();
                }
            }
        }
        else if (instrument.equalsIgnoreCase("ETHCUSD"))
        {
            try
            {
            	GenericUtils.Click(selectInstrumentETHCUSD);
            }
            catch (StaleElementReferenceException e)
            {
            	 e.printStackTrace();
            }

        }
        else if (instrument.equalsIgnoreCase("LTCUSD"))
        {
            try
            {
            	GenericUtils.Click(selectInstrumentLTCUSD);
            }
            catch (StaleElementReferenceException e)
            {
            	 e.printStackTrace();
            }
        }
        else if (instrument.equalsIgnoreCase("LTCBTC"))
        {
            try
            {
            	GenericUtils.Click(selectInstrumentLTCBTC);
            }
            catch (StaleElementReferenceException e)
            {
            	 e.printStackTrace();
            }
        }
        else if (instrument.equalsIgnoreCase("BTCEUR"))
        {
            try
            {
            	GenericUtils.Click(selectInstrumentBTCEUR);
            }
            catch (StaleElementReferenceException e)
            {
            	 e.printStackTrace();
            }
        }
        else if (instrument.equalsIgnoreCase("FUELBTC"))
        {
            try
            {
            	GenericUtils.Click(selectInstrumentFUELBTC);
            }
            catch (StaleElementReferenceException e)
            {
            	 e.printStackTrace();
            }
        }
        else if (instrument.equalsIgnoreCase("ETHBTC"))
        {
            try
            {
            	GenericUtils.Click(selectInstrumentETHBTC);
            }
            catch (StaleElementReferenceException e)
            {
            	 e.printStackTrace();
            }
        }
    }
}
