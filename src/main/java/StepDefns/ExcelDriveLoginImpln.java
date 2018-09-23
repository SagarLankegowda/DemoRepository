package StepDefns;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Library.ExcelDataConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExcelDriveLoginImpln {
	WebDriver driver;

	@Given("^User is already on login page$")
	public void User_is_already_on_login_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "E:\\sagar laptop\\cucumber jars\\geckodriver\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get(" https://www.freecrm.com");
		driver.manage().window().maximize();
	}

	@When("^I Create the Excel Workbook \"([^\"]*)\" and create the test data$")
	public void I_Create_the_Excel_Workbook_and_create_the_test_data(String arg1) throws Throwable {
		// Express the Regexp above with the code you wish you had
		ExcelDataConfig excelconfig = new ExcelDataConfig("E:\\sagar laptop\\cucumber jars\\TestData.xlsx");

		System.out.println(excelconfig.getData(0, 0, 1));
		String uname = excelconfig.getData(1, 0, 0);
		String pwd = excelconfig.getData(1, 0, 1);

		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);

	}

	@Then("^I Login to the application$")
	public void I_Login_to_the_application() throws Throwable {
		// Express the Regexp above with the code you wish you had
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
