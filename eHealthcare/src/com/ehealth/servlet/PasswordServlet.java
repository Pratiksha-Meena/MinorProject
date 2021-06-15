package com.ehealth.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ehealth.service.impl.UserService2;

/**
 * Servlet implementation class PasswordServlet
 */
@WebServlet("/password.do")
public class PasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		
		UserService2 us=new UserService2();
		String password = us.getPassword(email);
		System.out.println(password);
		request.setAttribute("PWD", password);
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request,response);
	}

}
