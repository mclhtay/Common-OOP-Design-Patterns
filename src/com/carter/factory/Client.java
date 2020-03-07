package com.carter.factory;

public class Client {

	public static void main(String[] args) {
		MagicalComputerFactory [] computerFactory = new MagicalComputerFactory [2];
		computerFactory[0] = new MacbookCreator();
		computerFactory[1]  = new WindowsPcCreator();
		
		for(MagicalComputerFactory f : computerFactory) {
			Computer c = f.produce();
			System.out.println("Produced a magical computer");
		}

	}

}
