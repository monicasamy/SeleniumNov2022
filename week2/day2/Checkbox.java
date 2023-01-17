package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		//1
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[1]")).click();
		//2
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		// fav languages
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Others']")).click();
		//tri-state
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();	
		
		//toggle-switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		//disabled/not
		boolean state = driver.findElement(By.xpath("//div/input[@aria-disabled='true']")).isEnabled();
		System.out.println(state);
		if(state==false)
		{
			System.out.println("The checkbox is disabled");
		}else
		{
			System.out.println("It is enabled");
		}
		// select multiple
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Barcelona'])[2]")).click();
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
				
	}

}
