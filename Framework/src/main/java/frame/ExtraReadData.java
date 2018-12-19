package frame;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExtraReadData {

	public static void main(String args []) {
		// TODO Auto-generated method stub
		
		//here 'Recordset' return type and 'getExcelData' method are used instead of static void main (main function)
		
		Fillo fillo = new Fillo();
		Connection connection ;
		
		try {
			
			connection = fillo.getConnection("C:\\Users\\Admin\\Desktop\\Data.xlsx");
			
			String strQuery ="Select * from Sheet1 where TestCaseID='1' and name='anju'";
			
			Recordset recordset = connection.executeQuery (strQuery);
			
		while(recordset.next()) {
				System.out.println(recordset.getField("TestCaseID"));
				System.out.println(recordset.getField("Name"));
				System.out.println(recordset.getField("ID"));
				
			}
			
			recordset.close();
			connection.close();
			
		}
		catch (FilloException e) {
			e.printStackTrace();
		
		}
	
	}

}
