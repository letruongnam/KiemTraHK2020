package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.DangNhapBEAN;
import bo.DangNhapBO;

/**
 * Servlet implementation class DangNhapController
 */
@WebServlet("/DangNhapController")
public class DangNhapController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangNhapController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DangNhapBO dangNhapBO = new DangNhapBO();
		ArrayList<DangNhapBEAN> dangNhap = new ArrayList<>();
		String txtUser = request.getParameter("txtUser");
		String txtPass = request.getParameter("txtPass");
		HttpSession session = request.getSession();
		int check = 0;
		try {
			dangNhap = dangNhapBO.getDangNhap();
			for(DangNhapBEAN item: dangNhap) {
				if(item.getUser().equals(txtUser) && item.getPass().equals(txtPass)) {
					session.setAttribute("txtUser", txtUser);
					session.setAttribute("txtPass", txtPass);
					session.setAttribute("Name", item.getName());
					check=1;
					response.sendRedirect("ThemBacSi");
	
				}
			}
			if(check==0 && request.getParameter("btn")!=null)
			request.setAttribute("message", "Sai tên đăng nhập hoặc mật khẩu");
			RequestDispatcher rd = request.getRequestDispatcher("DangNhap.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
