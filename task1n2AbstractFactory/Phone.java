package task1n2AbstractFactory;

import task1n2AbstractFactory.factory.PhoneFactory;
import task1n2AbstractFactory.interfaces.PhoneCode;
import task1n2AbstractFactory.interfaces.PhoneNumber;

public class Phone extends ContactDetail {		//phoneobject which extends contactdetail object that contains the makecontact() method and phonefactory field
	
	PhoneCode code;
	PhoneNumber number;
	PhoneFactory contactFactory;
	
	public Phone(PhoneFactory contactFactory) {
		this.contactFactory = contactFactory;
	}
	
	public void makeContact() {
		code = contactFactory.addCode();
		number = contactFactory.addNumber();
	}

	@Override
	public String toString() {
		return "The full phone number for " + getName() + " is " + code + number + ".";
	}

}
