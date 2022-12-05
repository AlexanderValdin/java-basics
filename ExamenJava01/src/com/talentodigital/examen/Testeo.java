package com.talentodigital.examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Testeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Serie> series = new ArrayList(5);
		ArrayList<Videojuego> juegos = new ArrayList(5);
		
		int menu = 0;
		int menuseries = 0;
		int menuvideoj = 0;
		int menucreacionseries = 0;
		int menucreacionvideoj = 0;
		
		while (menu !=9) {
			System.out.println("MENÚ \n(Elija una opción)");
			System.out.println("1.crear serie sin atributos");
			System.out.println("2. crear serie con titulo y creador");
			System.out.println("3. crear serie con todos sus atributos");
			System.out.println("4. crear videojuego sin atributos");
			System.out.println("5. crear videojuego con titulo y horas estimadas");
			System.out.println("6. crear videojuego con todos sus atributos");
			System.out.println("7. entregar");
			System.out.println("8. devolver");
			System.out.println("9. salir");
			
			Scanner respuesta = new Scanner(System.in);
			menu = respuesta.nextInt();
			
			switch (menu) {
			
			case 1:
				Serie serie = new Serie();
				series.add(serie);
				break;
				
			case 2:
				System.out.println("Ingrese el título de la serie");
				Scanner scTitSer = new Scanner(System.in);
				System.out.println("Ingrese el creador de la serie");
				Scanner scCrea = new Scanner(System.in);
				Serie serie0 = new Serie(scTitSer.nextLine(), scCrea.nextLine());
				series.add(serie0);
				break;
				
			case 3:
				System.out.println("Ingrese el titulo de la serie");
				Scanner scTitSer1 = new Scanner(System.in);
				System.out.println("Ingrese el número de temporadas");
				Scanner scTemporadas = new Scanner(System.in);
				System.out.println("Ingrese el género de la serie");
				Scanner scGenero = new Scanner(System.in);
				System.out.println("Ingrese el creador de la serie");
				Scanner scCrea1 = new Scanner(System.in);
				
				Serie serie1 = new Serie(scTitSer1.nextLine(), scTemporadas.nextInt() , scGenero.nextLine(), scCrea1.nextLine());
				series.add(serie1);
				break;
			case 4:
				
				Videojuego juego = new Videojuego();
				juegos.add(juego);
				break;
				
			case 5:
				System.out.println("Ingrese el título del videojuego");
				Scanner scTitVj = new Scanner(System.in);
				System.out.println("Ingrese el número de horas estimadas");
				Scanner scHoras = new Scanner(System.in);
				Videojuego juego0 = new Videojuego(scTitVj.nextLine(), scHoras.nextInt());
				juegos.add(juego0);
				
				break;
				
			case 6: 
				System.out.println("Ingrese el titulo de la serie");
				Scanner scTitVj1 = new Scanner(System.in);
				System.out.println("Ingrese el número de horas estimadas");
				Scanner scHoras1 = new Scanner(System.in);
				System.out.println("Ingrese el género del videojuego");
				Scanner scGeneroVj = new Scanner(System.in);
				System.out.println("Ingrese el nombre de la compañia del videojuego");
				Scanner scCompañia = new Scanner(System.in);
				
				Videojuego juego1 = new Videojuego(scTitVj1.nextLine(), scHoras1.nextInt() , scGeneroVj.nextLine(), scCompañia.nextLine());
				juegos.add(juego1);
				break;
			case 7:
				//entregar serie o videojuego
				break;
			
			case 8:
				//devolver serie o vj
				break;
				
			default:
				System.out.println("La opción no es válida");
			}
		}
	}
}
