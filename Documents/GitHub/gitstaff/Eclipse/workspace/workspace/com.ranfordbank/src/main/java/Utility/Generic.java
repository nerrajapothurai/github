package Utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic {
	public static void dp_handle(WebElement element,String exp)
	{
		Select s=new Select(element);
		List<WebElement> list=s.getOptions();
		for(WebElement e:list) 
		{
			String text=e.getText();
			if(text.contains(exp))
			{
				s.selectByVisibleText(text);
				break;
			}
		}
	}

}
