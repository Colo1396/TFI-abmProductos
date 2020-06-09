package com.unla.abmProductos.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	

	@Id
	@Column (name ="idCategoria")
	@GeneratedValue(strategy = GenerationType.AUTO )
	private String idCategoria;
	
	@Column (name ="nombre")
	private String nombre;
	


	public Categoria() {
		super();
	}

	public Categoria(String idCategoria, String nombre) {
		super();
		this.idCategoria = idCategoria;
		this.nombre = nombre;
	}

	/*
	@OneToOne(mappedBy="idCategoria")
	private Producto producto;
	
	public Categoria(String idCategoria, String nombre, Producto producto) {
		super();
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.producto = producto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	*/
	
	
	public String getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
