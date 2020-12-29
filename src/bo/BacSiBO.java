package bo;

import java.util.ArrayList;

import bean.BacSiBEAN;
import dao.BacSiDAO;

public class BacSiBO {
	public ArrayList<BacSiBEAN> getBacSi() throws Exception{
		BacSiDAO bacSiDAO = new BacSiDAO();
		return bacSiDAO.getBacSi();
		
	}
	public int ThemBacSi(String doctorID, String doctorName, String address, String phoneNumber) throws Exception{
		BacSiDAO bacSiDAO = new BacSiDAO();
		return bacSiDAO.ThemBacSi(doctorID, doctorName, address, phoneNumber);
	}
}
