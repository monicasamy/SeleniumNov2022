package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
		//New account opening
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Monica");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Ramasamy");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("monipsgct@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Godsgift100");
		//Dropdown
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select drop = new Select(day);
		drop.selectByValue("20");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select drop1 = new Select(month);
		drop1.selectByVisibleText("Jul");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select drop2 = new Select(year);
		drop2.selectByVisibleText("1996");
		//Radio
		driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
		
	}

}
