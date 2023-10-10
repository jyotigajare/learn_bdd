package Stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login {


@Given("registertation link aviable in webpage")
public void registertation_link_aviable_in_webpage() {
    System.out.println("registeration link");
    Assert.assertEquals("jyoti", "jyoti");
}

@When("customer fill the information")
public void customer_fill_the_information(io.cucumber.datatable.DataTable dataTable) {
	 System.out.println("customer information");
	 Assert.assertEquals(100, 100);
	}


@When("click the \"registrationbutton\"and login the website")
public void click_the_registrationbutton_and_login_the_website() {
    System.out.println("click login website");
    
}

@Then("see the sucess message")
public void see_the_sucess_message() {
	System.out.println("see sucess message");
}



}
