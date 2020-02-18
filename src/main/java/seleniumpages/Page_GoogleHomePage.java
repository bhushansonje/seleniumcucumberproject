package seleniumpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import org.testng.Assert;

import common.Page_BasePage;


public class Page_GoogleHomePage extends Page_BasePage {

	By search = By.xpath("//input[@title='Search']");
	
	/*
	public Page_GoogleHomePage()
	{
		this.driver=driver;
	}
	*/
	
	
	public void openGoogleHomePage()
	{	
	driver.get("https://www.google.com");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	
	String title = driver.getTitle();
	
	System.out.println("title:  " + title);
	
	Assert.assertEquals(title,"Google");
	

	
	}
	
	public void verifySearch()
	{	
		WebElement searchbox = driver.findElement(search);
	
		if (searchbox.isDisplayed())
	{
		System.out.println("Search Box is Displayed");
	}
	else
	{
		System.out.println("Search Box is not Displayed");
	}
		
	}
	
	public void serchKeyword(String keyword) throws InterruptedException
	{
		WebElement searchbox = driver.findElement(search);
		searchbox.sendKeys(keyword);
		
		Thread.sleep(2000);
	}
	
	
	
}
