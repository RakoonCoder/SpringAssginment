package capegemini.SpringCore.springCoreQ1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class customer {
	int customerId;
	String customerName;
	long customerContact;
	
	@Autowired
	address customerAddress;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	public address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public address adShow(){
		address a1= new address();
		a1.setStreet("KN");
		a1.setState("As");
		a1.setZip(781006);
		a1.setCountry("India");
		
		return a1;
	}
}
