package task1n2AbstractFactory;

import task1n2AbstractFactory.factory.AddressFactory;
import task1n2AbstractFactory.factory.PhoneFactory;

public abstract class ContactDetail {		//contact detail object, which is superclass to phone and address, contains factory interfaces for both objects to create and assign the relevant fields at creation.

	private String name;
	
	PhoneFactory phone;
	AddressFactory address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void makeContact();
	
	public String toString() {
		return "The name of the contact is: " + name + ".\n" +
				"Their phone details are: " + phone + ".\n" +
				"Their address details are: " + address + ".\n";
	}
}
