package com.talentodigital.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	
	public Pokemon createPokemon(String name, String type, int health) {
		return new Pokemon(name, type, health);
		
	}
	 public String pokemonInfo(Pokemon pokemon) {
		return pokemon.getName() + "es un pokemon de tipo " + pokemon.getType() + " y posee " + String.valueOf(pokemon.getHealth()) + " de HP.";
	 }
}
