package com.talentodigital.testfiguras;
import com.talentodigital.figuras.*;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo = new Circulo(2);
		System.out.println("El área del círculo es " + circulo.getArea());
		
		Cuadrado cuadrado = new Cuadrado(3);
		System.out.println("El área del cuadrado es" + cuadrado.getArea());
		
		Rectangulo rectangulo = new Rectangulo(4,5);
		System.out.println("El área del rectángulo es " + rectangulo.getArea());
		
		System.out.println("El área total es " + Figuras.areaTotal);
		
		Circulo circ1 = new Circulo(3);
		Circulo circ2 = new Circulo(1);
		
		System.out.println("El área de todos los círculos es " + Circulo.areaTotalCirc);
		
	}

}
