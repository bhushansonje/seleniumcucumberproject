package stepDefinitions;

import io.cucumber.java.en.Given;
import common.Page_BasePage;

public class StepDefs_scenarios extends Page_BasePage {

	
	@Given("Step from {string} in {string} feature file")
	public void step_from_in_feature_file(String scenario, String file) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.format("Thread ID - %2d - %s from %s feature file.\n",
			        Thread.currentThread().getId(), scenario,file);
	}

	

	
}
