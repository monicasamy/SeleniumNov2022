package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;


public class LoginPage extends BaseClass {

	public LoginPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}

	public LoginPage enterusername()
	{
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		return this;
	}
	public LoginPage enterpassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public CrmsfaPage login()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new CrmsfaPage(driver);
	}
	
}
