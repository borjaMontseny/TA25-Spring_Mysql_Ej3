package com.ta25.ej3.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cajas")
public class Caja {

	// Atributos de la entidad Caja
	@Id
	private String numreferencia;
	
	private String contenido;
	
	private int valor;

	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacen almacen;

	// Constructores
	public Caja() {

	}

	public Caja(String numreferencia, String contenido, int valor, Almacen almacen) {
		this.numreferencia = numreferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	// Getters & Setters
	public String getNumreferencia() {
		return numreferencia;
	}

	public void setNumreferencia(String numferencia) {
		this.numreferencia = numferencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [id=" + numreferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen + "]";
	}

}
