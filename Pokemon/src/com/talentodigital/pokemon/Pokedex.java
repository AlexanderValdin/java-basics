package com.talentodigital.pokemon;

import java.util.*;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	
	public static int myPokemons;

	@Override
	public Pokemon createPokemon(String name, String type, int health) {
		myPokemons++;
		return new Pokemon(name, type, health);
	}
		
	public void listPokemon() {
		ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
		pokemons.add(new Pokemon());
		
	}
	

}
