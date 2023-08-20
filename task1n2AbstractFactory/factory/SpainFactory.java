package task1n2AbstractFactory.factory;

import task1n2AbstractFactory.fieldobjects.SpainCity;
import task1n2AbstractFactory.fieldobjects.SpainCountry;
import task1n2AbstractFactory.fieldobjects.SpainNumber;
import task1n2AbstractFactory.fieldobjects.SpainPhoneCode;
import task1n2AbstractFactory.fieldobjects.SpainProvince;
import task1n2AbstractFactory.fieldobjects.SpainZipCode;
import task1n2AbstractFactory.interfaces.AddressCity;
import task1n2AbstractFactory.interfaces.AddressCountry;
import task1n2AbstractFactory.interfaces.AddressProvince;
import task1n2AbstractFactory.interfaces.AddressZipCode;
import task1n2AbstractFactory.interfaces.PhoneCode;
import task1n2AbstractFactory.interfaces.PhoneNumber;

public class SpainFactory implements PhoneFactory, AddressFactory{		//the very specific fields methods needed to create the relevant information for a spaincontactdetail. here creates specific spain objects that call the relevant interfaces which pull the relevant objects for those fields. 

	@Override
	public PhoneCode addCode() {
		return new SpainPhoneCode();
	}

	@Override
	public PhoneNumber addNumber() {
		return new SpainNumber();
	}

	@Override
	public AddressCountry addCountry() {
		return new SpainCountry();
	}

	@Override
	public AddressProvince addProvince() {
		return new SpainProvince();
	}

	@Override
	public AddressCity addCity() {
		return new SpainCity();
	}

	@Override
	public AddressZipCode addZipCode() {
		return new SpainZipCode();
	}

}
