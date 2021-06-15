package com.ehealth.servlet;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ehealth.util.EhealthUtil;

/**
 * Servlet implementation class RegistrationServlet2
 */
@WebServlet("/register.do")
public class RegistrationServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("fname");
	    String lastName = request.getParameter("lname");
	    String email = request.getParameter("email");
	    String state = request.getParameter("state");
	    String city = request.getParameter("city");
	    String gender = request.getParameter("gender");
	    String pwd = request.getParameter("pwd1");
	    String confirmPwd = request.getParameter("pwd2");
	    
	    final String sql = "insert into Registration values(?,?,?,?,?,?,?,?)";
	    try (Connection con = EhealthUtil.getMySqlConnection(); PreparedStatement ps= con.prepareStatement(sql)){
	    	ps.setString(1,firstName);
	    	ps.setString(2, lastName);
	    	ps.setString(3, email);
	    	ps.setString(4, state);
	    	ps.setString(5, city);
	    	ps.setString(6, gender);
	    	ps.setString(7, pwd);
	    	ps.setString(8, confirmPwd);
	    	int count = ps.executeUpdate();
	    	if (count > 0) {
	    		System.out.println("record inserted");
	    	} else {
	    		System.out.println("record not inserted");
	    	}
	    	
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     RequestDispatcher rd = request.getRequestDispatcher("home2.jsp");
		    rd.forward(request, response);
	}

}
