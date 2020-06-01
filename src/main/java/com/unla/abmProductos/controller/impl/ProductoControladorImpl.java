package com.unla.abmProductos.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.unla.abmProductos.controller.ProductoControlador;
import com.unla.abmProductos.model.Producto;
import com.unla.abmProductos.service.ProductoService;

public class ProductoControladorImpl implements ProductoControlador {

	@Autowired
	ProductoService service;

	public List<Producto> listar() {
		return service.listar();
	}

	public Producto agregar(Producto p) {
		return service.add(p);
	}

	public Producto listarId(int id) {
		return service.listarId(id);
	}

	public Producto editar(Producto p, int id) {
		p.setIdproducto(id);
		return service.edit(p);
	}

	public Producto delete(int id) {
		return service.delete(id);
	}
}
