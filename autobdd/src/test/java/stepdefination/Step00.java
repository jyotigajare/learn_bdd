package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step00 {
	@Given("login the t-shirt section")
	public void login_the_t_shirt_section() {
		System.out.println("login t-shirt");
	   
	}

	@When("follow the information")
	public void follow_the_information(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println("follow the information");
	}

	@When("select the t-shirt size and color")
	public void select_the_t_shirt_size_and_color() {
	   System.out.println("select the t-shirt");


	}
}
