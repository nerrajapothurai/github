package simple;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class D {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http;//www.google.com/");
        driver.findElement(By.name("q")).sendKeys("ranford bank");
        Thread.sleep(1500);
        driver.findElement(By.name("btnk")).click();
		driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div[1]/div/div/div[1]/a/h3")).click();
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[2]/a/img")).click();
		 driver.findElement(By.xpath("//*[@id=\'drlist\']")).click();
		WebElement e= driver.findElement(By.name("1"));
		Select s=new Select(e);
		List<WebElement> list=s.getOptions();
		int count=list.size();
		System.out.println("no of options present in dropdown="+count);
		for(int i=0;i<count;i++)
		{
			String x=list.get(i).getText();
			System.out.println(x);
		}
	}
}
