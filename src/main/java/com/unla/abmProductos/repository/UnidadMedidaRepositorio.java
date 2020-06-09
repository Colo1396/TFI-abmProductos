package com.unla.abmProductos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.abmProductos.model.UnidadMedida;


public interface UnidadMedidaRepositorio extends JpaRepository<UnidadMedida, String>{

	public List<UnidadMedida> findAll();

	public Optional<UnidadMedida> findById(String id);

	public void delete(UnidadMedida um);
}
