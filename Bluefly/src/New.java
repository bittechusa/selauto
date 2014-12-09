import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class New {

	public static void main(String[] args) throws Exception 
	{
	FirefoxDriver dr= new FirefoxDriver();
	dr.get("http://www.bluefly.com");
	dr.manage().window().maximize();
	Thread.sleep(5000);
	WebElement newlink =dr.findElement(By.xpath(".//*[@id='main-nav-new']/a"));
    newlink.click();
    Thread.sleep(5000);
    int products = dr.findElements(By.xpath("//div[@id='productGridContainer']/div/div/a/img")).size();
    System.out.println(products);
    for(int a=1; a < products; a++)
    {
     dr.findElement(By.xpath("//div[@id='productGridContainer']/div["+a+"]/div/a/img")).click();
     Thread.sleep(5000);
     dr.navigate().back();
     Thread.sleep(5000);
    }// test passed
    
    
    
    
	}// end of main method

}// end of class
