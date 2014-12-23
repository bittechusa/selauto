package com.bfly.ui.automation.shared;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common 
{
	FirefoxDriver driver;
	public void click(WebElement we)
	{
		we.click();
	}
	
	public void click(By by)
	{
		driver.findElement(by).click();
	}
	public Common(FirefoxDriver driver)
	{
		this.driver=driver;
	}

}