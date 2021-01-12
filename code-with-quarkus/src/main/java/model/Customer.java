package model;

public class Customer {
	private String firstName;
	private String lastName;
	private String cprNumber;
	public Customer() {}

	public Customer(String firstName, String lastName,String cprNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.cprNumber=cprNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCprNumber() {
		return cprNumber;
	}

	public void setCprNumber(String cprNumber) {
		this.cprNumber = cprNumber;
	}

}
