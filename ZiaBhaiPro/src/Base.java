import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base
{
   FirefoxDriver dr;
   
   String browser = "https://wwww.facebook.com";
   @Before
   
   public void open()
   {
	  dr= new FirefoxDriver();
	  dr.get(browser);
	  
	 }
   
   @After
   public void close()
   {
	   dr.close();
   }
}
