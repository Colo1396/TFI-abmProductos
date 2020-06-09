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

import com.unla.abmProductos.model.Marca;

import com.unla.abmProductos.service.MarcaService;

@RestController // Anotacion spring framework
@RequestMapping({ "/marca" }) // Anotacion
public class MarcaControladorImpl {
	@Autowired
	MarcaService service;

	@GetMapping
	public List<Marca> listar() {
		return service.listar();
	}

	@PostMapping
	public Marca agregar(@RequestBody Marca m) {
		return service.add(m);
	}
	
	@GetMapping(path = { "/{id}" })
	public Marca listarId(@PathVariable("id") String id){
		return service.listarId(id);
	}

	@PutMapping(path = { "/{id}" })
	public Marca editar(@RequestBody Marca m, @PathVariable("id") String id) {
		m.setIdMarca(id);
		return service.edit(m);
	}

	@DeleteMapping(path = { "/{id}" })
	public Marca delete(@PathVariable("id") String id){
		return service.delete(id);
	}
	
}
