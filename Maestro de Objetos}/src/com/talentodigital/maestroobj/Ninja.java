package com.talentodigital.maestroobj;

public class Ninja extends Human {
	
	public Ninja() {
		this.stealth = 10;
	}
	public Ninja steal(Human atacado) {
		atacado.health -= this.stealth;
		this.health += this.stealth;
		return this;
	}
	public Ninja runnAway() {
		this.health -= 10;
		return this;
	}
}

