package com.carter.abstractFactory;

//concrete implementation of factory
public class MacbookFactory implements ComputerFactory{

	CompModel model;
	int ram, storage;
	
	public MacbookFactory(CompModel model, int ram, int storage) {
		this.model= model;
		this.ram =ram;
		this.storage = storage;
	}
	public void produce() {
		switch(model) {
		case SuperBook:
			MacbookAir computer = new MacbookAir();
			computer.produce(ram, storage);
			break;
		case PowerPC:
			MacbookPro computer2 = new MacbookPro();
			computer2.produce(ram, storage);
			break;
		default:
			System.out.println("Unidentified model");
			break;
		}

	}
	
}
