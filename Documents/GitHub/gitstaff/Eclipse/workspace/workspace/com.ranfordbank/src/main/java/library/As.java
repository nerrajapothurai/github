package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class As 
 {

	public static WebElement username_editbox(WebDriver driver)
	{
		return driver.findElement(By.id("txtuId"));
	}
	
	public static WebElement pass_editbox(WebDriver driver)
	{
		return driver.findElement(By.id("txtPword"));
		
	}
	public static WebElement login_btn(WebDriver driver)
	{
		return driver.findElement(By.id("login"));
	}
	
}


