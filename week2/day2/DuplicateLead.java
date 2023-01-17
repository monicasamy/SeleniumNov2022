package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("monipsgct@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		//print ID 
	    String name = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		System.out.println("The first resulting ID is " + name);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']")).click();
        //duplicate
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Duplicate Lead | opentaps CRM"))
		{
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			System.out.println(driver.getTitle());
			String resultingname = driver.findElement(By.xpath("//span[text()='Monica']")).getText();
			System.out.println(resultingname);
			if(resultingname.equals(name))
			{
				System.out.println("yes both are same");
			}
			else
			{
				System.out.println("no both are different");
			}
		}
	}

}
