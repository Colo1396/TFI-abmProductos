package com.unla.abmProductos.service;

import java.util.List;

import com.unla.abmProductos.model.UnidadMedida;


public interface UnidadMedidaService {
	
	public List<UnidadMedida> listar();

	public UnidadMedida listarId(String id);

	public UnidadMedida add(UnidadMedida um);

	public UnidadMedida edit(UnidadMedida um);

	public UnidadMedida delete(String id);

}
