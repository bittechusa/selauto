


import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;


public class SeleniumHistory 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//DefaultSelenium browser = new DefaultSelenium("localhost",4444,"*googlechrome","http://www.bittechusa.com");
		FirefoxDriver WebDriver = new FirefoxDriver();
		WebDriverBackedSelenium rc = new WebDriverBackedSelenium(WebDriver, "http://www.bittechusa.com");
		WebDriver.get("http://www.bittechusa.com/site1.html");
		rc.type("name", "shipon");
		Thread.sleep(5000);
		rc.type("email", "shossain7823@gmail.com");
		
		/*browser.start();
		browser.open("/reg.html");
		browser.type("name", "shipon");
		Thread.sleep(5000);
		browser.type("email", "shossain7823@gmail.com");
		Thread.sleep(5000);
		browser.type("//input[@class='contact']","631 602 8000" );
		Thread.sleep(5000);
		browser.click("//input[@id='M']");
		Thread.sleep(5000);
		browser.click("html/body/form/table/tbody/tr[7]/td[2]/input[2]");
		Thread.sleep(5000);
		browser.click(".//*[@id='country']");
		Thread.sleep(5000);*/
	}

}
