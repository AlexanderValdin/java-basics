package com.talentodigital.examen;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Serie> series = new ArrayList(5);
		ArrayList<Videojuego> juegos = new ArrayList(5);
		
		int menu = 0;
		int menuseries = 0;
		int menuvideoj = 0;
		int menucreacionseries = 0;
		int menucreacionvideoj = 0;
		
		while (menu != 3 ) {
			System.out.println("MENÚ \n(Elija una opción)");
			System.out.println("1.crear serie sin atributos");
			System.out.println("2.crear serie con titulo y creador");
			System.out.println("3. crear serie con titulo,");
			Scanner respuesta = new Scanner(System.in);
			menu = respuesta.nextInt();
			
			switch (menu) {
			
			case 1:
				while (menuseries != 4) {
					System.out.println("Menú Series, elija una opción");
					System.out.println("1. Crear serie");
					System.out.println("2. Entregar serie");
					System.out.println("3. Devolver serie");
					System.out.println("4. Salir");
					Scanner respseries = new Scanner(System.in);
					menuseries = respseries.nextInt();
					
					switch (menuseries) {
					
					case 1:
						while (menucreacionseries !=4) {
						System.out.println("Elija los tipos de creaciones");
						System.out.println("1. Crear sin atributos.");
						System.out.println("2. Crear con título y creador");
						System.out.println("3. Crear con título, número de temporadas, género y creador");
						System.out.println("4. Salir");
						Scanner respseries1 = new Scanner(System.in);
						menucreacionseries = respseries1.nextInt();
						
						switch (menucreacionseries) {
						
						case 1:
							Serie serie = new Serie();
							series.add(serie);
							break;
						case 2:
							System.out.println("Ingrese el título de la serie");
							Scanner sctitulo = new Scanner(System.in);
							System.out.println("Ingrese el creador de la serie");
							Scanner sccreador = new Scanner(System.in);
							Serie serie0 = new Serie(sctitulo.nextLine(), sccreador.nextLine());
							series.add(serie0);
							
							break;
						case 3:
							System.out.println("Ingrese el titulo de la serie");
							Scanner sctitulo1 = new Scanner(System.in);
							System.out.println("Ingrese el número de temporadas");
							Scanner sctemporadas = new Scanner(System.in);
							System.out.println("Ingrese el género de la serie");
							Scanner scgenero = new Scanner(System.in);
							System.out.println("Ingrese el creador de la serie");
							Scanner sccreador1 = new Scanner(System.in);
							
							Serie serie1 = new Serie(sctitulo1.nextLine(), sctemporadas.nextInt() , scgenero.nextLine(), sccreador1.nextLine());
							series.add(serie1);
							break;
						default:
							System.out.println("La opción no es válida.");
					
						}
					}
				break;
					
			case 2:
					while (menuvideoj != 4) {
						System.out.println("Menú Videojuegos, elija una opción");
						System.out.println("1. Crear videojuego");
						System.out.println("2. Entregar videojuego");
						System.out.println("3. Devolver videojuego");
						System.out.println("4. Salir");
						Scanner respvideoj = new Scanner(System.in);
						menuvideoj = respvideoj.nextInt();
						
						switch (menuvideoj) {
						
						case 1:
							while (menucreacionvideoj !=4) {
							System.out.println("Elija los tipos de creaciones");
							System.out.println("1. Crear sin atributos.");
							System.out.println("2. Crear con título y horas estimadas");
							System.out.println("3. Crear con título, horas estimadas, género y compañía");
							System.out.println("4. Salir");
							Scanner respseries1 = new Scanner(System.in);
							menucreacionseries = respseries1.nextInt();
							
							switch (menucreacionseries) {
							
							case 1:
								Videojuego juego = new Videojuego();
								juegos.add(juego);
								break;
							case 2:
								System.out.println("Ingrese el título del videojuego");
								Scanner sctitulo = new Scanner(System.in);
								System.out.println("Ingrese el número de horas estimadas");
								Scanner schoras = new Scanner(System.in);
								Videojuego juego0 = new Videojuego(sctitulo.nextLine(), schoras.nextInt());
								juegos.add(juego0);
								
								break;
							case 3:
								System.out.println("Ingrese el titulo de la serie");
								Scanner sctitulo1 = new Scanner(System.in);
								System.out.println("Ingrese el número de horas estimadas");
								Scanner schoras1 = new Scanner(System.in);
								System.out.println("Ingrese el género del videojuego");
								Scanner scgenero = new Scanner(System.in);
								System.out.println("Ingrese el nombre de la compañia del videojuego");
								Scanner sccompañia = new Scanner(System.in);
								
								Videojuego juego1 = new Videojuego(sctitulo1.nextLine(), schoras1.nextInt() , scgenero.nextLine(), sccompañia.nextLine());
								juegos.add(juego1);
								break;
							default:
								System.out.println("La opción no es válida.");
						
							}
						}
					break;
					
					default:
						System.out.println("la opción no es válida.");
			}
	}
}
				}
			}
		}
	}
}
