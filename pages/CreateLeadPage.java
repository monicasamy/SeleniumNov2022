package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	public CreateLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}

	public CreateLeadPage entercompanyname(String Name)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Name);
		return this;	
	}
	public CreateLeadPage enterfirstname(String Name)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Name);
		return this;	
	}
	public CreateLeadPage enterlastname(String Name)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Name);
		return this;	
	}
	public CreateLeadPage enterlocalname()
	{
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Moni");
		return this;	
	}
	public CreateLeadPage enterdepartmentname()
	{
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		return this;	
	}
	public CreateLeadPage enterdescription()
	{
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Webservices/API testing");
		return this;	
	}
	public CreateLeadPage enteremail()
	{
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("monipsgct@gmail.com");
		return this;	
	}
	public CreateLeadPage entercity()
	{
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select city = new Select(state);
	    city.selectByVisibleText("New York");	
	    return this;	
	}
	public ViewLeadPage submit()
	{
		driver.findElement(By.name("submitButton")).click();	
		return new ViewLeadPage(driver);	
	}
	
	
}
