package BasicPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public abstract class GenericFunctions extends Config {
/*adagdhffdfdd*/

		public abstract void pageImpl(String testCaseName,String sheetName);
		public void set(String ele,String data)
		{
			driver.findElement(By.xpath(ele)).sendKeys(data);
			
		}
		public void click(String ele)
		{
			driver.findElement(By.xpath(ele)).click();
		}
	
public void selectByValue(String ele,String data)
{
	
	Select sel = new Select (driver.findElement(By.xpath(ele)));
	sel.selectByIndex('7');
	
}
		
		
	}


