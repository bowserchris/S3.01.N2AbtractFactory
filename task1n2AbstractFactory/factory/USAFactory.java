package task1n2AbstractFactory.factory;

import task1n2AbstractFactory.fieldobjects.USANumber;
import task1n2AbstractFactory.fieldobjects.USAPhoneCode;
import task1n2AbstractFactory.interfaces.PhoneCode;
import task1n2AbstractFactory.interfaces.PhoneNumber;

public class USAFactory implements PhoneFactory { //me falta crear objetos de direcciones pero llevo mucho tiempo con esto y queria acabar xD aqui tengo para telefono y puedo expandir para direciones si hace falta. 

	@Override
	public PhoneCode addCode() {
		return new USAPhoneCode();
	}

	@Override
	public PhoneNumber addNumber() {
		return new USANumber();
	}

}
