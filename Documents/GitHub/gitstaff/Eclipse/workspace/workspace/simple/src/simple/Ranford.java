package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ranford {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ranfordbank");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		driver.findElement(By.xpath("//*[text()='RANFORD BANK']")).click();
	    driver.findElement(By.xpath("//img[@src='images/mainlinks_02.jpg']")).click();
	    driver.findElement(By.xpath("//input[@name='txtuId']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name='login']")).click();
	    driver.findElement(By.xpath("//*[@src='images/Branches_but.jpg']")).click();
	    driver.findElement(By.xpath("//*[text()='...']")).click();
	    for(int i=1;i<lenght)
	    
	    
	}
	

}
