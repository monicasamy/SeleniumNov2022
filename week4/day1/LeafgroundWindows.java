package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Open']")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		int size = windowHandles.size();
		System.out.println(size);
		if(size==2)
		{
			System.out.println("New window has been opened");
		}else
		{
			System.out.println("Window has not been opened");
		}
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(0));
		//doubt here
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
	    System.out.println(windowHandles1);
	    int size1 = windowHandles1.size();
	    System.out.println("No of windows opened = " + " " + size1);
	    List<String> window1 = new ArrayList<String>(windowHandles1);
	    driver.switchTo().window(window1.get(1)).close();
	    driver.switchTo().window(window1.get(2)).close();
	    driver.switchTo().window(window1.get(0));
	    driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
	    System.out.println(windowHandles2);
		List<String> window2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(window2.get(1)).close();
		driver.switchTo().window(window2.get(2)).close();
		driver.switchTo().window(window2.get(3)).close();
		driver.switchTo().window(window2.get(4)).close();
		driver.switchTo().window(window2.get(0));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
	    System.out.println(windowHandles3);
	    int size2 = windowHandles3.size();
	    System.out.println("No of windows opened = " + " " + size2);
	    
	    
	}

}
