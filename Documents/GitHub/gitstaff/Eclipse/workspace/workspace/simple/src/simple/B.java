package simple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	

	public static void main(String[] args) {
		cdriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTNR")).click();
		 
		WebElement e= driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTNR"));
		
		List<WebElement>   list=e.findElements(By.tagName("a"));
		
		
	int count=	list.size();
		
		
	for(int i=0;i<count;i++)
	{
		   String x=list.get(i).getText();
		   
		   System.out.println(x);
		   
		   if(x.contains("Goa (GOI)"))
		   {
			   list.get(i).click();
			   break;
		   }
	}
	WebElement e1=driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTNR"));
	List<WebElement>   list1=e1.findElements(By.tagName("d"));
	
	int count1=list1.size();
	for(int j=0;j<count1;j++)
	{
		String x1=list.get(j).getText();
		System.out.println(x1);
	}
	}
	}



	    driver.findElement(By.linkText("REGISTER")). click();
		driver.findElement(By.name("firstName")).sendKeys("pothurai");
		driver.findElement(By.name("lastName")).sendKeys("neeraja");
		driver.findElement(By.name("phone")).sendKeys("9985017139");
		driver.findElement(By.id("userName")).sendKeys("neerajapothurai94");
		driver.findElement(By.name("address1")).sendKeys("ananatpur");
		driver.findElement(By.name("address2")).sendKeys("ananatpur2");
		 driver.findElement(By.name("city")).sendKeys("anatapur");
	    driver.findElement(By.name("state")).sendKeys("andhra");
	    driver.findElement(By.name("postalCode")).sendKeys("515731");
	    driver.findElement(By.name("email")).sendKeys("neerajapothurai94");
	    driver.findElement(By.name("password")).sendKeys("neeraja@31");
	    driver.findElement(By.name("confirmPassword")).sendKeys("neeraja231");
	    driver.findElement(By.name("register")).click();
	}
}
	
	

