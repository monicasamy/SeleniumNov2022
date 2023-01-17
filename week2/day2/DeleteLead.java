package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
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
		//find using phone number
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8072727656");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//print ID 
	    String ID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("The first resulting ID is " + ID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		//deleting the ID
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Searching with the same ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(ID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//result
		String message1 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(message1.equals("No records to display"))
			{
				System.out.println("Successfully deleted");
			}else
			{
				System.out.println("Still active");
			}
		}
		
         

}
