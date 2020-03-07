package com.carter.abstractFactory;
//concrete implementation of factory
public class WindowsFactory implements ComputerFactory{

	CompModel model;
	int ram, storage;
	
	public WindowsFactory(CompModel model, int ram, int storage) {
		this.model = model;
		this.ram= ram;
		this.storage = storage;
	}
	
	public void produce() {
		switch(model) {
		case SuperBook:
			AcerSwift computer = new AcerSwift();
			computer.produce(ram, storage);
			break;
		case PowerPC:
			RazerBlade computer2 = new RazerBlade();
			computer2.produce(ram, storage);
			break;
		default:
			System.out.println("Unidentified model");
			break;
		}

	}
}
