package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundElementfunctions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://leafground.com/input.xhtml;jsessionid=node01j540a7o52can13p945ps0fry4418339.node0");
		driver.manage().window().maximize();
		//Type your name
		driver.findElement(By.xpath("(//input[@role='textbox'])[1]")).sendKeys("Monica Ramasamy");
		//Append country to city
		String s = driver.findElement(By.xpath("(//input[@role='textbox'])[2]")).getText();
		StringBuilder a = new StringBuilder(s);
		a.append("India");
		System.out.println(a);
		driver.findElement(By.xpath("(//input[@role='textbox'])[2]")).sendKeys(" " + a);
		//is enabled or not
		boolean value = driver.findElement(By.xpath("(//input[@role='textbox'])[3]")).isEnabled();
		if(value== true)
		{
			System.out.println("the box is enabled");
		}else
		{
			System.out.println("the box is disabled");
		}
		// clear the text
	    driver.findElement(By.xpath("(//input[@role='textbox'])[4]")).clear();
	    // Retrieve the typed text and TAB
	    String text = driver.findElement(By.xpath("(//input[@role='textbox'])[4]")).getText();
	    System.out.println(text);
	    driver.findElement(By.xpath("(//input[@role='textbox'])[6]")).sendKeys("monipsgct@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@role='textbox'])[6]")).sendKeys(Keys.TAB);
	    // To check if the control is moved to next element---> not working as expected
	    boolean text1 = driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).isSelected();
	    System.out.println(text1);
	    if(text1==true)
	    {
	    	System.out.println("Control moved to next element");
	    }else
	    {
	    	System.out.println("Control is still in the same element");
	    }
	    // type about myself
	    driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("Hard working and due diligent");
	    // Enter and error message
	    driver.findElement(By.xpath("(//input[@role='textbox'])[7]")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    // To get the error	  
	    String error = driver.findElement(By.xpath("//div[@role='alert']")).getText();
	    System.out.println(error);
	    driver.findElement(By.xpath("(//input[@role='textbox'])[7]")).sendKeys("26");
	    // confirm label position changes
	    Point location1 = driver.findElement(By.xpath("(//input[@role='textbox'])[7]")).getLocation();
	    driver.findElement(By.xpath("(//input[@role='textbox'])[8]")).click();
	    Point location2 = driver.findElement(By.xpath("(//input[@role='textbox'])[8]")).getLocation();
	    System.out.println(location1);
	    System.out.println(location2);
	    if(location1!=location2)
	    {
	    	System.out.println("Position has been changed");
	    }
	    // type your name and ---> choose the third option(this was not available)
	    driver.findElement(By.xpath("(//input[@role='textbox'])[8]")).sendKeys("Monica");
	    //DOB confirmation
	    driver.findElement(By.xpath("(//input[@role='textbox'])[9]")).sendKeys("07/20/1996");
	    String date = driver.findElement(By.xpath("//a[@class=' ui-state-default ui-state-active']")).getText();
	    System.out.println(date);
	    if(date.equals("20"))
	    {
	    	System.out.println("Chosen Date is correct");
	    }else
	    {
	    	System.out.println("Chosen Date is incorrect");
	    }
	    driver.findElement(By.xpath("//a[@class=' ui-state-default ui-state-active']")).click();
	    //type a number and scroll----> not sure of spin option, used manually up/down buttons
	    driver.findElement(By.xpath("(//input[@role='textbox'])[10]")).sendKeys("7");
        driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")).click();
        driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")).click();
        driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")).click();
        boolean displayed = driver.findElement(By.xpath("//input[@aria-valuenow='10']")).isDisplayed();
	    if(displayed==true)
	    {
	    	System.out.println("scroll performed");
	    }else
	    {
	    	System.out.println("scroll not performed");
	    }
	    //type a number and confirm slider moves correctly
	    driver.findElement(By.xpath("(//input[@role='textbox'])[11]")).sendKeys("50");
	    String span = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getAttribute("style");
	    System.out.println("The slider value is"+" "+ span );
	    if(span.contains("50%"))
	    {
	    	System.out.println("The slide has been moved correctly");
	    }else
	    {
	    	System.out.println("Not moved correctly");
	    }
	    //confirm if the keyboard appears
	    driver.findElement(By.xpath("(//input[@role='textbox'])[12]")).click();
	    boolean keyboard =driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed();
	    System.out.println(keyboard);
	    if(keyboard==true)
	    {
	    	System.out.println("The keyboard is shown");
	    	driver.findElement(By.xpath("//button[@title='Close the keypad']")).click();//not able to close the keypad
	    }else
	    {
	    	System.out.println("Keyboard is not shown");
	    }
	 
	
}
}
