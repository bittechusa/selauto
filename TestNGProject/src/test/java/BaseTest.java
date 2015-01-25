import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseTest 
{
	BrowserOpen bo=new BrowserOpen();
	@BeforeClass
	public void m1()
	{
		bo.start();
	}
	@AfterClass
	public void m2()
	{
		bo.end();
	}

}
