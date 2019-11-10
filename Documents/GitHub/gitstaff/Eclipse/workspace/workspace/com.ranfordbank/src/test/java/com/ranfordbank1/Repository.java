package com.ranfordbank1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Generic;
import library.Admin;
import library.As;
import library.Branchsearch;
import library.Newbranches;
import library.Users; 

public class Repository {

 WebDriver driver;
public  void launch()
{
	//System.setProperty("webdriver.chrome.driver","‪‪D:\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("http://srssprojects.in/home.aspx");
	
}
public void As()
{
	
	As.username_editbox(driver).sendKeys("Admin");
	As.pass_editbox(driver).sendKeys("Admin");
	As.login_btn(driver).click();
}
public void Branches()

{
	Admin.Branches_btn(driver).click();
}
public void  Branchsearch()

{
  	Generic.dp_handle(Branchsearch.Country_editbox(driver), "INDIA");
	Generic.dp_handle(Branchsearch.State_editbox(driver), "Andhra Pradesh");
	Generic.dp_handle(Branchsearch.City_editbox(driver), "Hyderabad");
	Branchsearch.Search_btn(driver).click();
}
public void Newbranch()
{
	Branchsearch.New_Branch_btn(driver).click();
}
public void NewBranches()
{
	Newbranches.BranchName_editbox(driver).sendKeys("Bannbbv");
	Newbranches.Address1_editbox(driver).sendKeys("Assfb");
	Newbranches.Address2_editbox(driver).sendKeys("Basasd");
	Newbranches.Address3_editbox(driver).sendKeys("Csfs");
	Newbranches.Area_editbox(driver).sendKeys("Rsfdgv");
	Newbranches.Zipcode_editbox(driver).sendKeys("123456");
	Generic.dp_handle(Newbranches.Country_editbox(driver), "INDIA");
	Generic.dp_handle(Newbranches.State_editbox(driver), "Andhra Pradesh");
	Generic.dp_handle(Newbranches.City(driver), "Hyderabad");
	Newbranches.Submit_btn(driver).click();
	driver.switchTo().alert().accept();
}
public void user()
{
	Admin.Users_btn(driver).click();
}
public void Users()
{
	Generic.dp_handle(Users.Branch_editbox(driver), "1");
	
	Generic.dp_handle(Users.Roles_editbox(driver), "icustomer");
	Users.Search_btn(driver).click();
}
}




