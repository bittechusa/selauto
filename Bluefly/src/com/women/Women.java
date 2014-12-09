package com.women;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Women {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver dr= new FirefoxDriver();
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		Thread.sleep(5000);
		dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a")).click();
		Thread.sleep(5000);
		/*dr.findElement(By.xpath("//ul[@class='lp-main-list']/li[1]/a")).click();
		Thread.sleep(5000);
		int womenProduct = dr.findElements(By.xpath("//div[@class='listProductGrid ui-helper-clearfix']//div[@id='productGridContainer']/div")).size();
		System.out.println(womenProduct);
		for(int a= 1; a <= womenProduct; a++) //first row
		{
		dr.findElement(By.xpath("//div[@class='listProductGrid ui-helper-clearfix']//div[@id='productGridContainer']/div[" + a + "]/div/a/img")).click();
		Thread.sleep(5000);
		dr.navigate().back();
		Thread.sleep(5000);
		} //end
		Thread.sleep(5000);
		dr.navigate().back();
		Thread.sleep(5000); // test passed
*/		/*dr.findElement(By.xpath("//ul[@class='lp-main-list']/li[2]/a")).click();
		Thread.sleep(5000);
		int two =dr.findElements(By.xpath("//div[@id='productGridContainer']/div/div/a/img")).size();
		System.out.println(two);
		for(int a=1; a< two; a++) //2nd row
		{
		dr.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]/div/a/img")).click();
		Thread.sleep(5000);
		dr.navigate().back();
		Thread.sleep(5000);
		}//end // test passed
*/		/*dr.findElement(By.xpath("//ul[@class='lp-main-list']/li[4]/a")).click();
		Thread.sleep(5000);
		int four= dr.findElements(By.xpath("//div[@id='productGridContainer']/div/div/a/img")).size();
		for(int a =1;a< four; a++)
		{
			dr.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]/div/a/img")).click();
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
		}// end //test passed
*/		/*dr.findElement(By.xpath("//ul[@class='lp-main-list']/li[5]/a")).click();
		Thread.sleep(5000);
		int five= dr.findElements(By.xpath("//div[@id='productGridContainer']/div/div/a/img")).size();
		for(int a=1; a< five; a++)
		{
			dr.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]/div/a/img")).click();
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
			
		}// end //test passed
*/		dr.findElement(By.xpath("//ul[@class='lp-main-list']/li[6]/a")).click();
		Thread.sleep(5000);
		int six= dr.findElements(By.xpath("//div[@id='productGridContainer']/div/div/a/img")).size();
		for(int a=1; a< six; a++)
		{
			dr.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]/div/a/img")).click();
			Thread.sleep(5000);
			dr.navigate().back();
			Thread.sleep(5000);
		}// end // test passed
	} // end of main method

}// end of class
