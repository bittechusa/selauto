package com.kmart.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonTest 
{
	FirefoxDriver fd;
	public CommonTest(FirefoxDriver cTest)
	{
		fd=cTest;
	}
	public void type(By tp, String st)
	{
		fd.findElement(tp).sendKeys(st);
	}//end of method
	public void click(By ck)
	{
		fd.findElement(ck).click();
		
	}//end of method
	public void click(WebElement we)
	{
		we.click();
	}//end of method
	
	public void syso()
	{
		System.out.println("Next");
	}
	

}
