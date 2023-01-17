package testcases;

import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	public static void main(String[] args) throws IOException {
		
	    System.out.println("Extent Report started"); 
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		ExtentTest test1 = extent.createTest("Create Lead", "Create Lead with Mandatory fields");
		test1.assignCategory("Functional");
		test1.assignAuthor("Monica");
		test1.pass("Username is entered successfully");
		test1.pass("Password is entered successfully");
		test1.pass("Login is clicked successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././images/img0.png").build());
		
		/*
		 * ExtentTest test2 = extent.createTest("Edit Lead",
		 * "Edit the newly created lead"); test2.assignCategory("Functional");
		 * test2.assignAuthor("Monica"); test2.pass("Username is entered successfully");
		 * test2.pass("Password is entered successfully");
		 * test2.fail("Login is not successful");
		 */
		
		extent.flush();
		

	
	}

}
