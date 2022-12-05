package com.talentodigital.pokemon;

public class Pokemon {
	
	private String name;
	private int health;
	private String type;
	
	static int contador = 0;
	
	// getters
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getType() {
		return type;
	}
	
	// setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	//constructor
	
	public Pokemon(String name, String type, int health) {
		setName(name);
		setType(type);
		setHealth(health);
		contador++;
	}
	
	public void attackPokemon(Pokemon pokAttacked) {
		pokAttacked.setHealth(-10);
	}
}
