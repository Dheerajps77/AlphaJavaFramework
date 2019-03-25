package com.magic.alphaPoint.GenericFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.magic.alphaPoint.Utils.GenericUtils;

public class AdminCommonFunctions {
	
	
	WebDriver driver;
	public AdminCommonFunctions(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.CSS, using="a[href='#/accounts']")
	private WebElement accountsTabMenuLink;
	
	@FindBy(how=How.CSS, using="input#OpenAccountByIdInput")
	private WebElement openAccountByID;
	
	@FindBy(how=How.CSS, using="button#OpenAccountById")
	private WebElement openAccountButton;
	
	@FindBy(how=How.CSS, using="a#OpenEditAccountInformation")
	private WebElement openEditAccountInformationLink;
	
	@FindBy(how=How.CSS, using="input[name='LoyaltyEnabled']")
	private WebElement loyaltyFeesEnabledCheckboxButton;
	
	@FindBy(how=How.CSS, using="button#SaveAccountForm")
	private WebElement saveAccountButton;
	
	
	public void SelectTicketsMenu()
    {
        try
        {
            GenericUtils.Click(accountsTabMenuLink);
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
    }
	
	//This method Search account by putting the account id in the text field
    public void OpenAccountByIDText(String UserID)
    {
        try
        {
            Thread.sleep(2000);
            GenericUtils.EnterText(openAccountByID, UserID);
        }
        catch (Exception e)
        {
        	e.printStackTrace();
        }
    }
    
  //This method will click on "Open" button while searching the accountID
    public void OpenAccountBtn()
    {
        try
        {
            Thread.sleep(2000);
            GenericUtils.Click(openAccountButton);
        }
        catch (Exception e)
        {
        	e.printStackTrace();
        }
    }
    
  //This functions will click on "Edit Account Information" in Account Tab
    public void EditInformationButton()
    {
        
        try
        {
        	Thread.sleep(2000);
        	GenericUtils.Click(openEditAccountInformationLink);
        }
        catch (Exception e)
        {
        	e.printStackTrace();
        }
    }
    
    
    //This functions if loyalty fee checkBox is enabled or disabled
    public void LoyaltyFeeCheckedOrUnchecked()
    {
        
        try
        {
        	Thread.sleep(2000);
            if(!loyaltyFeesEnabledCheckboxButton.isSelected())
            {
            	GenericUtils.Click(loyaltyFeesEnabledCheckboxButton);                    
            }
        }
        catch (Exception e)
        {
        	e.printStackTrace();
        }
    }
    
    
    //This method will click on "Save" button in edit account information window section
    public void SaveButton()
    {
        try
        {
            Thread.sleep(2000);
            GenericUtils.Click(saveAccountButton);
        }
        catch (Exception e)
        {
        	e.printStackTrace();
        }
    }
}
