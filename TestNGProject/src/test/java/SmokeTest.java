import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SmokeTest extends BaseTest 
{
	
	
		
	
	
	@Test(dataProvider="getData")
	public void logIn(Object user,Object pass)
	{
		System.out.println("user Id"+user  +"password"+pass);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] ob=new Object[2][2];
		ob[0][0]="shahid@gmail.com";
		ob[0][1]="123";
		
		
		ob[1][0]="shahidu@gmail.com";
		ob[1][1]="1234";
		ob[0][0]="shahid@gmail.com";
		ob[0][1]="123";
		
		
		ob[1][0]="shahidu@gmail.com";
		ob[1][1]="1234";
		
		
		return ob;
		
		
	}

}
