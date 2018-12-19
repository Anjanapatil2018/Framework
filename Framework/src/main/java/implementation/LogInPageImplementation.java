package implementation;

import java.util.HashMap;
import java.util.Map;

import BasicPackage.GenericFunctions;
import frame.ReadData;

public class LogInPageImplementation extends GenericFunctions {

	
	@Override
	public void pageImpl(String testCaseName,String sheetName) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String,String> elements=new HashMap<String,String>();
		Map<String,String> data=new HashMap<String,String>();
		elements=ReadData.getPageElements(sheetName);
		data=ReadData.getTestData(testCaseName,sheetName );
		
			set(elements.get("Email"),data.get("Email"));
			
			
	}

}


	
	
	
	
	
	

