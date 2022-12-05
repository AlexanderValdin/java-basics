package com.codingdojo.guardiazoo;

public class Bat extends Mammal{
	public Bat() {
		this.energyLevel = 300;
	}
	public Bat fly() {
		System.out.println("El murciélago emite un sonido peculiar al despegar: El murciélago pierde 50 de energía");
		this.energyLevel -= 50;
		return this;
	}
	public Bat eatHumans() {
		System.out.println("Bueno, no importa.");
		this.energyLevel += 25;
		return this;
	}
	public Bat attackTown() {
		System.out.println("El murciélago gigante ataca la ciudad y se esta se envuelve en llamas y en los gritos de la gente. El murciélago pierde 100 de energía");
		this.energyLevel -= 100;
		return this;
	}
}
