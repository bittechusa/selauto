package com.walmart.ui.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.walmart.ui.shared.Common;

public class ProductPurchase 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver browser=new FirefoxDriver();
		browser.get("http://www.walmart.com");
		//browser.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//browser.manage().window().maximize();
		Common common = new Common(browser);
		common.type(By.xpath("//div[@class='searchbar-typeahead']/div/span/input"), "new appreal");
		Thread.sleep(5000);
		WebElement MyLocalStoreLink=browser.findElement(By.xpath("//div[@class='global-secondary-nav']/ul/li[1]/a"));
		common.click(MyLocalStoreLink);
		Thread.sleep(5000);
		common.syso();
		common.click(By.xpath("//div[@class='global-secondary-nav']/ul/li[2]/a"));
		Thread.sleep(5000);
		WebElement ValueOfTheDayLink=browser.findElement(By.xpath("//div[@class='global-secondary-nav']/ul/li[3]/a"));
		common.click(ValueOfTheDayLink);
		Thread.sleep(5000);
		common.syso();
		common.click(By.xpath("//div[@class='global-secondary-nav']/ul/li[4]/a"));
		Thread.sleep(5000);
		WebElement CyberMondayDaysLink=browser.findElement(By.xpath("//ul[@class='nav-dropdown js-nav-dropdown nav-dropdown-homepage']/li/a"));
		common.click(CyberMondayDaysLink);
		Thread.sleep(5000);
		common.click(By.xpath("//ul[@class='nav-dropdown js-nav-dropdown nav-dropdown-homepage']/li[2]/button"));
		Thread.sleep(5000);
		common.syso();
		common.click(By.xpath("//ul[@class='nav-dropdown js-nav-dropdown nav-dropdown-homepage']/li[6]/button"));
		Thread.sleep(5000);
		common.syso();
		browser.close();
		
	}

}
