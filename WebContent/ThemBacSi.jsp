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
						<li ><a href="BacSiController"> <i
								class="glyphicon glyphicon-home"></i> Quản lý bệnh án
						</a></li>
						<li class="active"><a href="DangNhapController"> <i
								class="glyphicon glyphicon-user"></i>Đăng nhập
						</a></li>
						<li class="active"><a href="ThemBacSi" style="background-color: #52fff3"> <i
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

		<form action="XacNhanThem" method="POST" >
				
			
				<div class="form-group">
					
					
					<label for="">Mã Bác sĩ</label>
					<input type="text" name="DoctorID" class="form-control" placeholder="Input field">
					
					<label for="">Tên bác sĩ</label>
					<input type="text" name="DoctorName" class="form-control"  placeholder="Input field">
					
					<label for="">Địa chỉ</label>
					<input type="text" name="Address" class="form-control"  placeholder="Input field">
					
					<label for="">Số điện thoại</label>
					<input type="text" name="PhoneNumber" class="form-control"  placeholder="Input field">
					
					
					
				</div>
			
				<button type="submit" name="btn" value="1" class="btn btn-primary">Submit</button>
			
			</form>

		</div>

	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>