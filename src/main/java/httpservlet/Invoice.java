package httpservlet;

import java.util.UUID;

public record Invoice(String id, String userId, String amount, String pdfUrl) {
	public Invoice {
		id = UUID.randomUUID().toString();
		pdfUrl = "http://www.africau.edu/images/default/sample.pdf";
	}
}
