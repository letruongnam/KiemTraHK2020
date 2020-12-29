package bo;

import java.util.ArrayList;

import bean.BenhAnBEAN;
import dao.BenhAnDAO;

public class BenhAnBO {
	public ArrayList<BenhAnBEAN> getBenhAn() throws Exception{
		BenhAnDAO benhAnDAO = new BenhAnDAO();
		return benhAnDAO.getBenhAn();
		
	}
	public ArrayList<BenhAnBEAN> timBenhAn(String DoctorID) throws Exception{
		
		BenhAnDAO benhAnDAO = new BenhAnDAO();
		return benhAnDAO.timBenhAn(DoctorID);
	}
}
