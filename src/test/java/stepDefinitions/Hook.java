package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.chrome.ChromeDriver;

import common.Page_BasePage;

public class Hook extends Page_BasePage {

	// Before hook
		@Before
		public void launchbrowser()
		{
			System.out.println(" BEFORE HOOK");
			
			System.setProperty("webdriver.chrome.driver", driverPath
					+ "chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		// After Hook
		@After
		public void closebrowser()
		{
			driver.quit();
			
			System.out.println(" AFTER HOOK");
		
		}
}
