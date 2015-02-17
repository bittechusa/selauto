package tryCatchProject021415;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A 
{
	FirefoxDriver dr;
	@Test
	public void m1()
	{
		dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		try{
			dr.findElement(By.id("u_0_")).sendKeys("dfj");
			System.out.println(10/0);
		   //System.out.println(10/0);
		}
		catch(NoSuchElementException e)
		{
			System.out.println("element not found");
		}
		catch(ArithmeticException e)
		{
			System.out.println("hi");
		}catch(Exception e)
		{
			System.out.println("hi");
		}
		finally
		{
			System.out.println("");
		}
		
		dr.findElement(By.id("u_0_1")).sendKeys("dfj");
		
	}
	@Test
	public void m2()
	{
		dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		
			dr.findElement(By.id("u_0_")).sendKeys("dfj");
		   //System.out.println(10/0);
		
	}
	@Test
	public void m3()
	{
		dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		/*if(dr.getTitle().contains("shahid"))
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		*/
		//Assert.assertFalse(dr.getTitle().contains("facebook"));
		Assert.assertEquals(2+3, 4);
		System.out.println("hi");
	}

}
