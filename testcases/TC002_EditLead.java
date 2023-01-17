package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.LoginPage;

public class TC002_EditLead  extends BaseClass{
	
	@BeforeClass
	public void setfilename()
	{
		filename = "EditLead_data";
	}
	
	@Test(dataProvider = "fetchData")
	public void runEditLead(String cName, String fName , String lName) {
			
		new LoginPage(driver).enterusername().enterpassword().login().clickcrmsfa().clickcreatelead().entercompanyname(cName)
		.enterfirstname(fName).enterlastname(lName).submit().title().clickeditLead().editdescription().esubmit().title();

	}

}
