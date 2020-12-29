package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.BenhAnBEAN;


public class BenhAnDAO {

	DungChung dc = new DungChung();
	public ArrayList<BenhAnBEAN> getBenhAn() throws Exception{
		 ArrayList<BenhAnBEAN> ds = new ArrayList<>();
			dc.Ketnoi();
			
			String sql = "select * from Examine";
			// Thực hiện câu lệnh
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
			String PatientID = rs.getString("PatientID");
			String DoctorID = rs.getString("DoctorID");
			Date ExamineDate = rs.getDate("ExamineDate");
			String Result = rs.getString("Result");
			String Treatments = rs.getString("Treatments");
			
			
			
			ds.add(new BenhAnBEAN(PatientID, DoctorID, ExamineDate, Result, Treatments));
		}
		rs.close();
		dc.cn.close();
		return ds;
	}
	
	public ArrayList<BenhAnBEAN> timBenhAn(String DoctorID) throws Exception{
		 ArrayList<BenhAnBEAN> ds = new ArrayList<>();
			dc.Ketnoi();
			
			String sql =" select * from examine where DoctorID='"+DoctorID+"'";
			// Thực hiện câu lệnh
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while (rs.next()) {
			String PatientID = rs.getString("PatientID");

			Date ExamineDate = rs.getDate("ExamineDate");
			String Result = rs.getString("Result");
			String Treatments = rs.getString("Treatments");
			
			
			
			ds.add(new BenhAnBEAN(PatientID, DoctorID, ExamineDate, Result, Treatments));
		}
		rs.close();
		dc.cn.close();
		return ds;
	}
}
