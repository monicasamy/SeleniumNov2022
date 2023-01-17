package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable_notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]")).click();
		String rating = driver.findElement(By.xpath("//span[@data-hook='total-review-count']")).getText();
		System.out.println(rating);	
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		File SC = driver.getScreenshotAs(OutputType.FILE); 
		File dest = new File("./Screenshots");//Within the workspace 
		FileUtils.copyFile(SC, dest);
	    driver.findElement(By.id("add-to-cart-button")).click(); 
	    String subtotal = driver.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']/span[@class='a-size-base-plus a-color-price a-text-bold']/span")).getText().replace("₹", "").replace(".00", "");
		System.out.println(subtotal); 
		  if(subtotal.equals(price)) 
		  { System.out.println("It is correct"); } 
		  else {
		  System.out.println("No this is a different amount"); }
		 
		 
	}

}
