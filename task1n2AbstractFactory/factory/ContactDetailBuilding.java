package task1n2AbstractFactory.factory;

import task1n2AbstractFactory.Address;
import task1n2AbstractFactory.ContactAddressBook;
import task1n2AbstractFactory.ContactDetail;
import task1n2AbstractFactory.Phone;

public class ContactDetailBuilding extends ContactAddressBook {			//abstract factory that processes the input on what object to create, phone or address, and then calls the relevant factory (phone or address factory) afterwards further optioins can be implemented on what specific country format is required (and further parameters can be included to know which type is needed and implemented)

	@Override
	protected ContactDetail makeContact(String typeOfContact, String country) {
		ContactDetail contact = null;
		
		if ("phone".equalsIgnoreCase(typeOfContact)) {
			if (country.equalsIgnoreCase("spain")) {
				PhoneFactory phoneDetails = new SpainFactory();
				contact = new Phone(phoneDetails);
				contact.makeContact();
				contact.setName("A Spanish Number");	
			} else if (country.equalsIgnoreCase("usa")) {
				PhoneFactory phoneDetails = new USAFactory();
				contact = new Phone(phoneDetails);
				contact.makeContact();
				contact.setName("A USA Number");
			}
		}else if ("address".equalsIgnoreCase(typeOfContact)) {
			AddressFactory details = new SpainFactory();
			contact = new Address(details);
			contact.makeContact();
			contact.setName("An Address");
		}
		return contact;
	}
	
	

}
/*
 * @Override
	protected ContactDetail makeContact(String typeOfContact) {
		if ("phone".equalsIgnoreCase(typeOfContact)) {
			@Override
			public Phone createPhone(String code, String number) {
				return null;
			}
		} else if ("address".equalsIgnoreCase(typeOfContact)) {
			@Override
			public Address createAddress(String country, String province, String city, String zipCode) {
				return null;
			}
			
		}
		return ;
	}

 * 
 * 
 */

