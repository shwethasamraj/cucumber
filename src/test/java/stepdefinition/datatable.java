package stepdefinition;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datatable {

	@When("user searches")
	public void user_searches(io.cucumber.datatable.DataTable productsdata) {
	  List<String> productsname=productsdata.asList();
	  for(String products:productsname)
	  {
		  System.out.println(products);
	  }
	}

	@When("verify")
	public void verify() {
	  
	}

	@Then("close")
	public void close() {
	   
	}


}
