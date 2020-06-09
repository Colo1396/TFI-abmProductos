package com.unla.abmProductos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.abmProductos.model.Categoria;

import com.unla.abmProductos.repository.CategoriaRepositorio;
import com.unla.abmProductos.service.CategoriaService;

@Service
public class CategoriaServiceImp implements CategoriaService{

	@Autowired
	private CategoriaRepositorio repositorio;
	
	@Override
	public List<Categoria> listar() {
		return repositorio.findAll();
	}


	 @Override
	
	public Categoria listarId(String id) {
		//return repositorio.findById(id);
			// TODO Auto-generated method stub
			return null;
	}
 
	@Override
	public Categoria add(Categoria c) {
		return repositorio.save(c);
	}

	@Override
	public Categoria edit(Categoria c) {
		return repositorio.save(c);
	}
	
	@Override
	public Categoria delete(String id) {
		/*
	 	Categoria c = repositorio.findById(id);
		if (c != null) {
			repositorio.delete(c);
		}
		return c;
		 */		// TODO Auto-generated method stub
		return null;
	}
 


	
}
