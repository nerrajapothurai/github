package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Users {
	
public static WebElement Branch_editbox(WebDriver driver)
{
	return driver.findElement(By.xpath("//select[@id='lst_branchS']"));
}
public static WebElement Roles_editbox(WebDriver driver)
{
return driver.findElement(By.xpath("//select[@id='lst_rolesS']"));	
}
public static WebElement Search_btn(WebDriver driver)
{
return driver.findElement(By.xpath("//input[@id='btn_search']"));	
}
public static WebElement NewUser_btn(WebDriver driver)
{
	return driver.findElement(By.xpath("//input[@id=\"Btnuser\"]"));
}
}

