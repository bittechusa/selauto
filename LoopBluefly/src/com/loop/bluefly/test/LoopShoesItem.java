package com.loop.bluefly.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoopShoesItem 
{
	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver browser = new FirefoxDriver();
		browser.get("http://www.bluefly.com");
		Common com = new Common(browser);
				
		/*browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("new item");
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li/a")).click();
		com.syso();//end
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("women item");
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[2]/a")).click();
		com.syso();//end next 1st row
*/		/*browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("shoes item");
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[3]/a")).click();
		Thread.sleep(5000);*/
		/*browser.findElement(By.xpath("//div[@class='lp-featured-slot']/ul/li[1]/a/div/img")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("shoes new item");
		Thread.sleep(5000);
		int shoesProduct= browser.findElements(By.xpath("//div[@id='productGridContainer']/div/div/a/img")).size();
		System.out.println(shoesProduct);
		for(int a = 1; a < shoesProduct; a++)
		{
			//System.out.println(+a);
			browser.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]/div/a/img")).click();
			
			browser.navigate().back();
			Thread.sleep(5000);
		}//end next 2nd row
*/	
		/*browser.findElement(By.xpath("//div[@class='lp-featured-slot']/ul/li[2]/a/div/img")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("shoes new item");
		Thread.sleep(5000);
		
		int shoesProduct= browser.findElements(By.xpath("//div[@id='productGridContainer']/div/div/a/img")).size();
		System.out.println(shoesProduct);
		for(int a = 1; a < shoesProduct; a++)
		{
			//System.out.println(+a);
			browser.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]/div/a/img")).click();
			browser.navigate().back();
			Thread.sleep(5000);
		}//end next 3rd row
*/		
		/*browser.findElement(By.xpath("//div[@class='lp-featured-slot']/ul/li[3]/a/div/img")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("shoes new item");
		Thread.sleep(5000);
		
		int shoesProduct= browser.findElements(By.xpath("//div[@id='productGridContainer']/div/div/a/img")).size();
		System.out.println(shoesProduct);
		for(int a = 1; a < shoesProduct; a++)
		{
			//System.out.println(+a);
			browser.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]/div/a/img")).click();
			browser.navigate().back();
			Thread.sleep(5000);
		}//end next 4th row
*/
		
		/*browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[3]/a")).click();
		Thread.sleep(5000);//end
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("handbags item");
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[4]/a")).click();
		Thread.sleep(5000);//end
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("jewelry item");
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[5]/a")).click();
		Thread.sleep(5000);//end
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("beauty item");
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[6]/a")).click();
		Thread.sleep(5000);//end
*/		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("men item");
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[7]/a")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@class='lp-featured-slot']/ul/li[1]/a/div/img")).click();
		Thread.sleep(5000);
		int menProduct = browser.findElements(By.xpath("//div[@id='productGridContainer']/div/div/a/img")).size();
		System.out.println(menProduct);
		for(int a=1; a < menProduct; a++)
		{
			browser.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]/div/a/img")).click();
			browser.navigate().back();
			Thread.sleep(5000);
		}
		
		browser.findElement(By.xpath("//div[@id='site-header']/div/ul/li[7]/a")).click();
		Thread.sleep(5000);//end
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("kids item");
		Thread.sleep(5000);
		
		browser.findElement(By.xpath("//div[@id='site-header']/div/ul/li[8]/a")).click();
		Thread.sleep(5000);//end
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("home item");
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@id='site-header']/div/ul/li[9]/a")).click();
		Thread.sleep(5000);//end
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("gifts item");
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[10]/a")).click();
		Thread.sleep(5000);//end
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("designers item");
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[11]/a")).click();
		Thread.sleep(5000);//end
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("sale item");
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@id='site-header']/div/ul/li[12]/a")).click();
		Thread.sleep(5000);
		browser.navigate().back();//end
		
		browser.findElement(By.xpath("//div[@id='global-nav']/ul/li[3]/a")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath("//div[@class='lp-featured-slot']/ul/li[1]/a/div/img")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath("//input[@id='searchterms']")).sendKeys("shoes new item");
		Thread.sleep(5000);
		
		
	}

}
