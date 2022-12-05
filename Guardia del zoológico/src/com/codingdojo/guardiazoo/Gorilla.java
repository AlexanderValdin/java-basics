package com.codingdojo.guardiazoo;

public class Gorilla extends Mammal{
	public Gorilla throwSomething() {
		System.out.println("El gorila ha lanzado algo y ha perdido 5 de energ�a");
		this.energyLevel -= 5;
		return this;
	}
	public Gorilla eatBananas() {
		System.out.println("El gorila est� muy satisfecho al comer bananas y gana 10 de energ�a.");
		this.energyLevel += 10;
		return this;
	}
	public Gorilla climb() {
		System.out.println("El gorila ha trepado a la cima de un �rbol y ha perdido 10 de energ�a.");
		this.energyLevel -= 10;
		return this;
	}
}
