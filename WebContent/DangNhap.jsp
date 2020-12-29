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
	
    String Alert = request.getParameter("Alert");
    String loi =(String) request.getAttribute("Loi");
    String txtUser=request.getParameter("txtUser");
    String txtPass=request.getParameter("txtPass");
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
						<li><a href="BacSiController"> <i
								class="glyphicon glyphicon-home"></i> Quản lý bệnh án
						</a></li>
						<li class="active" style="background-color: #52fff3"><a href="DangNhapController"> <i
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

			        <div class="row mt-50">
            
            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                    
            </div>
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 mt-10">
              <div class="text-center">
              <img src="img/login.png" width="200px" >
              </div>
                <form action="DangNhapController" method="get" role="form">
                    <div class="form-group">
                        <label >Đăng nhập</label>
                        <input  type="text" class="form-control" value="<%=txtUser!=null?txtUser:"" %>" required="required" name="txtUser" placeholder="Tên Đăng nhập...">
                        <label >Mật khẩu</label>
                        <input type="password" required="required" value="<%=txtPass!=null?txtPass: ""%>" class="form-control"  name="txtPass"  placeholder="Mật khẩu...">
                    </div>
                    <button type="submit" name="btn" value=1 style="width: 100%" class="btn btn-success">Submit</button>
               		<label>
               		<input type="checkbox" checked="checked" name="remember"> Remember me
               		</label>
               		
               		<h5> <b>didn't have account?</b>
               			<a href="DangKyController">Đăng ký</a>
               		</h5>
               		
               	
                </form>
                
                <%if(request.getAttribute("message")!=null){ %>
                <h5><%= request.getAttribute("message")%></h5>
                <%} %>
            </div>
          
        </div>
        
    </div>
    
		</div>



	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>