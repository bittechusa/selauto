package AAA;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WWW 
{
public static void main(String[] args) 

  {
	FirefoxDriver h =new FirefoxDriver();
	h.get("http://www.Facebook.com");
	h.findElement(By.id("u_0_1")).sendKeys("aulad");
	h.findElement(By.id("u_0_3")).sendKeys("hioojh");
	h.findElement(By.id("u_0-5")).sendKeys("tyrd@yahoo.com");
	h.findElement(By.id("u_0_8")).sendKeys("tyr@yahoo.com");
	h.findElement(By.id("u_0_8")).sendKeys("12354");
	h.findElement(By.id("email")).sendKeys("yifg@yahoo.com");
  }
}
