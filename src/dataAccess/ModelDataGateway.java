package dataAccess;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ModelDataGateway implements IModelDataGateway{

	@Override
	public Recordset getData(String fileName) throws Exception {
		// TODO Auto-generated method stub
		Recordset recordset = null;
		// TODO Auto-generated method stub
		Fillo fillo = new Fillo();
		Connection connection = null;
		try {
			connection = fillo.getConnection(fileName);
			String query = "SELECT * FROM Sheet1";// "AND
																		// Status<>'Updated'";
			recordset = connection.executeQuery(query);

			return recordset;
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}

	}

	@Override
	public int insertData(String fileName, String query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateData(String fileName, String query) {
		// TODO Auto-generated method stub
		return 0;
	}

}
