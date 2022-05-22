package com.ta25.ej3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta25.ej3.dao.ICajaDAO;
import com.ta25.ej3.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{

	@Autowired
	ICajaDAO iCajaDAO;

	@Override
	public List<Caja> listarCajas() {

		return iCajaDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {

		return iCajaDAO.save(caja);
	}

	@Override
	public Caja cajaXID(int id) {

		return iCajaDAO.findById(id).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {

		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(int id) {
		iCajaDAO.deleteById(id);
	}
}
