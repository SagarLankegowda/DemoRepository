package MyRunnr;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/WorkSpaceSeleniumSelf/Ecommerce/src/main/java/Featured/ExcelDriveLogin.feature",
//@CucumberOptions(features={"C:/WorkSpaceSeleniumSelf/Ecommerce/src/main/java/Featured/login.feature", "C:/WorkSpaceSeleniumSelf/Ecommerce/src/main/java/Featured/Deals.feature"},
glue={"StepDefns"}, 

format={"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
monochrome=true,
strict=true,
dryRun=false)
//tags={"~@SmokeTest", "~@RegressionTest"})

public class Runner {

}
