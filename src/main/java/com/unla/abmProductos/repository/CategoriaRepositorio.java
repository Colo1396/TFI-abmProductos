package com.unla.abmProductos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.abmProductos.model.Categoria;

public interface CategoriaRepositorio  extends JpaRepository<Categoria, String>{

	public List<Categoria> findAll();

	public Optional<Categoria> findById(String id);

	public void delete(Categoria c);
}
