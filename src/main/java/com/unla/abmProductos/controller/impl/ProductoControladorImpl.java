package com.unla.abmProductos.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unla.abmProductos.model.Producto;
import com.unla.abmProductos.service.ProductoService;

@Controller
//http://localhost:8083/productos
@RestController // Anotacion spring framework
@RequestMapping({ "/productos" }) // Anotacion

public class ProductoControladorImpl {

	@Autowired
	ProductoService service;

	@GetMapping
	public List<Producto> listar() {
		return service.listar();
	}

	@PostMapping
	public Producto agregar(@RequestBody Producto p) {
		return service.add(p);
	}
	
	@GetMapping(path = { "/{id}" })
	public Producto listarId(@PathVariable("id") String id){
		return service.listarId(id);
	}

	@PutMapping(path = { "/{id}" })
	public Producto editar(@RequestBody Producto p, @PathVariable("id") String id) {
		p.setIdProducto(id);
		return service.edit(p);
	}

	@DeleteMapping(path = { "/{id}" })
	public Producto delete(@PathVariable("id") String id){
		return service.delete(id);
	}
}
