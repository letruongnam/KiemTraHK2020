package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


import bean.BacSiBEAN;


public class BacSiDAO {
	
	DungChung dc = new DungChung();
	public ArrayList<BacSiBEAN> getBacSi() throws Exception{
		ArrayList<BacSiBEAN> ds = new ArrayList<>();
		dc.Ketnoi();
		
		String sql = "select * from Doctor";
		// Thực hiện câu lệnh
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
		String doctorID = rs.getString("doctorID");
		String doctorName = rs.getString("doctorName");
		String address = rs.getString("address");
		String phoneNumber = rs.getString("phoneNumber");
		
		ds.add(new BacSiBEAN( doctorID,  doctorName,  address,  phoneNumber));
	}
	rs.close();
	dc.cn.close();
	return ds;
	}
	
	public int ThemBacSi(String doctorID, String doctorName, String address, String phoneNumber) throws Exception{
		dc.Ketnoi();
		
				
		String sql = "insert into Doctor values('"+doctorID+"',N'"+doctorName+"','"+address+"','"+phoneNumber+"')";
		System.out.print(sql);

		PreparedStatement cmd = dc.cn.prepareStatement(sql);

		int kq = cmd.executeUpdate();
		dc.cn.close();

		return kq;
	}
	
}
