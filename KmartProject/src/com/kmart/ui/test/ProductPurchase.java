package com.kmart.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProductPurchase 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver browser = new FirefoxDriver();
		browser.get("http://www.kmart.com");
		browser.manage().window().maximize();
		CommonTest comTest = new CommonTest(browser);
		//comTest.type(By.xpath("//input[@id='keyword']"),"mobile");
		//Thread.sleep(5000);
		//comTest.click(By.xpath("//input[@id='goBtn']"));
		//Thread.sleep(5000);
		comTest.click(By.xpath("//nav[@id='gnf_02_tree_nav']/ul/li[1]/span/a"));
		comTest.syso();
		comTest.click(By.xpath("//nav[@id='gnf_02_tree_nav']/ul/li[2]/span/a"));
		Thread.sleep(5000);
		comTest.click(By.xpath("//nav[@id='gnf_02_tree_nav']/ul/li[3]/span/a"));
		comTest.syso();
		comTest.click(By.xpath("//nav[@id='gnf_02_tree_nav']/ul/li[4]/span/a"));
		Thread.sleep(5000);
		comTest.click(By.xpath("//nav[@id='gnf_02_tree_nav']/ul/li[5]/span/a"));
		comTest.syso();
		comTest.click(By.xpath("//nav[@id='gnf_02_tree_nav']/ul/li[6]/span/a"));
		Thread.sleep(5000);
		browser.close();
		
	}
	

}
