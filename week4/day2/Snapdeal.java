package week4.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.snapdeal.com/");
		WebElement ele = driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct ']/span[@class='catText']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.xpath("(//a/span[text()='T-Shirts & Polos'])[2]"));
		builder.moveToElement(ele1).click(ele1).perform();
		WebElement ele2 = driver.findElement(By.xpath("//picture/img"));
		builder.moveToElement(ele2).perform();
		WebElement ele3 = driver.findElement(By.xpath("//div[@class='product-tuple-image ']/div"));
		builder.click(ele3).perform();
		
		
	}

}
