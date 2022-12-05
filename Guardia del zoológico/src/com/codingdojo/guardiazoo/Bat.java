package com.codingdojo.guardiazoo;

public class Bat extends Mammal{
	public Bat() {
		this.energyLevel = 300;
	}
	public Bat fly() {
		System.out.println("El murci�lago emite un sonido peculiar al despegar: El murci�lago pierde 50 de energ�a");
		this.energyLevel -= 50;
		return this;
	}
	public Bat eatHumans() {
		System.out.println("Bueno, no importa.");
		this.energyLevel += 25;
		return this;
	}
	public Bat attackTown() {
		System.out.println("El murci�lago gigante ataca la ciudad y se esta se envuelve en llamas y en los gritos de la gente. El murci�lago pierde 100 de energ�a");
		this.energyLevel -= 100;
		return this;
	}
}
