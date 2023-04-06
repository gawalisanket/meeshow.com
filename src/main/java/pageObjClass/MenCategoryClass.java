package pageObjClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class MenCategoryClass extends BaseClass {

	@FindBy(xpath = "//span[text()='Men']") WebElement men;
		
	@FindBy(partialLinkText = "/men-watches/pl/3k7") WebElement watches;
	
	@FindBy(xpath = "//span[text()='Relevance']") WebElement relevance;
	
	@FindBy(xpath = "//span[text()='Discount']") WebElement discount;
	
	public MenCategoryClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void men() throws Exception
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(men).click(watches).build().perform();
		Thread.sleep(3000);
		relevance.click();
		discount.click();
	}
	
	
	
	
	
	
	
}
