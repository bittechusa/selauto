package com.walmart.ui.shared;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common 
{
	FirefoxDriver browser;
	public Common(FirefoxDriver common)
	{
		browser=common;
	}//end of method
	public void click(WebElement by)
	{
		by.click();		
	}
	public void type(By ty, String wq)
	{
		browser.findElement(ty).sendKeys(wq);
	}//end of method
	public void click(By ck)
	{
		browser.findElement(ck).click();
	}//end of method
	public void syso()
	{
		System.out.println("Next Door");
	}

}
