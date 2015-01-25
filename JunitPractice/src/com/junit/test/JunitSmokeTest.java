package com.junit.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class JunitSmokeTest extends JunitBaseTest
{
	@Test
	public void test() throws Exception
	{
		browser.findElement(By.xpath(".//*[@id='gb_70']")).click();
		//browser.findElement(By.id("email")).sendKeys("shossain3913@yahoo.com");
		Thread.sleep(5000);
	
	}
	@Test
	public void test2() throws Exception
	{
		browser.findElement(By.id("Email")).sendKeys("shossain7823@gmail.com");
		//browser.findElement(By.id("pass")).sendKeys("china13");
		Thread.sleep(5000);
	}
	@Test
	public void test3() throws Exception
	{
		
		browser.findElement(By.id("Passwd")).sendKeys("");
		
		//browser.findElement(By.id("u_0_n")).click();
		Thread.sleep(5000);
	}
	@Test
	public void test4() throws Exception
	{
		/*browser.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath(".//*[@id='logout_form']/label/input")).click();
		Thread.sleep(5000);*/
		browser.findElement(By.xpath(".//*[@id='signIn']")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
		Thread.sleep(5000);
		browser.findElement(By.id("gb_71")).click();
		Thread.sleep(5000);
	}

}
