package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class File2 {
	@Given("open newtours app")
	public void open_newtours_app() {
	   System.out.println("open application");
	}

	@When("user enters uname as {string} and pass as {string}")
	public void user_enters_uname_as_and_pass_as(String uname, String pass) {
		 System.out.println("username"+uname+" "+"Password"+pass);
	}

	@When("submit login form")
	public void submit_login_form() {
		 System.out.println("click submit");
	}

	@Then("verify pass")
	public void verify_pass() {
		 System.out.println("Pass");
	}

	@Then("verify fail")
	public void verify_fail() {
		 System.out.println("Fail");
	}



}
