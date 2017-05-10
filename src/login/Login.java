package login;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;@
WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("username");
        String pass = request.getParameter("password");
        System.out.println(email + pass);
        
        if(Validate.checkUser(email, pass))
        {
        	out.println("LoggedIn");
        	if(email.equals("Admin")){
        		
        	}
        	else{
            RequestDispatcher rs = request.getRequestDispatcher("afterLogin.jsp");
            HttpSession sess=request.getSession();
            sess.setAttribute("Name1",email);
            request.setAttribute("Name", email);
            rs.forward(request, response);
        	}
        }
        else
        {
           out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
           rs.include(request, response);
        }
    } 


}
