package bblog;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class blog
 */
@WebServlet("/blog")
public class blog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //String s=(String)request.getAttribute("Name");
        String email = request.getParameter("blog");
        String pass = request.getParameter("content");
        System.out.println(email + pass);
        HttpSession sess= request.getSession(false);
        String s=(String)sess.getAttribute("Name1");
        System.out.println(s);
        try{
        	
            Class.forName("com.mysql.jdbc.Driver");

    	 
            Connection con=DriverManager.getConnection
                           ("jdbc:mysql://localhost:3306/movierating","root","aviformat");
           
			
            
            PreparedStatement ps = con.prepareStatement("insert into blog1 values(?,?,?) ");
       
            
            
            
           ps.setString(1, email);
          ps.setString(2, pass);
          ps.setString(3, s);
            
            
          int i = ps.executeUpdate();
       
          
         }catch(Exception e)
         {
             e.printStackTrace();
         }
        //user u=user.SetDetails(email);
        /*if(Validate.checkUser(email, pass))
        {
        	out.println("LoggedIn");
        	if(email.equals("Admin")){
        		
        	}
        	else{
        		
        		HttpSession sess = request.getSession(); 
    			sess.setAttribute("use",u);
            RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
            //use false to use the existing session
			//this will return username anytime in the session
			
            request.setAttribute("use", u);
            request.setAttribute("Name", email);
            rs.forward(request, response);
        	}
        }
        else
        {
           out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
           rs.include(request, response);
        }*/
        RequestDispatcher rs = request.getRequestDispatcher("index1.jsp");
        request.setAttribute("Name",s);
        request.setAttribute("blog1", email);
        request.setAttribute("blog", pass);
        rs.forward(request, response);
        
	}

}
