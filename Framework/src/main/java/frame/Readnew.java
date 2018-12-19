package frame;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Readnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fillo fillo = new Fillo();
Connection connection ;

		try {
			
			connection = fillo.getConnection("C:\\Users\\Admin\\Desktop\\excel1.xlsx");
			String Query = "select * from Sheet1  ";
			Recordset recordset = connection.executeQuery(Query);
		
		
		while (recordset.next())
		{
			System.out.println(recordset.getField("Name"));
			System.out.println(recordset.getField("Place"));
			System.out.println(recordset.getField("ID"));
			
		}
		
		recordset.close();
		connection.close();
	      }
		
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
