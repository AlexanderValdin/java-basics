package com.talentodigital.pokemon;

public class PokemonTest extends Pokedex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokedex pokedex = new Pokedex();
		Pokemon poke1 = new Pokemon("Poke1", "Agua", 500);
		Pokemon poke2 = new Pokemon("Poke2", "Fuego", 400);
		
		poke1.attackPokemon(poke2);
		
		
	}

}
