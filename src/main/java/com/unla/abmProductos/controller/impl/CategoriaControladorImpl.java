package com.unla.abmProductos.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unla.abmProductos.model.Categoria;
import com.unla.abmProductos.service.CategoriaService;

@RestController // Anotacion spring framework
@RequestMapping({ "/categoria" }) // Anotacion
public class CategoriaControladorImpl {
	
	@Autowired
	CategoriaService service;
	
	@GetMapping
	public List<Categoria> listar() {
		return service.listar();
	}

	@PostMapping
	public Categoria agregar(@RequestBody Categoria c) {
		return service.add(c);
	}
	
	@GetMapping(path = { "/{id}" })
	public Categoria listarId(@PathVariable("id") String id){
		return service.listarId(id);
	}

	@PutMapping(path = { "/{id}" })
	public Categoria editar(@RequestBody Categoria c, @PathVariable("id") String id) {
		c.setIdCategoria(id);
		return service.edit(c);
	}

	@DeleteMapping(path = { "/{id}" })
	public Categoria delete(@PathVariable("id") String id){
		return service.delete(id);
	}
	
}
