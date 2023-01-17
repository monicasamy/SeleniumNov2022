package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}

	public CreateLeadPage clickcreatelead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
		
	}
	
}
