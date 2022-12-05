package com.talentodigital.figuras;

public class Circulo extends Figuras{
	
	public static double areaTotalCirc;
	
	public Circulo(double radio) {
		this.setArea(Math.PI*(Math.pow(radio, 2)));
		this.setPerimetro(2*Math.PI*radio);
		
		areaTotalCirc += this.getArea();
		areaTotal += this.getArea();
	}

}
