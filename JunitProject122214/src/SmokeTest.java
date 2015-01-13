import org.junit.Test;
import org.openqa.selenium.By;


public class SmokeTest extends BaseTest 
{
	@Test
	public void m1() throws InterruptedException
	{
		dr.findElement(By.id("email")).sendKeys("sabbirzia@gmail.com");
		dr.findElement(By.id("pass")).sendKeys("a12251983");
		dr.findElement(By.id("u_0_n")).click();
		Thread.sleep(10000);
	}
	@Test
	public void m2() throws InterruptedException
	{
		dr.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath(".//*[@id='logout_form']/label/input")).click();
	}

}
