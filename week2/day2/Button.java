package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		//click and confirm the title
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle());
		//button is enabled or not
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Button']")).click();
		boolean button =driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		System.out.println(button);
		if(button==false)
		{
			System.out.println("The button is disabled");
		}else
		{
			System.out.println("The button is enabled");
		}
		//get location of the submit button
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("The location of submit button is " + location);
		//get color of save button
		System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color"));
		//get height and width of the button
		Dimension hw = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("The height and width respectively are " + hw);
		//mouse over 
		String cssValue1 = driver.findElement(By.xpath("//span[text()='Success']")).getCssValue("background-color");
		System.out.println("color before mouse over is" + "  " + cssValue1);
		System.out.println("color before mouse over is"+ " " + driver.findElement(By.xpath("//span[text()='Success']")).getAttribute("style"));
		WebElement target = driver.findElement(By.xpath("//span[text()='Success']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(target).perform();
		String cssValue2 = driver.findElement(By.xpath("//span[text()='Success']")).getCssValue("background-color");
		System.out.println("color after mouse over is" +" " + cssValue2);
		String color2 = driver.findElement(By.xpath("//span[text()='Success']")).getAttribute("style");
		System.out.println("Color after mouse over"+ " " + color2);
		//click image button - not sure what is hidden ?
		driver.findElement(By.xpath("//span[text()='Image']")).click();
		driver.findElement(By.xpath("//span[text()='Image']")).click();
		//how many round buttons are there?
		int size = driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]")).size();
		System.out.println("No.of round buttons =" + size);
	}

}
