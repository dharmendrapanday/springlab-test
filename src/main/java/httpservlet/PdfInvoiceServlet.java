package httpservlet;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

	
public class PdfInvoiceServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/json; charset=UTF-8");
		resp.getWriter().print("[]");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) {

		String userId = req.getParameter("user_id");
		String amount = req.getParameter("amount");

	}
}
