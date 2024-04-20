package COM.ECOMM.ACTITIME.Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username") private WebElement uname;
	
	@FindBy(name="pwd") private WebElement pass;
	
	@FindBy(id="loginButton") private WebElement clibut;
	
	public LoginPage(WebDriver dri)
	{
		PageFactory.initElements(dri,this);
	}
	
	public void unameMethod(String name)
	{
		uname.sendKeys(name);
	}
	
	public void pwdMethod(String pwd)
	{
		pass.sendKeys(pwd);
		clibut.click();
	}
}
