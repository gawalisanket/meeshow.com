package testClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import baseClass.BaseClass;
import pageObjClass.HomeClass;


public class HomeTestClass extends BaseClass {
	
	private HomeClass homepage;
	
	@BeforeMethod
	public void setup() {
		launchApp(); 
		homepage = new HomeClass();
	}
		
	
	@Test
	public void verifywomen() throws Exception
	{
		homepage.validatewomen();
	}
	
	
	@Test
	public void verifywomenWestern() throws Exception
	{
		homepage.validateWomenWestern();
	}
	
	@Test
	public void verifymen() throws Exception
	{
		homepage.validatemen();
	}

	
	@AfterMethod 
	public void teardown() throws Exception
	{
		screenshot();
		driver.quit();
	}

}
