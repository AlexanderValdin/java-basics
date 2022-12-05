package com.talentodigital.examen;

import java.util.*;

public class Serie extends VideoSerie {
	
	private String titulo;
	private int numTemporadas = 3;
	public boolean entregado = false;
	private String genero;
	private String creador;
	private Date fechaEntrega = new Date();
	private Date fechaDevolucion = new Date();
	
	// falta variables de fecha
	
	// constructores
	public Serie() {
		
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie (String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
		
	}
	
	// getters and setters
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getNumTemporadas() {
		return numTemporadas;
	}
	
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}
	
	public String getCreador() {
		return creador;
	}
	
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
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
		System.out.println("la serie " + this.getTitulo() + " de su creador " + this.getCreador() + " es una serie que cuenta con " + this.getNumTemporadas() +  " temporadas.") ;
 	}
	
	// métodos de la interface Entregable
	
	public void entregar() {
		 entregado = true;
		 setFechaEntrega(fechaEntrega);
		 
	}
	public void devolver() {
		entregado = false;
		setFechaDevolucion(fechaDevolucion);
	}
	public String isEntregado() {
		if (entregado == false) {
			return "La serie se encuentra disponible para rentar.";
		}
		else {
			return "La serie se encuentra rentado.";
		}
	}

}
