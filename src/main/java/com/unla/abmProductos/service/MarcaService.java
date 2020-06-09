package com.unla.abmProductos.service;

import java.util.List;

import com.unla.abmProductos.model.Marca;

public interface MarcaService {
	
	public List<Marca> listar();

	public Marca listarId(String id);

	public Marca add(Marca m);

	public Marca edit(Marca m);

	public Marca delete(String id);

}
