package com.junit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitBaseTest 
{
	static FirefoxDriver browser =  new FirefoxDriver();
	@BeforeClass
	static public void beforeStart() throws Exception
	{
		
		//browser.get("http://www.facebook.com");
		browser.get("http://www.google.com");
		Thread.sleep(5000);
	}
	/*@Before
	public void before()
	{
		System.out.println();
	}*/
	@AfterClass
	static public void afterEnd() throws Exception
	{
		Thread.sleep(5000);
		browser.quit();
	}
	/*@After
	public void after()
	{
		System.out.println("After");
	}*/
	

}
