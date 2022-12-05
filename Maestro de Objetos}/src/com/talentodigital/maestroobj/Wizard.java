package com.talentodigital.maestroobj;

public class Wizard extends Human {
	
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	
	}
	
	public Wizard heal(Human curado) {
		curado.health += this.intelligence;
		return this;
	}
	public Wizard fireBall(Human quemado) {
		quemado.health -= this.intelligence*3 ;
		return this;
	}
}