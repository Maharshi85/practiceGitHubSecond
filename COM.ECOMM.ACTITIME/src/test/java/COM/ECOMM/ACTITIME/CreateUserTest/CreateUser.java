package COM.ECOMM.ACTITIME.CreateUserTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import COM.ECOMM.ACTITIME.GenericUtilities.ExcelFileUtilityActitime;
import COM.ECOMM.ACTITIME.GenericUtilities.FileUtilityActitime;
import COM.ECOMM.ACTITIME.GenericUtilities.JavaUtilityActitime;
import COM.ECOMM.ACTITIME.GenericUtilities.WebdriverUtility;
import COM.ECOMM.ACTITIME.Objectrepo.HomePage;
import COM.ECOMM.ACTITIME.Objectrepo.LoginPage;
import COM.ECOMM.ACTITIME.Objectrepo.NewCustomerPage;
import COM.ECOMM.ACTITIME.Objectrepo.TaskPage;


public class CreateUser {
	public static void main(String[] args) throws Throwable {
		FileUtilityActitime f=new FileUtilityActitime();
		ExcelFileUtilityActitime e=new ExcelFileUtilityActitime();
		JavaUtilityActitime j=new JavaUtilityActitime();
		String name=e.excelFileUtility("Sheet1", 0, 0)+j.randomNumber();
		WebDriver dri=new EdgeDriver();
		
		WebdriverUtility web=new WebdriverUtility();
		web.maximize(dri);
		web.implicitWait(dri);
		
		
		dri.get(f.dataFrompropertyFile("url"));
		
		LoginPage l=new LoginPage(dri);
		l.unameMethod(f.dataFrompropertyFile("username"));
		l.pwdMethod(f.dataFrompropertyFile("password"));
		
		
		HomePage h=new HomePage(dri);
		h.taskClick();
		
		
		TaskPage t=new TaskPage(dri);
		t.addNewMethod();
		t.newCustMethod();
		
		
		NewCustomerPage n=new NewCustomerPage(dri);
		n.custnameMethod(name);
		n.custclickMehod();
		
		web.textToBePresentWait(dri, By.cssSelector("[class='titleEditButtonContainer']>[class='title']"), name);
		//WebDriverWait w=new WebDriverWait(dri,Duration.ofSeconds(10));
		//w.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("[class='titleEditButtonContainer']>[class='title']"),name));
		String uname=dri.findElement(By.cssSelector("[class='titleEditButtonContainer']>[class='title']")).getText();
		if(uname.equals(name))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		h.logoutClick();
		//dri.findElement(By.id("logoutLink")).click();
	}
}
