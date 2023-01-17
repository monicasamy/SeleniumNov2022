package week4.day2;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("CBE");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		List<WebElement> eles = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
		int size = eles.size();
		Set<String> names = new LinkedHashSet<String>();
		System.out.println(size);
		for(int i = 2; i<=size ; i++)
		{
			String trainname = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+ i +"]/td[2]")).getText();
		    System.out.println(trainname);
		    names.add(trainname);
		}
		System.out.println(names);
		int size1 = names.size();
		System.out.println(size1);
		if (size==size1)
		{
			System.out.println("There are no duplicates");
		}
		else
		{
			System.out.println("There are duplicates , refer in set");
		}	
	}

}
