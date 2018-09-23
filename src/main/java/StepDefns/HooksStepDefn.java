/*package StepDefns;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefn {
	
	@Before
	public void setUP()
	{
		System.out.println("launch firefox browser");
		System.out.println("Enter free crm url");
	}
	
	@After
	public void teardown()
	{
		System.out.println("close the browser");
	}

@Given("^User is on deal page$")
public void User_is_on_deal_page(){
   System.out.println("user is on deal page");
}

@When("^user fills the deal form$")
public void user_fills_the_deal_form()  {
    // Express the Regexp above with the code you wish you had
    System.out.println("user fills the deal form");
}

@Then("^deal is created$")
public void deal_is_created()  {
    // Express the Regexp above with the code you wish you had
    System.out.println("deal is created");
}

@Given("^User is on contact page$")
public void User_is_on_contact_page() {
    // Express the Regexp above with the code you wish you had
  System.out.println("user is on contact page");
}

@When("^user fills the contact form$")
public void user_fills_the_contact_form() {
    // Express the Regexp above with the code you wish you had
    System.out.println("user fills the contact form");
}

@Then("^contact is created$")
public void contact_is_created() {
    // Express the Regexp above with the code you wish you had
  System.out.println("contact is created");  
}
}
*/