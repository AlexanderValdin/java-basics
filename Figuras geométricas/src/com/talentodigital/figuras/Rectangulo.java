package com.talentodigital.figuras;

public class Rectangulo extends Figuras{
	
	public static double areaTotalRect;

	public Rectangulo(double ladoa, double ladob) {
		this.setArea(ladoa*ladob);
		this.setPerimetro(2*(ladoa + ladob));
		
		areaTotalRect += this.getArea();
		areaTotal += this.getArea();
	}
}
