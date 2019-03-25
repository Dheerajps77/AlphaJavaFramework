package com.magic.alphaPoint.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {
	
	WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
		
	public void WaitForElementVisiblity(WebDriver driver, WebElement webElement, int waitInSeconds)
	{
		
		try
		{			
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(webElement));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}				
	}
	
	public void selectElement(WebElement webElement, String selectByVisibleTextValue)
	{	
	
		try
		{			
			Select select=new Select(webElement);					
			select.selectByVisibleText(selectByVisibleTextValue);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void Click(WebElement element)
	{
		try
		{
			Thread.sleep(1000);
			element.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void Clear(WebElement element)
	{
		try
		{
			Thread.sleep(1000);
			element.clear();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void EnterText(WebElement element, String value)
	{
		try
		{
			Thread.sleep(1000);
			element.sendKeys(value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
