package com.talentodigital.maestroobj;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human();
		Human human2 = new Human();
		
		//el human1 ataca 2 veces a human1 y 1 vez a sí mismo.
		human1.attack(human2).attack(human2).attack(human1);
		
		//mostrar Health de human1 y human2
		human1.displayHealth();
		human2.displayHealth();
		}

}
