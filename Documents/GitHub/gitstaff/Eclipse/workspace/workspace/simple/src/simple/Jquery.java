package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Jquery {
	
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\testing\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	Actions a=new Actions(driver);
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	a.dragAndDrop(drag, drop).perform();
	Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Selectable']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@class='ui-selectable']/li[2]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-arrowthick-2-n-s'])[2]"));
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-arrowthick-2-n-s'])[5]"));
	a.dragAndDrop(drag, drop).perform();
	driver.close();
		}
	}



