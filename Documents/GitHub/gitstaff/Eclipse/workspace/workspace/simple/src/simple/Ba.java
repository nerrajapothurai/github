package simple;






import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ba {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\testing\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	WebElement e=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTNR"));
	List<WebElement> list=e.findElements(By.tagName("a"));
	int count=list.size();
	for(int i=0;i<count;i++)
	{
		String x=list.get(i).getText();
		System.out.println(x);
		if(x.contains("Vishakhapatnam (VTZ)"))
		{		
	list.get(i).click();
	break;
		}
	}
	driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	WebElement e1=driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTNR"));
	List<WebElement> list1=e1.findElements(By.tagName("a"));
	int count1=list1.size();
	for(int j=0;j<count1;j++) {
		String y=list1.get(j).getText();
		System.out.println(y);
		if(y.contains("Varanasi (VNS)")) {
			list1.get(j).click();
			break;
		}
	}
	driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_txt_Fromdate\']")).click();
	driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[1]/table/tbody/tr[3]/td[6]/a")).click();
	}
	}		

		