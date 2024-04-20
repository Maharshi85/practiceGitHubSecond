package COM.ECOMM.ACTITIME.Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	@FindBy(xpath = "//div[text()='Add New']") private WebElement addbut;
	
	@FindBy(xpath = "//div[contains(@class,'createNewCustomer')]") private WebElement newcust;
	
	public TaskPage(WebDriver dri)
	{
		PageFactory.initElements(dri,this);
	}
	
	public void addNewMethod()
	{
		addbut.click();
	}
	
	public void newCustMethod()
	{
		newcust.click();
	}
}
