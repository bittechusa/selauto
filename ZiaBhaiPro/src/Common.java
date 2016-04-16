import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Common 
{  FirefoxDriver dr;
   public Common (FirefoxDriver dr)
   {
	   this.dr=dr;
   }

  public void type(By by, String s)
  
  {
	  dr.findElement(by).sendKeys(s);
  }
  
  public void click(By by)
  {
	  dr.findElement(by).click();
  }
  
  public void verifytitle(String x)
  {
	  if (dr.getTitle().contains(x))
	  {
		 System.out.println("Title Match"); 
	  }
	  else
	  {
		  System.out.println("Doesn't match");
	  }
  }
}
