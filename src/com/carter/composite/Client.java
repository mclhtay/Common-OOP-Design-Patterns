package com.carter.composite;

public class Client {

	public static void main(String [] args) {
		Champion ashe = new ADC("Ashe");
		Champion jhin = new ADC("Jhin");
		Champion yuumi = new Support("Yuumi");
		Champion leona  = new Support("Leona");
		
		Category ADCs = new Category();
		ADCs.addChamp(ashe);
		ADCs.addChamp(jhin);
		
		Category Supports = new Category();
		Supports.addChamp(yuumi);
		Supports.addChamp(leona);
		
		Category BotLanePairs = new Category();
		BotLanePairs.addChamp(ADCs);
		BotLanePairs.addChamp(Supports);
		
		BotLanePairs.showChamp();
	}
}
