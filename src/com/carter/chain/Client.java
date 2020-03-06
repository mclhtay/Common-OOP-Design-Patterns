package com.carter.chain;

public class Client {

	public static void main(String [] args) {
		Handler h1 = new USDHandler(), h2 = new CADHandler(), h3 = new EURHandler();
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		Currency [] currencies = {new Currency("CAD"), new Currency( "USD"), new Currency( "CNY"), new Currency( "JPY"), new Currency("EUR"), new Currency( "USD")};
		for(Currency s : currencies) h1.handle(s);
	}
}
