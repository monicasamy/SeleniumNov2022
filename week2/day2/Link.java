package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		//TAKE ME TO DASHBOARD
		driver.findElement(By.linkText("Go to Dashboard")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();
		//GET URL
		String URL = driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']")).getAttribute("href");
	    System.out.println("The destination URL is" + " " + URL);
		// DUPLICATE LINK -- NOT MENTIONED WHAT TO DO
		// HOW MANY LINKS IN THE PAGE
		driver.findElement(By.xpath("//a[text()='How many links in this page?']")).click();
		int linkcount = driver.findElements(By.xpath("//a")).size();
		System.out.println("No.of links in the page = " + " " + linkcount);
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();
		//HOW MANY LINKS IN THE LAYOUT
		driver.findElement(By.xpath("//a[text()='How many links in this layout?']")).click();
		int linkcount2 = driver.findElements(By.xpath("//a")).size();
		System.out.println("No.of links in the layout ="+ " "+ linkcount2);
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();
		 //AM I BROKEN
	    driver.findElement(By.xpath("//a[text()='Broken?']")).click();
	    String status = driver.findElement(By.xpath("(//td)[2]")).getText();
		System.out.println("Status = "+ " " + status);
		if(status.equals("404"))
		{
			System.out.println("yes you are broken");
		}else
		{
			System.out.println("Not broken");
		}
	}

}
