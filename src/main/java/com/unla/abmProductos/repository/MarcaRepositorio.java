package com.unla.abmProductos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.abmProductos.model.Marca;

public interface MarcaRepositorio extends JpaRepository<Marca, String>{

	public List<Marca> findAll();

	public Optional<Marca> findById(String id);

	public void delete(Marca m);
	
}
