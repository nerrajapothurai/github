package simple;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.w3schools.com/");
	driver.findElement(By.xpath("//a[@title='Search W3Schools']")).click();
	
	driver.findElement(By.id("gsc-i-id1")).sendKeys("json");
	driver.findElement(By.xpath("//button[@class='gsc-search-button gsc-search-button-v2']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'master-1')]")));
		driver.findElement(By.xpath(" //span[text()=' Visit Website'][1]")).click();
			driver.close();
		
	
		
		
	}	
}
