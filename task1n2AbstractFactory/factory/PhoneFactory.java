package task1n2AbstractFactory.factory;

import task1n2AbstractFactory.interfaces.PhoneCode;
import task1n2AbstractFactory.interfaces.PhoneNumber;

public interface PhoneFactory {		//interface to implement methods necessary to create the fields for a phone object
	
	public PhoneCode addCode();
	public PhoneNumber addNumber();
	
}
