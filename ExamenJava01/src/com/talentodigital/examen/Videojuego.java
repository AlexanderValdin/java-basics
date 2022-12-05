package com.talentodigital.examen;

import java.util.Date;

public class Videojuego extends VideoSerie implements Entregable {
	
	private String titulo;
	private int hrEstimadas = 10;
	public boolean entregado = false;
	private String genero;
	private String compa�ia;
	private Date fechaEntrega = new Date();
	private Date fechaDevolucion = new Date();
	
	//constructores
	
	public Videojuego() {
	}
	
	public Videojuego(String titulo, int hrEstimadas) {
		this.titulo = titulo;
		this.hrEstimadas = hrEstimadas;
	}
	
	public Videojuego(String titulo, int hrEstimadas, String genero, String compa�ia) {
		setTitulo(titulo);
		setHrEstimadas(hrEstimadas);
		setGenero(genero);
		setCompa�ia(compa�ia);
		
	}
	
	// getters y setters
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int GetHrEstimadas() {
		return hrEstimadas;
	}
	
	public void setHrEstimadas(int hrEstimadas) {
		this.hrEstimadas = hrEstimadas;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getCompa�ia() {
		return compa�ia;
	}
	
	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	// m�todo verResumen() de la clase abstracta
	
		public void verResumen() {
			System.out.println("el video " + this.getTitulo() + " de la compa��a " + this.getCompa�ia() + " es un juego del g�nero " + this.getGenero() +  " .") ;
	 	}
		
	// m�todos de la interface Entregable
		
		public void entregar() {
			 entregado = true;
			 setFechaEntrega(fechaEntrega);
			 System.out.println("el videojuego se encuentra entregado a las " + this.getFechaEntrega());
			 
		}
		public void devolver() {
			entregado = false;
			setFechaDevolucion(fechaDevolucion);
			System.out.println("el videojuego se ha devuelto a las " + this.getFechaDevolucion());
		}
		public String isEntregado() {
			if (entregado == false) {
				return "El videojuego se encuentra disponible para rentar.";
			}
			else {
				return "El videojuego se encuentra rentado.";
			}
		}

}	
