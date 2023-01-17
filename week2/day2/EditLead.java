package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//login
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//find using mail ID
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Monica");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("View Lead | opentaps CRM"))
		{
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("BA");
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			String changedname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			System.out.println(changedname);
			if(changedname.contains("BA"))
			{
				System.out.println("Yes the changed name is correct");
			}
			else
			{
				System.out.println("Still not changed");
			}
		}
	}

}
