package testClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObjClass.HomeClass;
import pageObjClass.MenCategoryClass;

public class menCategory extends BaseClass {

	private MenCategoryClass category;
	
	@BeforeMethod
	public void setup() {
		launchApp(); 
		category = new MenCategoryClass();
	}
	
	@Test
	public void validatemencategory() throws Exception
	{
		category.men();
	}
	
	@AfterMethod 
	public void teardown() throws Exception
	{
		screenshot();
		driver.quit();
	}

	
}
