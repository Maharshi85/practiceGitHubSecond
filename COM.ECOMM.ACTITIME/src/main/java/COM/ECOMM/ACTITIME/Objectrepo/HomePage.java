package COM.ECOMM.ACTITIME.Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText = "Tasks") private WebElement task;
	
	@FindBy(id = "logoutLink") private WebElement loglink;
	
	public HomePage(WebDriver dri)
	{
		PageFactory.initElements(dri,this);
	}
	
	public void taskClick()
	{
		task.click();
	}
	
	public void logoutClick()
	{
		loglink.click();
	}
}
