package com.carter.facade;

public class Client {

	public static void main(String [] args) {
		HotelManager hm = new HotelManager();
		System.out.println(hm.vegM().item);
		System.out.println(hm.nonVegM().item);
		System.out.println(hm.meatM().item);
	}
}
