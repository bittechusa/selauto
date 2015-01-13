import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest 
{
	static FirefoxDriver dr=new FirefoxDriver();
	@BeforeClass
	public  static void start()
	{
		//System.out.println("beforeClass");
	   dr.get("http://www.facebook.com");
	}
	/*@Before
	public void start()
	{
		System.out.println("before test");
	}*/
	
	/*@After
	public void end()
	{
		System.out.println("after test");
	}
*/
	@AfterClass
	public static void end() throws InterruptedException
	{
		Thread.sleep(4000);
		//System.out.println("AfterClass");
		dr.quit();
	}
}
