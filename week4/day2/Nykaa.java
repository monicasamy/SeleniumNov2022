package week4.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.nykaa.com/");
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brand).perform();
		Thread.sleep(2000);
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-ov2o3v']/a")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Shop By Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		List<WebElement> shampoo = driver.findElements(By.xpath("//div[@class='css-xrzmfa']"));
		for(WebElement s:shampoo)
		{
			String shamp = s.getText();
			System.out.println(shamp);
			if(shamp.equals("L'Oreal Paris Colour Protect Shampoo"))
			{
				System.out.println("yes , colour protected shampoo is filtered");
				driver.findElement(By.xpath("//div[@class='css-xrzmfa'][contains(text(),'Colour')]")).click();
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println(windowHandles);
				List<String> windows = new ArrayList<String>(windowHandles);
				driver.switchTo().window(windows.get(1));			
				WebElement quantity = driver.findElement(By.xpath("//select[@title='SIZE']"));
				Select ml = new Select(quantity);
				ml.selectByIndex(0);
				String price = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText().replace("₹","");
				System.out.println(price);
				driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
				driver.findElement(By.xpath("//button[@type='button']")).click();
				driver.switchTo().frame(0);
				String totalamount = driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']/span[@color='#001325']")).getText().replace("₹","");
				System.out.println(totalamount);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='Proceed']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
				driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']/img[@alt='Image']")).click();
				String total = driver.findElement(By.xpath("//p[@class='css-cla92e eka6zu20']")).getText().replace("₹","");
				System.out.println(total);
				if(totalamount.equals(total))
				{
					System.out.println("Total amount is correct");
				}else
				{
					System.out.println("Mismatch in total amount");
				}
				
				driver.close();
				driver.switchTo().window(windows.get(0));
				driver.close();
				break;
			}
			
		}	
	}

}
