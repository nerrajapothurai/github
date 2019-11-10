
package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Branchsearch {
   
	public static WebElement  New_Branch_btn(WebDriver driver)
	{ 
		return driver.findElement(By.xpath("//input[@id='BtnNewBR']"));
	}
	public static WebElement Country_editbox(WebDriver driver)
	{
		return driver.findElement(By.xpath("//select[@id='lst_countryS']"));
	}
	public static WebElement State_editbox(WebDriver driver)
	
	{
		return driver.findElement(By.xpath("//select[@id='lst_stateS']"));
	}
	public static WebElement City_editbox(WebDriver driver)
	{
		return driver.findElement(By.xpath("//select[@id='lst_cityS']"));
	}

	public static WebElement Search_btn(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@id='btn_search']"));
	}
	public static WebElement Clear_btn(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@id='btn_clsearch']"));
	}



}
