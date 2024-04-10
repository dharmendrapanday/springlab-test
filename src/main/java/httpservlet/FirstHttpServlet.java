package httpservlet;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstHttpServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html; charset=UTF-8");
		resp.getWriter().print("<html><body><h1>Hello World</h1><p>This is my very first, embedded Tomcat, HTML Page!</p></body></html>");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) {

	}

}
