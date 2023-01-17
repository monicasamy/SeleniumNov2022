package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class CrmsfaPage extends BaseClass {
	
	public CrmsfaPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public HomePage clickcrmsfa()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
	}
}
