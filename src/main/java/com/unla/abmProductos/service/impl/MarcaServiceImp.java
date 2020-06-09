package com.unla.abmProductos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.abmProductos.model.Marca;
import com.unla.abmProductos.repository.MarcaRepositorio;
import com.unla.abmProductos.service.MarcaService;

@Service
public class MarcaServiceImp implements MarcaService {
	
	@Autowired
	private MarcaRepositorio repositorio;

	@Override
	public List<Marca> listar() {
		return repositorio.findAll();
	}

	@Override
	public Marca listarId(String id) {
		//return repositorio.findById(id);
		// TODO Auto-generated method stub
					return null;
	}

	@Override
	public Marca add(Marca m) {
		return repositorio.save(m);
	}

	@Override
	public Marca edit(Marca m) {
		return repositorio.save(m);
	}

	@Override
	public Marca delete(String id) {
		/*Marca m = repositorio.findById(id);
		if (m != null) {
			repositorio.delete(m);
		}
		return m;*/
		// TODO Auto-generated method stub
					return null;
	}

	
}
