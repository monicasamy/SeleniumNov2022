package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
        WebElement eleus = driver.findElement(By.id("username"));
		eleus.sendKeys("DemoSalesManager");
		WebElement elepw = driver.findElement(By.id("password"));
		elepw.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Monica");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Moni");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Webservices/API testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("monipsgct@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select city = new Select(state);
	    city.selectByVisibleText("New York");	
		driver.findElement(By.name("submitButton")).click();
		//Edit functionality starts here
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Certified in Selenium");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
