package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Admin
{
	public static WebElement Branches_btn(WebDriver driver)
	{
		return driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']"));
	}
	public static WebElement Roles_btn(WebDriver driver)
	{
		return driver.findElement(By.xpath("//img[@src='images/Roles_but.jpg']"));
	}
	public static WebElement Users_btn(WebDriver driver)
	{
		return driver.findElement(By.xpath("//img[@src='images/Users_but.jpg']"));
	}
	
	public static WebElement emp_btn(WebDriver driver)
	{
		return driver.findElement(By.xpath("//img[@src='images/emp_btn.jpg']"));
	}
	
}
