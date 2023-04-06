package pageObjClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class HomeClass extends BaseClass  {
	
	@FindBy(xpath = "//span[text()='Women Ethnic']") 
	WebElement Women;
	
	@FindBy(xpath = "//span[text()='Women Western']") 
	WebElement WomenWestern;
	
	@FindBy(xpath = "//span[text()='Men']") 
	WebElement Men;
	
	@FindBy(xpath = "//span[text()='Kids']")
	WebElement Kids;
	
	@FindBy(xpath = "//span[text()='Home & Kitchen']")
	WebElement HomKitchen;
	
	public HomeClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validatewomen() throws Exception
	{
		Actions act = new Actions (driver);
		act.moveToElement(Women).build().perform();
		Thread.sleep(3000);
	}
	
	public void validateWomenWestern() throws Exception
	{
		Actions act = new Actions (driver);
		act.moveToElement(WomenWestern).build().perform();
		Thread.sleep(3000);
	}
	
	public void validatemen() throws Exception
	{		Actions act = new Actions (driver);
		act.moveToElement(Men).build().perform();
		Thread.sleep(3000);
	}
	
	

}
