package com.talentodigital.maestroobj;

public class Samurai extends Human {
	
	public Samurai() {
		this.health = 200;
	}
	public Samurai deathBlow(Human atacado) {
		atacado.health = 0;
		this.health -= this.health/2;
		return this;
	}
	public Samurai meditate() {
		this.health += this.health/2;
		return this;
	}
}
