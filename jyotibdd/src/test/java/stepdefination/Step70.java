package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step70 {
	@Given("seperate all the student records")
	public void seperate_all_the_student_records() {
		System.out.println("student records");
	   	}

	@When("enter the student branch")
	public void enter_the_student_branch() {
		System.out.println("enter the branch");
	}

	@When("add the information student")
	public void add_the_information_student() {
		System.out.println("add information student");
	}

	@Then("store the records")
	public void store_the_records() {
		System.out.println("store the records");
}
}