package testClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObjClass.HomeClass;
import pageObjClass.SearchBarClass;

public class SearchBrTestClass extends BaseClass {
	
private SearchBarClass search;
	
	@BeforeMethod
	public void setup() {
		launchApp(); 
		search = new SearchBarClass();
	}
		
	
	@Test
	public void validatesearchbar() throws Exception
	{
		search.searchBox();
	}

	
	@AfterMethod 
	public void teardown() throws Exception
	{
		//screenshot();
		driver.quit();
	}

}
	


