package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean selected = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean selected1 = driver.findElement(By.xpath("//label[text()='Bengaluru']")).isSelected();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean selected2 = driver.findElement(By.xpath("//label[text()='Hyderabad']")).isSelected();
		if(selected==false&& selected1==false && selected2==false)
		{
			System.out.println("The buttons are unselectable");
		}else
		{
			System.out.println("All the buttons are Selectable");
		}
		boolean brow1 = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[16]")).isSelected();
		boolean brow2 = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[17]")).isSelected();
		boolean brow3 = driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet']")).isSelected();
		boolean brow4 = driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet']")).isSelected();
		if(brow1==true)
		{
			System.out.println("Chrome is selected");
		}else if (brow2==true)
		{
			System.out.println("Firefox is selected");
		}else if(brow3==true)
		{
			System.out.println("Safari is selected");
	    }else if (brow4==true)
	    {
	    	System.out.println("Edge is selected");
	    }else
	    {
	    	System.out.println("None of them are selected");
	    }
		boolean age1 = driver.findElement(By.xpath("(//div[@class='ui-g']//div[@class='ui-radiobutton ui-widget'])[4]")).isSelected();
		System.out.println(age1);
		boolean age2 = driver.findElement(By.xpath("(//div[@class='ui-g']//div[@class='ui-radiobutton ui-widget'])[5]")).isSelected();
		System.out.println(age2);
		boolean age3 = driver.findElement(By.xpath("(//div[@class='ui-g']//div[@class='ui-radiobutton ui-widget'])[6]")).isSelected();
		System.out.println(age3);
		if(age1||age2||age3 == true)
		{
			System.out.println("Age is already selected");
		}else
		{
			System.out.println("Age is not selected");
		}	
	}
	

}
