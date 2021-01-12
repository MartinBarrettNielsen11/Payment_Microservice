package resource;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Payment;


@Path("/payment")
public class PaymentResource {
	Payment payment = new Payment(02, "cid", "mid", 10);
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getPayment() {
	    return payment.getAllPayment();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String createPayment() {
		return "create payment";
	}
		
	@GET
	@Path("{id}")
	public String getPaymentByID(@PathParam("id") int id) {
		return "return information of payment id " + id;
	}
	
}
