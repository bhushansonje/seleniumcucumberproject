package seleniumpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import common.Page_BasePage;


public class Page_ToolsQAPage extends Page_BasePage {


	public void openToolsQAPage()
	{	
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	
	
	
	}
	
	public void verifyFirstName()
	{
		
	
	WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));	
		
	if (firstname.isDisplayed())
	{
		System.out.println("First name field is Displayed");
	}
	else
	{
		System.out.println("first name field is not Displayed");
	}
		
	}
	
	public void verifyLastName()
	{
		
	
	WebElement lastname = driver.findElement(By.xpath("//input[@id='lastname']"));	
		
	if (lastname.isDisplayed())
	{
		System.out.println("lastname field  is Displayed");
	}
	else
	{
		System.out.println("lastname field is not Displayed");
	}
		
	}
	
	
	
}
