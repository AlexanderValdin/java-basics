import java.util.*;

public class Ampolleta {
	
	boolean estado = false;  // apagado o encendido
	int potencia = 50;            // en vatios
	String color = "Blanca" ;           // color de la ampolleta
	float horas = 10f;     // horas que puede estar encendida 
	
	public void Encender() {
		/* si quedan horas enciende la ampolleta, pone la propiedad estado = true y pide por teclado cuánto tiempo estará encendida.
		Resta el tiempo de la propiedad horas.*/
		
		Scanner pregunta = new Scanner(System.in);
		System.out.println("¿ Cuántas horas quieres que esté encendida la ampolleta?");
		float horasEncendida = pregunta.nextFloat();
		
		 if (horasEncendida > horas) {
			 System.out.println("No puede encender la ampolleta porque excede las horas permitidas, intente con menos horas o recargando");
			 estado = false;
		 }
		 else { 
		 	horas = horas - horasEncendida;
		 	System.out.println("Te quedan " + horas + " de funcionamiento.");	 		
		 }
		 if (horas == 0) {
			System.out.println("La ampolleta se ha apagado y debe ser recargada");
			estado = false;
		 }
		
	}
	public void Apagar() {
		// pone la propiedad estado = false
		estado = false;
		System.out.println("La ampolleta se ha apagado.");
	}
	public void VerEstado() {
		// devuelve el estado de la bombilla
		if (estado == true) {
			System.out.println("La ampolleta se encuentra encendida");
		}
		else {
			System.out.println("La ampolleta se encuentra apagada");
		}
				
	}
	public void CambiarPotencia() {
		// se le pasa una potencia por parámetro y la sustituye por lo que hay en la propiedad potencia
		Scanner pregunta = new Scanner(System.in);
		System.out.println("Ingresa la nueva potencia");
		potencia = pregunta.nextInt();
	}
	public void VerPotencia() {
		// devuelve la potencia de la bombilla
		System.out.println("la potencia de la ampolleta es de " + potencia + " vatios.");
		
	}
	public void CambiarColor() {
		// se le pasa el color por parámetro y si la bombilla está encendida la apaga y luego cambia el color.
		Scanner pregunta = new Scanner(System.in);
		System.out.println("Ingresa el color de la ampolleta");
		String respColor = pregunta.nextLine();
		if (estado == true) {
			estado = false;
			color = respColor;
		}
		else {
			color = respColor;
		}
		System.out.println("La ampolleta ahora es color " + color + ".");
	}
	public void VerColor() {
		// imprime por pantalla el color de la bombilla
		System.out.println("La ampolleta es color " + color + ".");
		
	}
	public void Recargar() {
		// pregunta cuántas horas quiere el usuario recargar y las suma a la propiedad horas
		Scanner pregunta = new Scanner(System.in);
		System.out.println("¿Cuántas horas desea recargar?");
		float recarga = pregunta.nextFloat();
		horas =+ recarga;
		System.out.println("Ahora tiene " + horas + " de uso disponible.");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		Ampolleta clase = new Ampolleta();
		while (menu != 9) {
			System.out.println("MENÚ \n(Elija una opción)");
			System.out.println("1. Encender");
			System.out.println("2. Apagar");
			System.out.println("3. Ver Estado");
			System.out.println("4. Cambiar Potencia");
			System.out.println("5. Ver Potencia");
			System.out.println("6. Cambiar Color");
			System.out.println("7. Ver Color");
			System.out.println("8. Recargar");
			System.out.println("9. Salir");
			Scanner respuesta = new Scanner(System.in);
			menu = respuesta.nextInt();
			
			switch (menu) {
			
			case 1:
				clase.Encender();
				break;
			case 2:
				clase.Apagar();
				break;
			case 3:
				clase.VerEstado();
				break;
			case 4:
				clase.CambiarPotencia();
				break;
			case 5:
				clase.VerPotencia();
				break;
			case 6: 
				clase.CambiarColor();
				break;
			case 7:
				clase.VerColor();
				break;
			case 8:
				clase.Recargar();
			default:
				System.out.println("La opción no es válida");
			}
			
			
		}

	}

}
