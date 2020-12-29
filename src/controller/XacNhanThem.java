package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.BacSiBO;

/**
 * Servlet implementation class XacNhanThem
 */
@WebServlet("/XacNhanThem")
public class XacNhanThem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XacNhanThem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String DoctorID = request.getParameter("DoctorID");
		String DoctorName = request.getParameter("DoctorName");
		String Address = request.getParameter("Address");
		String PhoneNumber = request.getParameter("PhoneNumber");
		String btn = request.getParameter("btn");
		try {
			
				
				if(btn!=null) {
					BacSiBO bacSiBO = new BacSiBO();
					if(bacSiBO.ThemBacSi(DoctorID, DoctorName, Address, PhoneNumber)==1)
						response.sendRedirect("BacSiController");;
				}
				
				RequestDispatcher rd = request.getRequestDispatcher("ThemBacSi.jsp");
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
