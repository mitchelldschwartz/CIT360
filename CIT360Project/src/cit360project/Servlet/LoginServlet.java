package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("username is: " + username);
		System.out.println("password is: " + password);

		String languages[] = request.getParameterValues("language");
		String langHtml = "";
		
		if (languages != null) {
			System.out.println("Languages are: ");
			for (String lang : languages) {
				langHtml += lang + ",";
				System.out.println("\t" + lang);
			}
		}
		
		
		PrintWriter writer = response.getWriter();
		// form fields
		String htmlRespone = "<html><h3>";
		htmlRespone += "username is: " + username + "<br/>";		
		htmlRespone += "password is: " + password + "<br/>";		
		htmlRespone += "</h3></html>";
		
		// return response
		writer.println(htmlRespone);		
	}

}
 
