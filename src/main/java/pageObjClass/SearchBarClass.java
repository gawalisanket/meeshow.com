package pageObjClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class SearchBarClass extends BaseClass {
	
	
	@FindBy(xpath = "//div[@class='header-logo-container']") WebElement logo;
	@FindBy(xpath = "//input[@placeholder='Try Saree, Kurti or Search by Product Code']") WebElement searchbar;
	@FindBy(partialLinkText = "https://images.meesho.com/images/products/179900907/samie_400.webp") WebElement ravishing;
	
	public SearchBarClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchBox() throws Exception
	{
		logo.isDisplayed();
		Thread.sleep(3000);
		searchbar.sendKeys("wacth"+Keys.ENTER);
		Thread.sleep(3000);
		ravishing.click();		
		Thread.sleep(4000);
	}
	
	
	
	
	
	

}
