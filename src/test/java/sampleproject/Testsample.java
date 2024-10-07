package sampleproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testsample {
	
	WebDriver driver;
	String systemPath= System.getProperty("user.dir");
	
    @Test
	public void openbrowser()
	{
    System.out.println(systemPath);
	System.setProperty("webdriver.firefox.driver", systemPath+"/geckodriver.exe");	
	driver = new FirefoxDriver();
	driver.get("https://www.liquidz.com.hk/");
	String title = driver.getTitle();
	assertEquals("Liquidz | Online Liquor Store Hong Kong with Delivery at Door Step",title );
	driver.close();
	}
}
