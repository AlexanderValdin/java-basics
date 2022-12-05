package com.talentodigital.examen;

import java.util.Date;

public class Videojuego extends VideoSerie implements Entregable {
	
	private String titulo;
	private int hrEstimadas = 10;
	public boolean entregado = false;
	private String genero;
	private String compañia;
	private Date fechaEntrega = new Date();
	private Date fechaDevolucion = new Date();
	
	//constructores
	
	public Videojuego() {
	}
	
	public Videojuego(String titulo, int hrEstimadas) {
		this.titulo = titulo;
		this.hrEstimadas = hrEstimadas;
	}
	
	public Videojuego(String titulo, int hrEstimadas, String genero, String compañia) {
		setTitulo(titulo);
		setHrEstimadas(hrEstimadas);
		setGenero(genero);
		setCompañia(compañia);
		
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
	
	public String getCompañia() {
		return compañia;
	}
	
	public void setCompañia(String compañia) {
		this.compañia = compañia;
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
	// método verResumen() de la clase abstracta
	
		public void verResumen() {
			System.out.println("el video " + this.getTitulo() + " de la compañía " + this.getCompañia() + " es un juego del género " + this.getGenero() +  " .") ;
	 	}
		
	// métodos de la interface Entregable
		
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
