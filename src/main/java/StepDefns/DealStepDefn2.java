package StepDefns;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepDefn2 {

	WebDriver driver;
	WebElement ele;
	
	@Given("^User is already in login page$")
	public void User_is_already_in_login_page(){
		// Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.gecko.driver", "E:\\sagar laptop\\cucumber jars\\geckodriver\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get(" https://www.freecrm.com");
		driver.manage().window().maximize();
		System.out.println("Browser launched successfully");
		
		

	}
	@When("^User Enters username and password$") 	
	public void User_Enters_username_and_password(DataTable creditianls){
		List<List<String>> data=creditianls.raw();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0));
		//driver.findElement(By.name("username")).sendKeys("username");
		
		WebDriverWait wait=new WebDriverWait(driver, 1000);
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		ele.sendKeys(data.get(0).get(1));

	}
	@Then("^User Clicks On Login button$")
	public void User_Clicks_On_Login_button() {
		
		WebElement lgnbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		   lgnbutton.click();
	}
	
	@Then("^User is on Home Page$")
	public void User_is_on_Home_Page() {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("Homepage");
	}
	
	@Then("^User moves to deal page$")
	public void User_moves_to_deal_page() {
	    // Express the Regexp above with the code you wish you ha
		driver.switchTo().frame("mainpanel");
		Actions act=new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	 driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}
	@Then("^User enters deal details$")
	public void User_enters_deal_details(DataTable dealdata) {
	
		List<List<String>>dealvalues =dealdata.raw();
		   driver.findElement(By.id("title")).sendKeys(dealvalues.get(0).get(0));
		   driver.findElement(By.id("amount")).sendKeys(dealvalues.get(0).get(1));
		   driver.findElement(By.id("probability")).sendKeys(dealvalues.get(0).get(2));
		   driver.findElement(By.id("commission")).sendKeys(dealvalues.get(0).get(3));
	}
	
}	