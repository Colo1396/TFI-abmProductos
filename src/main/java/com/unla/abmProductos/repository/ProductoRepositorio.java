package com.unla.abmProductos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.abmProductos.model.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {

	public List<Producto> findAll();

	public Producto findById(int id);

	public void delete(Producto p);

}
