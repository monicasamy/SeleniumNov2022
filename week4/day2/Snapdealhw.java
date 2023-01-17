package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdealhw {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.snapdeal.com/");
		WebElement mensfashion = driver.findElement(By.xpath("//li[@navindex='1']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(mensfashion).perform();
        WebElement sportsshoes = driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"));
        builder.moveToElement(sportsshoes).click().perform();
        String shoesno = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[1]")).getText();
        System.out.println("no.of shoes = " + shoesno);
        driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
        driver.findElement(By.xpath("//ul[@class='sort-value']/li[@data-index='1']")).click();
        Thread.sleep(2000);
        List<WebElement> amount = driver.findElements(By.xpath("//span[@class='lfloat product-price'][contains(text(),'Rs.')]"));
        List<Integer> price = new ArrayList<Integer>();//inserting it without sort
        Set<Integer> asc = new TreeSet<Integer>();//inserting into set to compare (sorted)
        for(int i=0;i<amount.size();i++)
        {
        	WebElement p = amount.get(i);
        	String shoeprice = p.getText().replace("Rs","").replace(".", "").replace(" ", "").replace(",", "");
        	int shoeprice1 = Integer.parseInt(shoeprice);
        	price.add(shoeprice1);
        	asc.add(shoeprice1);
        	
        }
        System.out.println(price);
        System.out.println(asc);
        Set<Integer> removeddup = new LinkedHashSet<Integer>(price);
        List<Integer> pricewithoutdup = new ArrayList<Integer>(removeddup);//removing dup in price to compare effectively
        System.out.println(pricewithoutdup);
        List<Integer> conasc = new ArrayList<Integer>(asc);//inserting asc to list to compare each amount
        for(int j=0;j<pricewithoutdup.size();j++)
        {
 
        	if(pricewithoutdup.get(j).equals(conasc.get(j)))
        	{
        		System.out.println("The item matches , so it is sorted");
        	}else
        	{
        		System.out.println("The item doesnt match");
        	}
        	
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");  
        WebElement left = driver.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
        WebElement right = driver.findElement(By.xpath("//a[@class='price-slider-scroll right-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
        builder.clickAndHold(left).dragAndDropBy(left,50, 0).perform();
        Thread.sleep(2000);
        builder.clickAndHold(right).dragAndDropBy(right,-100, 0).perform();
        js.executeScript("window.scrollBy(0,500)", ""); 
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='sdCheckbox filters-list ']")).click();
        List<WebElement> filters = driver.findElements(By.xpath("//a[@class='clear-filter-pill  ']"));
        String filter = null;
        for(WebElement a:filters)
        {
            filter = a.getText();
        	System.out.println("Filters = " + filter); 
        }
        if(filter.equals("Yellow")&&filter.equals("Rs. 790 - Rs. 1176"))
    	{
    		System.out.println("The filters are verified");
    	}
        js.executeScript("window.scrollBy(0,500)", "");
       WebElement image = driver.findElement(By.xpath("//img[@class='product-image wooble']")); 
       builder.moveToElement(image).perform();
       driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
       String p = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText().replace("&nbsp", "");
       String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
       System.out.println("Price of the shoe is  "+ p);
       System.out.println("Discount percentage is "+ discount);
       driver.findElement(By.xpath("//img[@itemprop='image']"));
       File sc = driver.getScreenshotAs(OutputType.FILE);
       File dest = new File("./screenshot1");
       FileUtils.copyFile(sc, dest);
       driver.findElement(By.xpath("//div[@class='close close1 marR10']/i[@class='sd-icon sd-icon-delete-sign']")).click();
       Thread.sleep(2000);
       driver.close();
       
       
      
	}

}
