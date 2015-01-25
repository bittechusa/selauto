import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BrowserOpen 
{
	FirefoxDriver dr;
	
	public void start()
	{
		dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
	}
	
	public void end()
	{
		dr.quit();
	}
	

}
