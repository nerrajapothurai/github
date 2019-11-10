package simple;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrayspicejet {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		while(true)
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			String text=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span")).getText();
			if(text.contains("April"))
			{
			WebElement table=	driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
			List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(WebElement r:rows)
		{
			List<WebElement> columns=r.findElements(By.tagName("td"));
			for(WebElement c:columns)
			{
				String x=c.getText();
				System.out.println(x);
				if(x.contains("25"))
				{
					c.click();
					break;
				}
			}
		}
			
		}
	}

	}
}
