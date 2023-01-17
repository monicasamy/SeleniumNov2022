package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.LoginPage;

public class TC001_CreateLead  extends BaseClass{
	
	
	@BeforeClass
	public void setfilename()
	{
		filename = "CreateLead_data";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cName,String fName , String lName) {
			
		new LoginPage(driver).enterusername().enterpassword().login().clickcrmsfa().clickcreatelead().entercompanyname(cName)
		.enterfirstname(fName).enterlastname(lName).
		 //enterlocalname().enterdepartmentname().enterdescription().enteremail().entercity().
		 submit().title();

	}

}
