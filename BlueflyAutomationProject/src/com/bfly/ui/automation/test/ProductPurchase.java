package com.bfly.ui.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bfly.ui.automation.shared.Common;

public class ProductPurchase 
{

	public static void main(String[] args) throws Exception 
	{
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://www.bluefly.com");
			
			//WebElement newLink = driver.findElement(By.xpath("//*[@id='main-nav-new']/a"));
			
						
			Common common = new Common(driver);
			//common.click(newLink);
			//Thread.sleep(5000);
			//WebElement womenLink = driver.findElement(By.xpath("//*[@id='main-nav-woman']/a"));
			//common.click(womenLink);
			//Thread.sleep(5000);
			common.click(By.xpath(".//*[@id='main-nav-shoes']/a"));
			//Thread.sleep(5000);
			//driver.close();

	}

}
