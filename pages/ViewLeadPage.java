package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	public ViewLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}

	public ViewLeadPage title()
	{
		String title = driver.getTitle();
		System.out.println(title);
		return this;
	}
     public EditLeadPage clickeditLead()
	{
	  driver.findElement(By.linkText("Edit")).click();
	  return new EditLeadPage(driver);
	}


}
