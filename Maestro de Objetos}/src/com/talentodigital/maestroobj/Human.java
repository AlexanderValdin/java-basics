package com.talentodigital.maestroobj;

public class Human {
	public int strength;
	public int intelligence;
	public int stealth;
	public int health;
	
	// valores predeterminados 
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	public Human attack (Human atacado) {
		atacado.health -= this.strength;
		return this;
	}
	public void displayHealth() {
		System.out.println(this.health);
	}
	
}	


