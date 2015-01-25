package com.registration.loop.test;

/*import java.io.File;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
*/
public class Registration 
{
	/*public static void main(String[] args) throws Exception
    {
       final String firebugPath = "C:\\firebug.xpi";
       final String firepathPath = "C:\\firepath.xpi";
       FirefoxProfile profile = new FirefoxProfile();      
       profile.addExtension(new File(firebugPath));
       profile.addExtension(new File(firepathPath));
        
        FirefoxDriver driver = new FirefoxDriver(profile);
        driver.get("http://bittech.bittechusa.com:8081/site1.html");
         
        System.out.println(driver.getTitle());
         
        driver.findElement(By.id("name")).sendKeys("Asad Zaman");
        driver.findElement(By.name("email")).sendKeys("asad@gmail.com");
        driver.findElement(By.xpath("//input[@class='contact']")).sendKeys("9175652660");
        driver.findElement(By.id("M")).click();
        driver.findElement(By.xpath("//input[@type='checkbox' and @value='v']")).click();
        driver.findElement(By.id("country")).sendKeys("Bangladesh");
         
        //Focus from here
         
        driver.findElement(By.xpath("//a")).click();
        Thread.sleep(5000);
         
        String parentWindow = driver.getWindowHandle();
         
        Set<String> handles = driver.getWindowHandles();
         
        for (String windowHandle : handles)
        {
            if (!windowHandle.equals(parentWindow))
            {
                driver.switchTo().window(windowHandle);
                 
                System.out.println(driver.getTitle());
                 
                driver.findElement(By.xpath(".//*[@id='signup-lightbox']/div[1]")).click();
                //driver.close();
                break;
            }
        }
         
        // Focus end
     
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
         
        //driver.switchTo().window(wname);
         
         
        //driver.switchTo().alert().accept();
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
         
        Thread.sleep(3000);
        driver.close();
        String parentWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(parentWindowHandle);      
        driver.findElement(By.xpath("//input[@type='submit']")).click();
         
         
    }*/
	

}
