package com.ta25.ej3.service;

import java.util.List;

import com.ta25.ej3.dto.Caja;

public interface ICajaService {

	// Metodos del CRUD
	public List<Caja> listarCajas(); // Listar All

	public Caja guardarCaja(Caja caja); // Guarda un caja CREATE

	public Caja cajaXID(int id); // Leer datos de un caja READ

	public Caja actualizarCaja(Caja caja); // Actualiza datos del caja UPDATE

	public void eliminarCaja(int id);// Elimina el caja DELETE

}
