package com.loopbluefly.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoopCommon 
{
	FirefoxDriver div;
	public LoopCommon(FirefoxDriver com)
	{
		div=com;
	}
	public void type(By by, String ty)
	{
		div.findElement(by).sendKeys(ty);
	}
	public void click(By cik)
	{
		div.findElement(cik).click();
		
	}
	public void click(WebElement cik)
	{
		cik.click();
	}
	public void syso()
	{
		System.out.println("Next Step");
	}
	

}
