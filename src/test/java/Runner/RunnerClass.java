package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/datatable.feature"},glue="stepdefinition",plugin="json:target/jsonreport")
public class RunnerClass {

}
