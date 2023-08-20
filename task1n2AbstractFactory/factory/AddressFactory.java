package task1n2AbstractFactory.factory;

import task1n2AbstractFactory.interfaces.AddressCity;
import task1n2AbstractFactory.interfaces.AddressCountry;
import task1n2AbstractFactory.interfaces.AddressProvince;
import task1n2AbstractFactory.interfaces.AddressZipCode;

public interface AddressFactory {		//interface for addresses to implement methods and create the fields necessary for an address object

	public AddressCountry addCountry();
	public AddressProvince addProvince();
	public AddressCity addCity();
	public AddressZipCode addZipCode();
	
}
