package in.ineuron.main;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Disp")
public class ReqDisp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("userName");
		String userPassword=request.getParameter("userPassword");
				
		PrintWriter out =response.getWriter();
		out.println("<h1 style=color:green;> WELCOME BACK TO FIRST SERVLET</h1>");
		if(userName.equals("hyder") && userPassword.equals("javalover"))
		{
			RequestDispatcher reqDisp=request.getRequestDispatcher("/home.jsp");
			reqDisp.forward(request, response);
		}
		else
		{
		   ServletContext servContext=request.getServletContext();
		   RequestDispatcher reqDisp=servContext.getRequestDispatcher("/error.jsp");
		   reqDisp.include(request, response);
		}
	}
}
