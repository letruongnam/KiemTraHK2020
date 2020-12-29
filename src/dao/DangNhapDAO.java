package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import bean.DangNhapBEAN;

public class DangNhapDAO {
	DungChung dc = new DungChung();
	public ArrayList<DangNhapBEAN> getDangNhap() throws Exception{
		ArrayList<DangNhapBEAN> ds = new ArrayList<>();
		dc.Ketnoi();
		
		String sql = "select * from ADMINIFOR";
		// Thực hiện câu lệnh
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
		String user = rs.getString("user");
		String name = rs.getString("name");
		String pass = rs.getString("pass");
		ds.add(new DangNhapBEAN( user,  name,  pass));
	}
	rs.close();
	dc.cn.close();
	return ds;
	
	}


}	
