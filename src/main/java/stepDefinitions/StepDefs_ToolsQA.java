package stepDefinitions;



import common.Page_BasePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import seleniumpages.Page_ToolsQAPage;

public class StepDefs_ToolsQA extends Page_BasePage {

	Page_ToolsQAPage toolsqa = new Page_ToolsQAPage();
	
	@When("I open ToolsQA Page")
	public void i_open_ToolsQA_Page() {
		toolsqa.openToolsQAPage();
		
	}

	@Then("I verify that page displayes with first name")
	public void i_verify_that_page_displayes_with_first_name() {
		toolsqa.verifyFirstName();
	}


	@Then("I verify that page displayes with last name")
	public void i_verify_that_page_displayes_with_last_name() {
		toolsqa.verifyLastName();
	}

	

	
	
}
