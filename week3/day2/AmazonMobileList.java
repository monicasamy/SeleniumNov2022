package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonMobileList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		List <WebElement> allMobiles = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> prices = new ArrayList<Integer>();
		for(int i=0;i<allMobiles.size();i++)
		{
			WebElement Mobile = allMobiles.get(i);
			String Mobileprice = Mobile.getText().replace(",", "");
			int price = Integer.parseInt(Mobileprice);
 			prices.add(price);
		}		
		Collections.sort(prices);
		System.out.println(prices);		
		System.out.println("Least price = " +  prices.get(0));
	}

}
