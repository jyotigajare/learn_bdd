package Stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {
	@Given("go the shop website")
	public void go_the_shop_website() {
			System.out.println("go to website");
		
	}
	    

	@When("buy the saree {string}")
	public void buy_the_saree(String string) {
	   System.out.println("buy the saree");
	}

	@Then("process <price>and pay the bill")
	public void process_price_and_pay_the_bill() {
	   System.out.println("pay the bill");
	}

	
	}


