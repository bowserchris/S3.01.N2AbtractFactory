package task1n2AbstractFactory;		//reference: https://youtu.be/QNpwWkdFvgQ

import java.util.Scanner;

import task1n2AbstractFactory.factory.ContactDetailBuilding;

public class Main {

	public static void main(String[] args) {		//generica start main method
		
		start();

	}
	
	static String inputString(String message) {				//request a string input
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		return input.nextLine();
	}
	
	static void start() {
		
		boolean exit = false;
		String userInput;
		
		do {

			userInput = inputString("Would  you like to create a phone(1), address(2) or exit(3)?");		//determined path to demonstrate abstract factory possibilites between phone and address.

			switch(userInput) {
			case "1":
				ContactAddressBook contact = new ContactDetailBuilding();		//creates the contactdetailbuilding abstract factory which then delegates between different options, here a phone
				ContactDetail detail = contact.createContact("phone", inputString("What country phone do you wish to create? Spain or USA?"));	//here then specifies between what type of phone option.
				System.out.println(detail);
				break;
			case "2":
				ContactAddressBook contact2 = new ContactDetailBuilding();		//same as above, but not enough variety of addresses (though those can be created)
				ContactDetail detail2 = contact2.createContact("address", inputString("Press enter again.(no other country exists for addresses)"));
				System.out.println(detail2);
				break;
			case "3":
				exit = true;
				break;
			default:
				System.out.println("Try again:");
			}

		} while (!exit);
		
		System.out.println("Program Terminated.");

	}

}
