package runner;

import io.cucumber.testng.CucumberOptions;
import stepdefinitions.BaseClass;

@CucumberOptions(features="src/test/java/feature/CreateLead.feature",
                          glue = "stepdefinitions", 
                          monochrome = true,
                          publish = true,
                          tags = "@Smoke or @Sanity")
public class Runner extends BaseClass {



}
