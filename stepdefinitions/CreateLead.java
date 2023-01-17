package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {

	@Given("Enter the username as (.*)$")
	public void entername(String UN)
	{
		 WebElement eleus = driver.findElement(By.id("username"));
	     eleus.sendKeys(UN);
	}
	@Given("Enter the password as (.*)$")
	public void enterpwd(String PW)
	{
		WebElement elepw = driver.findElement(By.id("password"));
		elepw.sendKeys(PW);
	}
	@And("click on the login button")
	public void login()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@And("click on the link")
	public void crmsfa()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("click on Create Lead button")
	public void createlead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@And("Enter Company name")
	public void companyname()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");	
		
	}
	@And("Enter firstname")
	public void firstname()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Monica");
	}
	@And("Enter lastname")
	public void lastname()
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramasamy");
	}
	@And("Enter firstname local")
	public void localname()
	{
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Moni");
	}
	@And("Enter departmentname")
	public void departmentname()
	{
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
	}
	@And("Enter description")
	public void description()
	{
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Webservices/API testing");
	}
	@And("Enter Primary Mail")
	public void primarymail()
	{
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("monipsgct@gmail.com");
	}
	@When("Click on the submit button")
	public void submit()
	{
		driver.findElement(By.name("submitButton")).click();
		
	}
	@Then("Verify the title of the page")
	public void verifytitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}

}
