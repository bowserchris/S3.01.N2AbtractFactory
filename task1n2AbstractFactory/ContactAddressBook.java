package task1n2AbstractFactory;

public abstract class ContactAddressBook {		//abstract ordering form
	
	protected abstract ContactDetail makeContact(String typeOfContact, String country);		//abstract method to implement in contactdetailbuilding options
	
	public ContactDetail createContact(String typeOfContact, String country) {		//own method with parameter to call above abstract method & return superclass object Contact Detail
		ContactDetail contact = makeContact(typeOfContact, country);
		//other methods of contactdetail object to be displayed here?
		return contact;
	}
}
