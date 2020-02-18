package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features", 
glue={"stepDefinitions"}, 
plugin = { "pretty" , "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"  },
tags = {"@Test"},
dryRun = false,
strict = true, 
monochrome = true

//dryRun = true, 

// by default its false. if you set true it will gives you message for missing step definition
//Dry Run is nothing  but checking the complete implementation of all the mentioned steps present in the Feature file.
//Before the execution starts . Dry Run is Checking the implementionation  not about the execution  of scripts.

// strict = true, 
// Build will fail if steps definition steps are missing 

// monochrome = true

// output console is more readable if its true
		
		)
public class TestRunner_GoogleHomepage {

	
}
