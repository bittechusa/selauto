package com.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility 
{
	//different kinds of methods.
    FirefoxDriver key;
   
	public void type(By by, String text)
	{
	  key.findElement(by).sendKeys(text);
	}//end of method
	public void click(WebElement we)
	{
	  	we.click();
	}//end of method
	public void click(By by)
	{
		key.findElement(by).click();
	}//end of method
	public void verifyTitle(String title,String found)
	{
	if(title.contains(found))	
	{
	System.out.println("right");
	}
	else
	{
	System.out.println("wrong");	
	}
	}//end of method
	public void verifyElement(By id)
	{
	if(key.findElement(id).isDisplayed())	
	{
		System.out.println("element found");
	}
	else
	{
		System.out.println("element not found");
	}
	}//end of method
	public void verifyAnyText(String m)
	{
		if(key.getPageSource().contains(m))
		{
			System.out.println("text is there");
		}
		else
		{
			System.out.println("text is not there");
		}
	}//end of method
	public void type(WebElement id,String keys)
	{
		id.sendKeys(keys);
	}//end of method
public Utility(FirefoxDriver z)	
   {
	  key=z;  
   }
}
