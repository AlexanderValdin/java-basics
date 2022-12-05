package com.talentodigital.figuras;

public class Cuadrado extends Figuras{
	
	public static double areaTotalCuad;
	
	public Cuadrado(double lado) {
		this.setArea(Math.pow(lado,2));
		this.setPerimetro(4*lado);
		
		areaTotalCuad += this.getArea();
		areaTotal += this.getArea();
	}
}
