package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import model.LoginCredential;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//  retrieve data from form
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");


		LoginCredential loginObj=new LoginCredential();

		loginObj.setUsername(uname);
		loginObj.setPassword(pwd);

		if(loginObj.checkLogin())
		{
			request.setAttribute("uname", uname);  

			RequestDispatcher dis=request.getRequestDispatcher("Success.jsp");
			dis.forward(request, response);
		}
		else
		{
			RequestDispatcher dis=request.getRequestDispatcher("Failure.jsp");
			dis.forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
