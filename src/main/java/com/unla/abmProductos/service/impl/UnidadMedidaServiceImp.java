package com.unla.abmProductos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.abmProductos.model.UnidadMedida;
import com.unla.abmProductos.repository.UnidadMedidaRepositorio;
import com.unla.abmProductos.service.UnidadMedidaService;

@Service
public class UnidadMedidaServiceImp implements UnidadMedidaService{

	@Autowired
	private UnidadMedidaRepositorio	repositorio;
	
	@Override
	public List<UnidadMedida> listar() {
		return repositorio.findAll();
	}

	@Override
	public UnidadMedida listarId(String id) {
		//return repositorio.findById(id);
		// TODO Auto-generated method stub
					return null;
	}

	@Override
	public UnidadMedida add(UnidadMedida um) {
		return repositorio.save(um);
	}

	@Override
	public UnidadMedida edit(UnidadMedida um) {
		return repositorio.save(um);
	}

	@Override
	public UnidadMedida delete(String id) {
		/*UnidadMedida um = repositorio.findById(id);
		if (um != null) {
			repositorio.delete(um);
		}
		return um;*/
		// TODO Auto-generated method stub
					return null;
	}

	
}
