package servletexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String welcomeMessage = "Hello, " + name + "!";

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<h1>" + welcomeMessage + "</h1>");
		out.println("<a href=/servletexample/pages/form.html>"+"Click here to go back to input page "+"</a>");
		out.close();
	}

	public void destroy() {

	}
}
