package com.carter.abstractFactory;

public class Client {
	static ComputerFactory factory;
	public static void main (String [] args) {

		//assume client  wants a power macbook
		CompType type = CompType.Mac;
		CompModel model = CompModel.PowerPC;
		int ram = 64, storage = 512;

		switch(type) {
		
		case Mac:
			factory = new MacbookFactory(model, ram, storage);
			break;
		case Windows:
			factory = new WindowsFactory(model, ram, storage);
			break;
		default:
			break;
		}
		factory.produce();

	}
}
