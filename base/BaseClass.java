package base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass {
	
	public RemoteWebDriver driver;
	public String filename;

	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	}
	@AfterMethod
    public void postCondition() {
		driver.close();
		
	}
	
	@DataProvider(name="fetchData", indices = 0)
	public String[][] setData() throws IOException
	{
		return ReadExcel.readdata(filename);
		
	}

}
