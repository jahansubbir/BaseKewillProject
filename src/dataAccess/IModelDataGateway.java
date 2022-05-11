package dataAccess;

import com.codoid.products.fillo.Recordset;

public interface IModelDataGateway {

	public Recordset getData(String fileName) throws Exception;
	public int insertData(String fileName,String query) throws Exception;
	public int updateData(String fileName,String query) throws Exception;
	
	}
