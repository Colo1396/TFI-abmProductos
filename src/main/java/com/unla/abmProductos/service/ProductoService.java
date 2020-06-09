package com.unla.abmProductos.service;

import java.util.List;

import com.unla.abmProductos.model.Producto;

public interface ProductoService {

	public List<Producto> listar();

	public Producto listarId(String id);

	public Producto add(Producto p);

	public Producto edit(Producto p);

	public Producto delete(String id);

}
