package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Background {
	@Given("Application displays welcome message")
	public void application_displays_welcome_message() {
	    System.out.println("Open Application");
	}

	@Given("user un and pass")
	public void user_un_and_pass() {
		 System.out.println("un and pass");
	}

	@Given("click signin")
	public void click_signin() {
		 System.out.println("click signin");
	}

	@When("user searches for iphone")
	public void user_searches_for_iphone() {
		 System.out.println("search for iphone");
	}

	@When("user adding the searched product to cart")
	public void user_adding_the_searched_product_to_cart() {
		 System.out.println("add to cart");
	}

	@When("user performing payment process using netbanking")
	public void user_performing_payment_process_using_netbanking() {
		 System.out.println("netbanking");
	}

	@When("user logout")
	public void user_logout() {
		 System.out.println("click logout");
	}


}
