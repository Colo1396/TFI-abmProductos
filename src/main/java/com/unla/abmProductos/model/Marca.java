package com.unla.abmProductos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca {
	

	@Id
	@Column (name ="idMarca")
	@GeneratedValue(strategy = GenerationType.AUTO )
	private String idMarca;
	
	@Column (name ="nombre")
	private String nombre;
	
	
	public Marca() {
		super();
	}
	
	public Marca(String idMarca, String nombre) {
		super();
		this.idMarca = idMarca;
		this.nombre = nombre;
	}

	/*
	@OneToMany( mappedBy="idMarca")
	private List<Marca> marca;

	public Marca(String idMarca, String nombre, List<Marca> marca) {
		super();
		this.idMarca = idMarca;
		this.nombre = nombre;
		this.marca = marca;
	}
	
	public List<Marca> getMarca() {
		return marca;
	}

	public void setMarca(List<Marca> marca) {
		this.marca = marca;
	}
	*/

	public String getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(String idMarca) {
		this.idMarca = idMarca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	
	
}
