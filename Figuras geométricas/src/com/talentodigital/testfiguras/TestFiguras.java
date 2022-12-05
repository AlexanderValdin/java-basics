package com.talentodigital.testfiguras;
import com.talentodigital.figuras.*;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo = new Circulo(2);
		System.out.println("El �rea del c�rculo es " + circulo.getArea());
		
		Cuadrado cuadrado = new Cuadrado(3);
		System.out.println("El �rea del cuadrado es" + cuadrado.getArea());
		
		Rectangulo rectangulo = new Rectangulo(4,5);
		System.out.println("El �rea del rect�ngulo es " + rectangulo.getArea());
		
		System.out.println("El �rea total es " + Figuras.areaTotal);
		
		Circulo circ1 = new Circulo(3);
		Circulo circ2 = new Circulo(1);
		
		System.out.println("El �rea de todos los c�rculos es " + Circulo.areaTotalCirc);
		
	}

}
