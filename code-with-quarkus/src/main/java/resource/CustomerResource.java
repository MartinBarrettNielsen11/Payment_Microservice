package resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.Customer;
import model.CustomerDoesNotExist;
import service.CustomerService;


@Path("/customer")
public class CustomerResource {
	CustomerService cs = new CustomerService();
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllCustomers() {
		return cs.getAllCustomers();
		
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addCustomer(Customer customer) {
        //System.out.println("Call post: " + customer.getFirstName()+" "+customer.getLastName()+", "+customer.getCprNumber());
		
		cs.addCustomer(customer);
		return Response.ok().build();
		
	}
	@GET
	@Path("{cprNumber}")
	public Customer getCustomerByCpr(@PathParam("cprNumber") String cprNumber) throws CustomerDoesNotExist {
		return cs.getCustomer(cprNumber);

	}
	
	

	
}
