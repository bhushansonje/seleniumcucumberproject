package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import common.Page_BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumpages.Page_GoogleHomePage;

public class StepDefs_GoogleHomePage extends Page_BasePage {

	Page_GoogleHomePage homepage = new Page_GoogleHomePage();
	
	
	

	/*@When("^I open Google Home page$")
	public void i_open_Google_Home_page() {
	 
		System.out.println("OPENING GOOGLE HOME PAGE");
	   
		homepage.openGoogleHomePage();
		
	}
	
	

	@Then("^I verify that page displayes with search textbox$")
	public void i_verify_that_page_displayes_with_search_textbox() {
	   
		System.out.println("Vaerifying elements on GOOGLE HOME PAGE");
		   
		homepage.verifySearch();
	}
	
	
	@Then("I search {string} keyword on google home page")
	public void i_search_keyword_on_google_home_page(String keyword) {
	    try {
			homepage.serchKeyword(keyword);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	
	@When("I open Google Home page")
	public void i_open_Google_Home_page() {
		System.out.println("OPENING GOOGLE HOME PAGE");
		   
		homepage.openGoogleHomePage();
	}

	@Then("I verify that page displayes with search textbox")
	public void i_verify_that_page_displayes_with_search_textbox() {
		System.out.println("Vaerifying elements on GOOGLE HOME PAGE");
		   
		homepage.verifySearch();
	}



	@Then("I search {string} keyword on google home page")
	public void i_search_keyword_on_google_home_page(String keyword) {
	    // Write code here that turns the phrase above into concrete actions
		try {
			homepage.serchKeyword(keyword);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
}
