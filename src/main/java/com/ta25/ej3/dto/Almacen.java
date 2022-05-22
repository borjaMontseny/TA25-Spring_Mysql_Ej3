package com.ta25.ej3.dto;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "almacenes")
public class Almacen {

	// Atributod de la entidad Almacen
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int codigo;

	@Column(name = "lugar")
	private String lugar;

	@Column(name = "capacidad")
	private int capacidad;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Caja> caja;

	// Constructores
	public Almacen() {

	}

	public Almacen(int id, String lugar, int capacidad, List<Caja> caja) {
		this.codigo = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.caja = caja;
	}

	// Getters & Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCaja() {
		return caja;
	}

	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}

	// toString
	@Override
	public String toString() {
		return "Almacen [id=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + ", caja=" + caja + "]";
	}
}
