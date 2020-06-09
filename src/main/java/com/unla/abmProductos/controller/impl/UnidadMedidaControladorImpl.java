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


import com.unla.abmProductos.model.UnidadMedida;
import com.unla.abmProductos.service.UnidadMedidaService;

@RestController
@RequestMapping({ "/unidadMedida" }) 
public class UnidadMedidaControladorImpl {
	
	@Autowired
	UnidadMedidaService service;
	
	@GetMapping
	public List<UnidadMedida> listar() {
		return service.listar();
	}

	@PostMapping
	public UnidadMedida agregar(@RequestBody UnidadMedida um) {
		return service.add(um);
	}
	
	@GetMapping(path = { "/{id}" })
	public UnidadMedida listarId(@PathVariable("id") String id){
		return service.listarId(id);
	}

	@PutMapping(path = { "/{id}" })
	public UnidadMedida editar(@RequestBody UnidadMedida um, @PathVariable("id") String id) {
		um.setIdUnidadMedida(id);
		return service.edit(um);
	}

	@DeleteMapping(path = { "/{id}" })
	public UnidadMedida delete(@PathVariable("id") String id){
		return service.delete(id);
	}

}
