/*package StepDefns;



import junit.framework.Assert;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver driver;
	WebElement ele;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_Page()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\sagar laptop\\cucumber jars\\geckodriver\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.get(" https://www.freecrm.com");
		driver.manage().window().maximize();
	System.out.println("lgoin page scenario");
	}
	@When("^title of login page is FreeCRM$")
	public void title_of_login_page_is_FreeCRM()
	{
		System.out.println("Title of login page FreeCRM");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	}
	@Then("^User enters Username and Password$")
	public void User_enters_Username_and_Password()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("eclipse");
		//driver.findElement(By.name("username")).sendKeys("username");
	    driver.findElement(By.name("password")).sendKeys("eclipse");
		System.out.println("User enters username and password");
	}
	@Then("^User clicks on Login Button$")
	public void User_Clicks_on_Login_Button()
	{
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		//WebElement loginBtn =driver.findElement(By.xpath("//input[@type='submsit']"));
		//loginBtn.click();
//		JavaScriptExecutor js=(JavaScriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginBtn);
		System.out.println("User clicks on Login Button");
	}




}*/