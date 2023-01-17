package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//contact creation
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Monica");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Ramasamy");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Moni");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("QA");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Webservices/API testing");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("monipsgct@gmail.com");
		WebElement state = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select province = new Select(state);
		province.selectByVisibleText("California");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//Edit contact
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Selenium certified");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		// Get Title
		System.out.println(driver.getTitle());
	}

}
