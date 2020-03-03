package stepDefinitions;

import java.util.List;

import seleniumpages.Page_Common;
import seleniumpages.Page_DataTablePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefs_dataTable {

	
	Page_Common common = new Page_Common();
	
	Page_DataTablePage dbpage = new Page_DataTablePage();
	
	
	String facebookurl = "https://www.facebook.com/";
	
	@Given("I am on the new user registration page")
	public void i_am_on_the_new_user_registration_page() {
		 //Intiate web browser instance. driver = new FirefoxDriver();
	     
		common.navigateToPage(facebookurl);
	}

	@When("I enter invalid data on the page")
	public void i_enter_invalid_data_on_the_page(DataTable table) {
		List<List<String>> data = table.cells();
		dbpage.enterInvalidData(data);
	}

	@Then("the user registration should be unsuccessful")
	public void the_user_registration_should_be_unsuccessful() {
		dbpage.getcurrenturl();
		
	}

	
	
}
