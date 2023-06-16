package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasicTest 
{
	@Given("site address")
	public void site_address() 
	{
	   System.out.println("Open browser");
	   System.out.println("Navigate to page");
	}
	@When("user enter valid email")
	public void user_enter_valid_email() 
	{
	   System.out.println("Enter valid email");
	}
	@When("enter valid password")
	public void enter_valid_password() 
	{
	   System.out.println("Enter valid password");
	}
	@When("click on login button")
	public void click_on_login_button() 
	{
	    System.out.println("Click on login button");
	}
	
	@When("user enter valid mobile")
	public void user_enter_valid_mobile() {
	   System.out.println("mobile entry successful");
	}


	
	@Then("verify login successful")
	public void verify_login_successful() 
	{
		System.out.println("Verify Login Successful message");

	}

}
