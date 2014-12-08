package com.main.startBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.methods.Utility;

public class OpenBrowser //firefox browser.
{

	public static void main(String[] args) throws Exception 
	{
	FirefoxDriver key= new FirefoxDriver(); //open a blank browser
	key.get("http://www.facebook.com");
	key.manage().window().maximize();
	System.out.println(key.getTitle());
	Utility u= new Utility(key);
	//facebook.com
	//use of type method in an another way.
	WebElement firstname=key.findElement(By.id("u_0_3"));
	WebElement lastname= key.findElement(By.id("u_0_1"));
	WebElement email= key.findElement(By.id("u_0_5"));
	WebElement reemail= key.findElement(By.id("u_0_8"));
	WebElement password= key.findElement(By.id("u_0_a"));
	u.type(firstname, "shahriar");
	u.type(lastname, "azad");
	u.type(email, "rizvi@gmail.com");
	u.type(reemail, "rizvi@gmail.com");
	u.type(password, "123456");
	//bluefly.com
	//use of click method
/*	WebElement newlink =key.findElement(By.xpath(".//*[@id='main-nav-new']/a"));
	newlink.click();
	Thread.sleep(5000);
	WebElement women = key.findElement(By.xpath(".//*[@id='main-nav-woman']/a"));
	women.click();
	Thread.sleep(5000);
	WebElement shoes= key.findElement(By.xpath(".//*[@id='main-nav-shoes']/a"));
	shoes.click();
	Thread.sleep(5000);
	WebElement handbags= key.findElement(By.xpath(".//*[@id='main-nav-handbags']/a"));
	handbags.click();
	Thread.sleep(5000);
	WebElement jewelry= key.findElement(By.xpath(".//*[@id='main-nav-jewelry']/a"));
	jewelry.click();
	Thread.sleep(5000);
	WebElement beauty=key.findElement(By.xpath(".//*[@id='main-nav-beauty']/a"));
	beauty.click();
	Thread.sleep(5000);
	WebElement men= key.findElement(By.xpath(".//*[@id='main-nav-men']/a"));
	men.click();
	Thread.sleep(5000);
	WebElement kids= key.findElement(By.xpath(".//*[@id='main-nav-kids']/a"));
	kids.click();
	Thread.sleep(5000);
	WebElement home= key.findElement(By.xpath(".//*[@id='main-nav-home']/a"));
	home.click();
	Thread.sleep(5000);
	WebElement gifts= key.findElement(By.xpath(".//*[@id='main-nav-gifts']/a"));
	gifts.click();
	Thread.sleep(5000);
	WebElement designer = key.findElement(By.xpath(".//*[@id='main-nav-designers']/a"));
	designer.click();
	Thread.sleep(5000);
	WebElement sale= key.findElement(By.xpath(".//*[@id='main-nav-sale']/a"));
	sale.click();
	Thread.sleep(5000);
	System.out.println("headlines finished");
	key.close();
	*/
	
	
	
	

	
	
	
	
	
	
	
	
	
	

	}

}
