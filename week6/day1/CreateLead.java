package week6.day1;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	@Test(dataProvider ="fetchData")
	public void create(String cName , String fName , String lName) {
       
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		/*driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Moni");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Webservices/API testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("monipsgct@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select city = new Select(state);
	    city.selectByVisibleText("New York");	*/
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

   @DataProvider(name="fetchData")
   public String[][] setData()
   {
	   String [][] data = new String[2][3];
	   data[0][0] = "TestLeaf";
	   data[0][1] = "Elfit";
	   data[0][2] = "Sneha";
	   
	   data[1][0] = "BACI";
	   data[1][1] = "Monica";
	   data[1][2] = "Ramasamy";
	   
	   return data;
   }

}
