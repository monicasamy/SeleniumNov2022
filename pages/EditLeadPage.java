package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class EditLeadPage extends BaseClass {
	
	public EditLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}

    public EditLeadPage editdescription() {
	   driver.findElement(By.id("updateLeadForm_description")).clear();
	   driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Certified in Selenium");
	   return this;
    }

    public ViewLeadPage esubmit()
   {
	driver.findElement(By.className("smallSubmit")).click();
	return new ViewLeadPage(driver);
   }
}
