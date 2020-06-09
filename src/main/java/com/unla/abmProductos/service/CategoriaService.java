package com.unla.abmProductos.service;

import java.util.List;

import com.unla.abmProductos.model.Categoria;

public interface CategoriaService {

	public List<Categoria> listar();

	public Categoria listarId(String id);

	public Categoria add(Categoria c);

	public Categoria edit(Categoria c);

	public Categoria delete(String id);
}
