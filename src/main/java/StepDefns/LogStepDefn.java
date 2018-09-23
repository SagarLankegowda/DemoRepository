/*package StepDefns;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogStepDefn {

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
		

	}
	@When("^User Enters \"(.*)\" and \"(.*)\"$")
	public void User_Enters_Username_and_Password(String username, String password){
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		//driver.findElement(By.name("username")).sendKeys("username");
	    driver.findElement(By.name("password")).sendKeys(password);

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
	
	@Then("^User moves to new contact page$")
	public void User_moves_to_new_contact_page()  {
	    // Express the Regexp above with the code you wish you had
	   
	}
	
	
	@Then("^User enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_contact_details(String firstname, String lastname, String position) {
	    // Express the Regexp above with the code you wish you had
	driver.switchTo().frame("mainpanel");
		Actions act=new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
	 driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	 driver.findElement(By.id("first_name")).sendKeys(firstname);
	 driver.findElement(By.id("surname")).sendKeys(lastname);
	 driver.findElement(By.id("company_position")).sendKeys(position);
	 driver.findElement(By.xpath("//input[@type='submit' @value='Save']")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() {
	    // Express the Regexp above with the code you wish you had
	   System.out.println("close"); 
	}
}*/