package seleniumpages;

import java.util.List;
import java.util.concurrent.TimeUnit;





import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;
import common.Page_BasePage;

public class Page_DataTablePage extends Page_BasePage{

	
	public void enterInvalidData(List<List<String>> data)
	{	
		 System.out.println(data.get(1).get(1)); 
	      
	      //Enter data
	      driver.findElement(By.name("firstname")).sendKeys(data.get(1).get(1));
	      driver.findElement(By.name("lastname")).sendKeys(data.get(2).get(1));
	      driver.findElement(By.name("reg_email__")).sendKeys(data.get(3).get(1));     
	      driver.findElement(By.name("reg_email_confirmation__")).
	         sendKeys(data.get(4).get(1)); 
	      driver.findElement(By.name("reg_passwd__")).sendKeys(data.get(5).get(1)); 
	      
	      Select dropdownB = new Select(driver.findElement(By.name("birthday_day"))); 
	      dropdownB.selectByValue("15"); 
			
	       	Select dropdownM = new Select(driver.findElement(By.name("birthday_month")));
	      dropdownM.selectByValue("6"); 
			
	      Select dropdownY = new Select(driver.findElement(By.name("birthday_year")));
	      dropdownY.selectByValue("1990"); 
			
	      driver.findElement(By.className("_58mt")).click(); 
	      // Click submit button driver.findElement(By.name("websubmit")).click(); 
		
	}

	
	public void getcurrenturl()
	{
		 if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/")){
	         System.out.println("Test Pass"); 
	      } else { 
	         System.out.println("Test Failed"); 
	      } 
	}
	
}
