package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01726s9tfcenpf1bsn9pis5zxhx417425.node0");
		//course selection//
		WebElement ele1=driver.findElement(By.xpath("//select[@style='overflow-wrap: break-word; height: 150%;']"));
		Select dropdown1 = new Select(ele1);
		dropdown1.selectByIndex(1);
		//country selection//
		driver.findElement(By.xpath("//label[contains(text(),'Country')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//ul[@role='listbox']/li[4]")).click();
	    Thread.sleep(2000);
	    //city selection and confirm if the cities are loaded for India//	
	    driver.findElement(By.xpath("//div/label[contains(text(),'City')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-items-wrapper']/ul[@role='listbox']/li[3])[2]")).click();
	    String city1 = driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-items-wrapper']/ul[@role='listbox']/li[3])[2]")).getText();
	    System.out.println(city1);
	    
	    if(city1.equals("Chennai"))
	    {
	    	System.out.println("Cities belonging to the selected country are loaded");
	    }else
	    {
	    	System.out.println("No the countries are not loaded");
	    }
	    //choose the course//
	    driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li[3]")).click();
	    Thread.sleep(1000);
	    //choose the course 2//
	    driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li[6]")).click();
	    Thread.sleep(1000);
	    //choose the course 3//
	    driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li[8]")).click();
	    //choose the language
	    driver.findElement(By.xpath("//label[contains(text(),'Language')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//ul[@role='listbox']/li[text()='English']")).click();
	    Thread.sleep(2000);
		//choose two
		driver.findElement(By.xpath("//label[contains(text(),'Values')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@role='listbox']/li[@data-label='Two']")).click();
		
	}

}
