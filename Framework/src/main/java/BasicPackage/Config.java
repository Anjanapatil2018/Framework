package BasicPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {

	
		public WebDriver driver=null;
		public Config()
		{
			System.setProperty("webdriver.chrome.driver", ReadPropertyFile.getProperty("ChromeDriverPath"));
			 driver=new ChromeDriver();
			driver.get(ReadPropertyFile.getProperty("ApplicationURL"));
			
		}
	}

	



