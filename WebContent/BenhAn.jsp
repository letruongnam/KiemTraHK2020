<%@page import="bean.BacSiBEAN"%>
<%@page import="java.awt.event.ItemEvent"%>
<%@page import="bean.BenhAnBEAN"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	%>
	<div class="row profile">
		<div class="col-md-2">
			<div class="profile-sidebar">

				<div class="profile-userpic">
					<img
						src="http://keenthemes.com/preview/metronic/theme/assets/admin/pages/media/profile/profile_user.jpg"
						class="img-responsive" alt="">
				</div>

				<div class="profile-usermenu">
					<ul class="nav">
						<li style="background-color: #52fff3"><a href="BacSiController"> <i
								class="glyphicon glyphicon-home"></i> Quản lý bệnh án
						</a></li>
						<li class="active"><a href="DangNhapController"> <i
								class="glyphicon glyphicon-user"></i>Đăng nhập
						</a></li>
						<li class="active"><a href="ThemBacSi"> <i
								class="glyphicon glyphicon-user"></i>Thêm Bác Sĩ
						</a></li>
						<%if(session.getAttribute("txtUser")!=null){ %>
						<li class="active"><a href="DangXuat"> <i
								class="glyphicon glyphicon-user"></i>Đăng xuất
						</a></li>
						<%} %>
					</ul>
				</div>

			</div>
		</div>

		<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">

			<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
				<table  class="table table-hover">
					<thead style="color: white; background-color: #4d4f4f">
					<tr>
						<th>Danh sách bác sĩ</th>
						
		
					</tr>
				</thead>
					<tbody>
						<% ArrayList<BacSiBEAN> ds = (ArrayList<BacSiBEAN>) request.getAttribute("ds");
							if(ds.size()>0)
								for(BacSiBEAN item: ds){
						%>
						<tr>
							<td><a href="BacSiController?ma=<%=item.getDoctorID()%>"><%=item.getDoctorName() %></a>

							</td>

						</tr>
						<%} %>
					</tbody>
				</table>
			</div>
			<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				<table  class="table table-hover">
				<thead style="color: white; background-color: #4d4f4f">
					<tr >
						<th>Mã bệnh nhân</th>
						
						<th>Ngày Khám</th>
						<th>Kết quả</th>
						<th>Điều trị</th>
						
		
					</tr>
				</thead>
					<tbody>
						<%
						ArrayList<BenhAnBEAN> dsBenhAn = (ArrayList<BenhAnBEAN>) request.getAttribute("dsBenhAn");
						if(dsBenhAn!=null && dsBenhAn.size()>0)
							for(BenhAnBEAN benhAn:dsBenhAn){
						%>
						<tr>
							<td>
								<%=benhAn.getPatientID() %>
							</td>
							<td>
								<%=benhAn.getExamineDate() %>
							</td>
							<td>
								<%=benhAn.getResult() %>
							</td>
							<td>
								<%=benhAn.getTreatment() %>
							</td>

						</tr>
						<%
						}else{
							
						
						%>
						<tr>
							<td colspan="4" style="background-color: orange;">Không có bệnh án nào của bác sĩ này trên hệ thống</td>
						</tr>
						<%} %>
					</tbody>
				</table>
			</div>
			











		</div>

	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>