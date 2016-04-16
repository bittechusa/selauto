import org.junit.Test;
import org.openqa.selenium.By;



public class SmokeTest extends Base


{ @Test
  
public void test1()
{
  Common x= new Common(dr);
  x.type(By.xpath(".//*[@id='email']"), "ferdoussamia@yahoo.com");
  x.type(By.xpath(".//*[@id='pass']"), "2ntuni@");
  x.click(By.xpath(".//*[@id='u_0_x']"));
  x.verifytitle("Facebok");
}
}
  

