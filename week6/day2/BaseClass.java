package week6.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public ChromeDriver driver;
	public String filename;
	
    @Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(@Optional("http://leaftaps.com/opentaps/control/login") String URL, String uName , String Pwd)
    {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(Pwd);	
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
	@AfterMethod
    public void postCondition() {
		driver.close();
		
	}
	   @DataProvider(name="fetchData")
	   public String[][] setData() throws IOException
	   {
		  String[][] data = ReadExcel.readdata(filename);
		  return data;
		  
	   }

}
