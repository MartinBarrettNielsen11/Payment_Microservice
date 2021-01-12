package service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import model.Customer;

public class CustomerDataHandler {
    private static final CustomerDataHandler data = new CustomerDataHandler();
    private HashMap<String, Customer> allCustomers;
    public static CustomerDataHandler getInstance(){
        return data;
    }
    
    public CustomerDataHandler() {
    	allCustomers = new HashMap<String, Customer>();
        Customer initalCustomer1 = new Customer("Alice","Wang","911110-9482");
        Customer initalCustomer2 = new Customer("Bob","Li","921218-7422");
        allCustomers.put(initalCustomer1.getCprNumber(),initalCustomer1);
        allCustomers.put(initalCustomer2.getCprNumber(),initalCustomer2);
        
    }
    public void addCustomer(Customer customer) {
    	allCustomers.put(customer.getCprNumber(), customer);
    }
    public Customer getCustomer(String cprNumber) {
    	Customer customer = allCustomers.get(cprNumber);
        if (customer == null){
            return null;
        	//throw new CustomerNotFoundException(cprNumber);
        } else
        	return customer;
    }
    public String getAllCustomers() {
    	Iterator iter1=allCustomers.entrySet().iterator();
    	System.out.println("allCustomers.size: "+allCustomers.size());
    	String result="";
        while(iter1.hasNext()){
            Map.Entry<String,Customer> entry=(Map.Entry<String,Customer>)iter1.next();
            System.out.println("Item: "+entry.getKey());
           
            result += entry.getValue().getFirstName()+ " " + 
            		entry.getValue().getLastName()+ " " + entry.getValue().getCprNumber() + "\n";
 
        }
    	return result;
    }

}
