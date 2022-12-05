package com.talentodigital.maestroobj;

public class SubclasesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Samurai sam = new Samurai();
		Ninja nin = new Ninja();
		Wizard wiz = new Wizard();
		
		sam.deathBlow(nin).meditate();
		nin.displayHealth();
		sam.displayHealth();
		wiz.heal(nin).fireBall(sam).attack(sam);
		nin.steal(sam).runnAway();
		wiz.displayHealth();
		sam.displayHealth();
		nin.displayHealth();
	}
}
