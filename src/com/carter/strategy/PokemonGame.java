package com.carter.strategy;

public class PokemonGame {

	public static void main(String [] args) {
		SuperMove thunderbolt = new ThunderBolt();
		SuperSupportMove taunt = new Taunt();
		Pokemon pikachu = new Pikachu(thunderbolt, taunt);
		
		pikachu.defaultMove();
		pikachu.defaultSupportMove();
		pikachu.superMove();
		pikachu.superSupportMove();
		pikachu.setSuperMove(new FireBlast());
		pikachu.setSuperSupportMove(new SwordDance());
		
		pikachu.superMove();
		pikachu.superSupportMove();
	}
}
