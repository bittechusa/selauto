package com.loop.bluefly.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common 
{
	FirefoxDriver main;
	public Common(FirefoxDriver common)
	{
		main=common;
	}
	public void type(By by, String tp)
	{
		main.findElement(by).sendKeys(tp);
	}
	public void click(WebElement cl)
	{
		cl.click();
	}
	public void click(By by, String ck)
	{
		main.findElement(by).click();
	}
	public void syso()
	{
		System.out.println("Try to Best");
	}

}
