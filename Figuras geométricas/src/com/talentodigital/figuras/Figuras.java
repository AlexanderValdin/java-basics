package com.talentodigital.figuras;

public class Figuras {
	
	private double area;
	private double perimetro;
	public static double areaTotal;
	
	// getter y setter
	
	public void setArea(double area) {
		this.area = area;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public double getArea() {
		return area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	
}



/*	Diseño de una jerarquia de clases para las figuras Geométricas que se ubique dentro del paquete figura
Comienza creando una clase Figura , que debe tener como atributos privador área y périmetro
.Esta clase tendrá también métodos que permitan tanto establecer como recuperar el área y perímetro.
Crea después las clases hijas Rectangulo,Cuadrado y Circulo , en tres ficheros independientes,formando tambien parte del paquete figura.
 Estas clases tienes que definir sus constructores para que , recibiendo la longitud de dos lados , la de un lado , y la del radio respectivamente ,
 se calcule de forma automatica el area y el perimetro
Cada clase tiene que tener un atributo de clase areaTotal que almacene el total de área de todas las figuras creadas de esa clase .
 El atritbuto de clase areaTotal de la clase Figura sumará las áreas totales de todas las intstancias de sus subclases
Crea una nueva clase TestFigura (que este en otro paquete ) , cuyo método main haga lo siguiente :Crea un circulo de radio 2 , un cuadrado de lado 3 ,
 y un rectangulo de lados 4 y 5 , visualizando su área según se crean, y que visualice finalmente el área total
A continuacion creará otros 2 círculos , uno de radio 3 y otro de radio 1 y visualizara el área total de todos los circulos creados */