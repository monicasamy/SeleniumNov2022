package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement ele0 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(ele0);
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("FramesAssignment");
		WebElement ele1 = driver.findElement(By.id("frame3"));
		driver.switchTo().frame(ele1);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.switchTo().defaultContent();
		WebElement ele2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(ele2);
		WebElement ele3 = driver.findElement(By.id("animals"));
		Select s1 = new Select(ele3);
		s1.selectByIndex(3);
		
	}

}
