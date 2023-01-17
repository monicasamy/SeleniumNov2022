package week4.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node01qey7o6oowt9dc09s8l9hc4bu437441.node0");
		WebElement drag = driver.findElement(By.id("form:conpnl"));
		Point location = drag.getLocation();
		int x = location.getX();int y=location.getY();
		System.out.println(location);
		Thread.sleep(1000);
		Actions builder = new Actions(driver); 
		builder.dragAndDropBy(drag,x+10,y+10).perform();
		WebElement dragcontent = driver.findElement(By.id("form:drag_content"));
		WebElement dropcontent = driver.findElement(By.id("form:drop_content"));
		Thread.sleep(1000);
		builder.dragAndDrop(dragcontent, dropcontent).perform();
		WebElement dragcol1 = driver.findElement(By.xpath("(//tr[@role='row']/th)[2]"));
		WebElement dragcol2 = driver.findElement(By.xpath("(//tr[@role='row']/th)[1]"));
		Thread.sleep(1000);
	    builder.dragAndDrop(dragcol1, dragcol2).perform();
	    WebElement dragrow1 = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[@data-ri='7']"));
	    WebElement dragrow2 = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[@data-ri='1']"));
	    Thread.sleep(1000);
	    builder.dragAndDrop(dragrow1, dragrow2).perform();
	    Dimension size = driver.findElement(By.id("form:logo")).getSize(); System.out.println(size);
	    WebElement image = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		builder.clickAndHold(image).dragAndDropBy(image, 5, 5).perform();
		Thread.sleep(1000); 
		Dimension nsize = driver.findElement(By.id("form:logo")).getSize(); System.out.println(nsize);
		driver.findElement(By.xpath("//span[text()='Start']")).click();
		String text = driver.findElement(By.xpath("//div[@class='ui-progressbar-label']")).getText(); 
		System.out.println(text);
		Thread.sleep(4000);
		String text1 = driver.findElement(By.xpath("//div[@class='ui-progressbar-label']")).getText();
		if(text1.equals(text))
		{
			System.out.println("there is no progress");
		}
		else
		{
			String text2 = driver.findElement(By.xpath("//div[@class='ui-progressbar-label']")).getText();
			System.out.println(text2);
		}
		Thread.sleep(10000);
		String text3 = driver.findElement(By.xpath("//div[@class='ui-progressbar-label']")).getText();
		System.out.println(text3);
		WebElement button1 = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		builder.clickAndHold(button1).dragAndDropBy(button1, 25, 0).perform();
		WebElement button2 = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		builder.clickAndHold(button2).dragAndDropBy(button2, -25, 0).perform();
	}

}
