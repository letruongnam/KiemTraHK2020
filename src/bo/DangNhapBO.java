package bo;

import java.util.ArrayList;

import bean.DangNhapBEAN;
import dao.DangNhapDAO;

public class DangNhapBO {
	public ArrayList<DangNhapBEAN> getDangNhap() throws Exception{
		DangNhapDAO dangNhapDAO = new DangNhapDAO();
		return dangNhapDAO.getDangNhap();
		
	}
}
