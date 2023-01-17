package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
	    driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//a/img)[4]")).click();
		//Window handling 
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));	
		System.out.println("Now you are in " + " " + driver.getTitle());
		//select first contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(windows.get(0));
		System.out.println("Now you are in " + " " + driver.getTitle());
		driver.findElement(By.xpath("(//a/img)[5]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2);
		List<String> windows2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(windows2.get(1));
		System.out.println("Now you are in " + " " + driver.getTitle()); 
		  //select second contact
	    driver.findElement(By.xpath("(//tbody/tr/td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
	    driver.switchTo().window(windows2.get(0));
	    System.out.println("Now you are in " + " " + driver.getTitle());
	    driver.findElement(By.linkText("Merge")).click(); //Alert Handling
	    driver.switchTo().alert().accept(); //verify the title String title String
	    String title=driver.getTitle(); System.out.println(title);
		if(title.contains("View Contact")) {
	    System.out.println("Contact merge is successful"); }
			 
		 
	}

}
