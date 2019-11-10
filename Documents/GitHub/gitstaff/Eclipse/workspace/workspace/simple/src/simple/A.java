package simple;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\testing\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.get("http://183.82.100.55/ranford1/home.aspx");
	
	String actualurl=driver.getCurrentUrl();
	
String expurl=("http://183.82.100.55/ranford1/home.aspx");
if(actualurl.contains(expurl))
{
	System.out.println("launch test is pass "+actualurl+"is matching expurl"+expurl);
}
else
{
	System.out.println("launch test is failed "+actualurl+"isnot matching expurl"+expurl);
}
}	
}
	


