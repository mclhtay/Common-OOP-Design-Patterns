package com.carter.visitor;
//our purpose to calculate to cost of visiting all the shops
public class Client {

	public static void main(String [] args) {
		int cost = 0;
		Shop [] luxuryBrandItems = new Shop [] {
				new Chanel("Medium Quilted Boy Flap Bag", 5500), new Chanel("Small Quilted Boy Flap Bag", 4600), new LV("Monogram Canvas Speedy Bandouliere 40 Bag", 1490)
		};
		
		GirlFriend gf = new GirlFriend();
		for(Shop s: luxuryBrandItems) {
			cost += s.accept(gf);
		}
		System.out.println("Total cost of the trip is: $"+cost);
	}
}
