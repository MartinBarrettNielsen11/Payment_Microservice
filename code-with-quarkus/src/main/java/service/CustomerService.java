package service;

import java.util.Map;

import model.Customer;

public class CustomerService {
	private CustomerDataHandler data;
    private Customer customer;

	public CustomerService() {
		data = CustomerDataHandler.getInstance();
		
	}
	
	public void addCustomer(Customer customer) {
		System.out.println("Add customer: " +customer.getFirstName() + " " + customer.getLastName() + " " + customer.getCprNumber());
//        customer = new Customer(firstName, lastName, cprNumber);
        data.addCustomer(customer);
	}
	public Customer getCustomer(String cprNumber) {
		return data.getCustomer(cprNumber);
	}
	public String getAllCustomers() {
		return data.getAllCustomers();
		

	}

}
