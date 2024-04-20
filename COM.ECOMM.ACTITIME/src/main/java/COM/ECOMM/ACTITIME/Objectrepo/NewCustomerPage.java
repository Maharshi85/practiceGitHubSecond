package COM.ECOMM.ACTITIME.Objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import COM.ECOMM.ACTITIME.GenericUtilities.WebdriverUtility;

public class NewCustomerPage extends WebdriverUtility{
	
	@FindBy(css = ".inputFieldWithPlaceholder.newNameField.inputNameField") private WebElement custname;
	
	@FindBy(xpath = "//div[@class='commitButtonPlaceHolder']") private WebElement custclick;
	
	@FindBy(xpath = "[class='titleEditButtonContainer']>[class='title']") private WebElement explictWait;
	
	public NewCustomerPage(WebDriver dri)
	{
		PageFactory.initElements(dri,this);
	}
	
	public void custnameMethod(String name)
	{
		custname.sendKeys(name);
	}
	
	public void custclickMehod()
	{
		custclick.click();
	}
	
	public void explicitWaitMethod(WebDriver dri,By locator,String name)
	{
		textToBePresentWait(dri,locator,name);
	}
	
}
