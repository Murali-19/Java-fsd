package practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession httpSession = request.getSession(false);
	    if (httpSession != null) {
	      String uname = (String) httpSession.getAttribute("username");
	      out.println("Welcome " + uname + " to your profile");
	    } else {
	      out.println("Please Login First");
	      RequestDispatcher dispatcher1 = request.getRequestDispatcher("loginpage.html");
	      dispatcher1.include(request, response);
	    }
	}
}
