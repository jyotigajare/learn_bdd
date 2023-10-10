package stepdefination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {
	@Given("i am on the registration")
	public void i_am_on_the_registration() {
		Assert.assertEquals("jyoti", "jyoti");
	
	   
	}
	@When("i fill in the following information")
	public void i_fill_in_the_following_information() {
	    Assert.assertEquals("shiva", "shiva");
	}
	@When("i click the \"registration\"button")
	public void i_click_the_registration_button() {
		Assert.assertEquals(100 , 100);
	}
	@Then("i should see sucess message")
	public void i_should_see_sucess_message() {
		Assert.assertEquals( 100,100);
				
	}
	
	}



