package cit360.spring2017.servlets_example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/ServletExample")
public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletExample() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<html><body>");
		out.print("<h3>This is my first servlet example.</h3>");
		out.print("</body></html>");
		
		System.out.println("Hello, this is my first servlet example!"); //it will print in Console
	}

}