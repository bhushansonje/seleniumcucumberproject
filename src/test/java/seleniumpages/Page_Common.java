package seleniumpages;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import common.Page_BasePage;

public class Page_Common extends Page_BasePage{

	public void navigateToPage(String url)
	{	
	driver.get(url);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	
	String title = driver.getTitle();
	
	System.out.println("title:  " + title);
		
	}
	
}
