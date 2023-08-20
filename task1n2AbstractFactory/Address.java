package task1n2AbstractFactory;

import task1n2AbstractFactory.factory.AddressFactory;
import task1n2AbstractFactory.interfaces.AddressCity;
import task1n2AbstractFactory.interfaces.AddressCountry;
import task1n2AbstractFactory.interfaces.AddressProvince;
import task1n2AbstractFactory.interfaces.AddressZipCode;

public class Address extends ContactDetail {		//address object to create address, extends contact detail which containsn the phonefactory and address factory
	
	AddressFactory contactFactory;
	AddressCountry country;
	AddressProvince province;
	AddressCity city;
	AddressZipCode zipCode;
	
	public Address(AddressFactory contactFactory) {
		this.contactFactory = contactFactory;
	}
	
	@Override
	public void makeContact() {
		country = contactFactory.addCountry();
		province = contactFactory.addProvince();
		city = contactFactory.addCity();
		zipCode = contactFactory.addZipCode();
	}
	
	@Override
	public String toString() {
		return "The address details for " + getName() + " are: Country: " + 
				country + ", Province: " + province + ", City: " + city + ", ZipCode: " 
				+ zipCode + ".";
	}


}
