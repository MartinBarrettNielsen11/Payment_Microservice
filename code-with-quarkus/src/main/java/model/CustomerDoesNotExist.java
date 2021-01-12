package model;

public class CustomerDoesNotExist extends Exception {
	public CustomerDoesNotExist(String cprNumber){
        super("Customer Not Found. Recieved " + cprNumber + ".");
    }

}
