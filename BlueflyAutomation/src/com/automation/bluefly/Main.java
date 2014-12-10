package com.automation.bluefly;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Main {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//dr.getTitle();
		//String pt = dr.getTitle();
		//System.out.println(pt);
		Common ob = new Common(dr);
		/*ob.verifyTitle(pt, "Blue");
		//Home page start:
		ob.verifyElementPresent(By.xpath(".//*[@id='homeContainer']/header/div[1]/div[1]/a"));
		Thread.sleep(5000);
		ob.click(By.xpath("//div[@class='site-header-sign-in']/span[2]"));
		dr.navigate().back();
		Thread.sleep(5000);
		ob.click(By.xpath("//div[@class='site-header-shopping-bag']/a/span[1]"));
		dr.navigate().back();
		Thread.sleep(5000);
		ob.click(By.xpath("//div[@class='site-header-shopping-bag']/a/span[3]"));
		dr.navigate().back();
		Thread.sleep(5000);
		ob.type(By.xpath("//input[@id='searchterms']"), "kids shoe");
		ob.click(By.xpath("//div[@class='site-search']/form/span[2]"));
		dr.navigate().back();
		Thread.sleep(5000);
		int mainCatagory = dr.findElements(By.xpath(".//*[@id='global-nav']/ul/li")).size();
		System.out.println(mainCatagory);
		for(int a = 1; a < mainCatagory; a++)
		{
			ob.click(By.xpath(".//*[@id='global-nav']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[1]/div[1]/a/img"));
		Thread.sleep(4000);
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@class='hp-secondary-left']/ul[1]/li[1]/a/img"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@class='hp-secondary-left']/ul[1]/li[2]/a/img"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@class='hp-secondary-left']/ul[1]/li[3]/a/img"));
		dr.navigate().back();
		Thread.sleep(4000);
		ob.syso();ob.click(By.xpath("//a[@id='secondary-right-link']/img"));
		Thread.sleep(4000);
		dr.navigate().back();
		ob.syso();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[2]/ul/li[1]/a/img"));
		Thread.sleep(3000);
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[2]/ul/li[2]/a/img"));
		Thread.sleep(3000);
		dr.navigate().back();
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[2]/ul/li[3]/a/img"));
		Thread.sleep(3000);
		dr.navigate().back();
		Thread.sleep(4000);
		ob.syso();
		ob.click(By.xpath("//div[@id='homepage-main-content']/div[3]/img"));
		Thread.sleep(3000);
		dr.navigate().back();
		Thread.sleep(4000);
		ob.verifyElementPresent(By.xpath("//div[@id='primary1']/div/div[1]/div[2]"));
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@id='primary1']/div"));
		Thread.sleep(4000);
		dr.navigate().back();
		Thread.sleep(4000);
		ob.syso();
		ob.verifyElementPresent(By.xpath("//div[@id='featured-categories']/h4"));
		int hauteList = dr.findElements(By.xpath("//div[@id='featured-categories']/ul/li")).size();
		System.out.println(hauteList);
		for(int a= 1; a < hauteList; a++)
		{
			ob.click(By.xpath("//div[@id='featured-categories']/ul/li[" +a+ "]"));
			Thread.sleep(3000);
			dr.navigate().back();
			Thread.sleep(3000);
		}
		ob.syso();
		System.out.println("Home page done.");
		System.out.println("Start New page(NewArival).");
		ob.click(By.xpath(".//*[@id='featured-categories']/ul/li[2]"));
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[1]/a"));
		int newArivalProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(newArivalProduct);
		for(int a = 1; a < newArivalProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+ "]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();//5
		ob.click(By.xpath("//div[@class='listNavSubCatsContainer']/div"));
		int sideCatagory = dr.findElements(By.xpath("//div[@class='listNavSubCatsContainer']/div")).size();
		System.out.println(sideCatagory);
		for(int a = 1; a<sideCatagory; a++)
		{
			ob.click(By.xpath("//div[@class='listNavSubCatsContainer']/div["+a+"]"));
			Thread.sleep(3000);
			dr.navigate().back();
			Thread.sleep(3000);
		}*/
		//New page done.
		//Women page start:
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[2]/a"));
		Thread.sleep(5000);
		ob.verifyElementPresent(By.xpath("//div[@id='departmentLeftNaviContainer']/h1"));
		Thread.sleep(3000);
		/*int womenCatagory1 = dr.findElements(By.xpath("//div[@id='departmentLeftNaviContainer']/div[1]/ul/li")).size();
		System.out.println(womenCatagory1);
		for(int a = 1; a < womenCatagory1; a++)
		{
			ob.click(By.xpath("//div[@id='departmentLeftNaviContainer']/div[1]/ul/li[" +a+"]"));
			Thread.sleep(4000);
			dr.navigate().back();
			Thread.sleep(4000);
		}
		int womenCatagory2 = dr.findElements(By.xpath("//div[@id='departmentLeftNaviContainer']/div[2]/ul/li")).size();
		System.out.println(womenCatagory2);
		for(int a = 1; a < womenCatagory2; a++)
		{
			ob.click(By.xpath("//div[@id='departmentLeftNaviContainer']/div[2]/ul/li[" +a+"]"));
			Thread.sleep(3000);
			dr.navigate().back();
			Thread.sleep(3000);
		}
		int womenCatagory3 = dr.findElements(By.xpath("//div[@id='departmentLeftNaviContainer']/div[3]/ul/li")).size();
		System.out.println(womenCatagory3);
		for(int a = 1; a < womenCatagory3; a++)
		{
			ob.click(By.xpath("//div[@id='departmentLeftNaviContainer']/div[3]/ul/li[" +a+"]"));
			Thread.sleep(3000);
			dr.navigate().back();
			Thread.sleep(3000);
		}
		int womenCatagory4 = dr.findElements(By.xpath("//div[@id='departmentLeftNaviContainer']/div[4]/ul/li")).size();
		System.out.println(womenCatagory4);
		for(int a = 1; a < womenCatagory4; a++)
		{
			ob.click(By.xpath("//div[@id='departmentLeftNaviContainer']/div[4]/ul/li[" +a+"]"));
			Thread.sleep(3000);
			dr.navigate().back();
			Thread.sleep(3000);
		}*/
		ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[1]"));
		int women1stProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(women1stProduct);
		for(int a = 1; a < women1stProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		dr.navigate().back();
		Thread.sleep(5000);
		ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[2]"));
		int women2ndProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(women2ndProduct);
		for(int a = 1; a < women2ndProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		dr.navigate().back();
		Thread.sleep(5000);
		ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[3]"));
		int women3rdtProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(women3rdtProduct);
		for(int a = 1; a < women3rdtProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		dr.navigate().back();
		Thread.sleep(5000);
		ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[4]"));
		int women4thProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(women4thProduct);
		for(int a = 1; a < women4thProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		dr.navigate().back();
		Thread.sleep(5000);
		ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[5]"));
		int women5thProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(women5thProduct);
		for(int a = 1; a < women5thProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		dr.navigate().back();
		Thread.sleep(5000);
		ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[6]"));
		int women6thProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(women6thProduct);
		for(int a = 1; a < women6thProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		System.out.println("Women page done.");
		System.out.println("Shoes page start:");
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[3]/a"));
		Thread.sleep(4000);
		ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[1]"));
		int shoes1stProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(shoes1stProduct);
		for(int a = 1; a < shoes1stProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[2]"));
		int shoes2ndProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(shoes2ndProduct);
		for(int a = 1; a < shoes2ndProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[3]"));
		int shoes3rdtProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(shoes3rdtProduct);
		for(int a = 1; a < shoes3rdtProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[4]"));
		int shoes4thProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(shoes4thProduct);
		for(int a = 1; a < shoes4thProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[5]"));
		int shoes5thProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(shoes5thProduct);
		for(int a = 1; a < shoes5thProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[6]"));
		int shoes6thProduct = dr.findElements(By.xpath("//div[@id='productGridContainer']/div")).size();
		System.out.println(shoes6thProduct);
		for(int a = 1; a <shoes6thProduct; a++)
		{
			ob.click(By.xpath("//div[@id='productGridContainer']/div[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Shoes page done.
		//Handbags page start:
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[4]/a"));
		int handbagsProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(handbagsProductSize);
		for(int a = 1; a < handbagsProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Handbags page done.
		//Jewelry page start:
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[5]/a"));
		int jewelryProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(jewelryProductSize);
		for(int a = 1; a < jewelryProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Jewelry page done.
		//Beauty page start:
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[6]/a"));
		int beautyProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(beautyProductSize);
		for(int a = 1; a < beautyProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Beauty page done.
		//Men page start:
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[7]/a"));
		int menProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(menProductSize);
		for(int a = 1; a < menProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Men page done.
		//Kids page start:
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[8]/a"));
		int kidsProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(kidsProductSize);
		for(int a = 1; a < kidsProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		ob.syso();
		//Kids page done.
		
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[9]/a"));
		int homeProductSize = dr.findElements(By.xpath("//div[@class='lp-featured-slot']/ul/li")).size();
		System.out.println(homeProductSize);
		for(int a = 1; a < homeProductSize; a++)
		{
			ob.click(By.xpath("//div[@class='lp-featured-slot']/ul/li[" +a+"]"));
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[10]/a"));
		
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[11]/a"));
		dr.navigate().back();
		ob.click(By.xpath("//div[@id='global-nav']/ul/li[12]/a"));
		dr.navigate().back();
//		dr.navigate().refresh();
		ob.syso();//11
		Thread.sleep(5000);
		

		
		
		
		dr.quit();
		

	}

}
