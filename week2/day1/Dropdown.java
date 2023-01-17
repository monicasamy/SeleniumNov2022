package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
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
		WebElement ele=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(ele);
		dropdown.selectByValue("LEAD_CONFERENCE");
        driver.findElement(By.name("submitButton")).click();

	}

}
