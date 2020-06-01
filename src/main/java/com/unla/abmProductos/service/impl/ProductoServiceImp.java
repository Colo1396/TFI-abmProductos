package com.unla.abmProductos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.abmProductos.model.Producto;
import com.unla.abmProductos.repository.ProductoRepositorio;
import com.unla.abmProductos.service.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService {

	@Autowired
	private ProductoRepositorio repositorio;

	@Override
	public List<Producto> listar() {
		return repositorio.findAll();
	}

	@Override
	public Producto listarId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Producto add(Producto p) {
		return repositorio.save(p);
	}

	@Override
	public Producto edit(Producto p) {
		return repositorio.save(p);
	}

	@Override
	public Producto delete(int id) {
		Producto p = repositorio.findById(id);
		if (p != null) {
			repositorio.delete(p);
		}
		return p;
	}

}
