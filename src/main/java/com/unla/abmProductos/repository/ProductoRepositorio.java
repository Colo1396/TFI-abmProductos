package com.unla.abmProductos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.abmProductos.model.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, String> {

	public List<Producto> findAll();

	public Optional<Producto> findById(String id);

	public void delete(Producto p);

}
