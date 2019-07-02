package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signup {

@Given("user opens signup page")
public void user_opens_signup_page() {
	System.out.println("Open application");
}
	@When("user enters fn as {string}")
	public void user_enters_fn_as(String fn) {
	    System.out.println("firstname"+fn);
	}

	@When("user enters ln as {string}")
	public void user_enters_ln_as(String ln) {
		System.out.println("firstname"+ln);
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String dob) {
		System.out.println("firstname"+dob);
	}

	@When("user enters psd as {string}")
	public void user_enters_psd_as(String pass) {
		System.out.println("firstname"+pass);
	}

	@When("user enters cnfrmpass as {string}")
	public void user_enters_cnfrmpass_as(String cpass) {
		System.out.println("firstname"+cpass);
	}

	@Then("click signup button")
	public void click_signup_button() {
		System.out.println("Click signup button");
		
	}

	@Then("verify signup success message")
	public void verify_signup_success_message() {
		System.out.println("verify success");
	}


}
