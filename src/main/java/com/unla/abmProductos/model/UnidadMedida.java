package com.unla.abmProductos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="unidadMedida")

public class UnidadMedida {

	@Id
	@Column (name="idUnidadMedida")
	@GeneratedValue(strategy = GenerationType.AUTO )
	private String idUnidadMedida;
	
	@Column (name="nombre")
	private String nombre;
	


	public UnidadMedida() {
		super();
	}

	public UnidadMedida(String idUnidadMedida, String nombre) {
		super();
		this.idUnidadMedida = idUnidadMedida;
		this.nombre = nombre;
	}

	/*
	@OneToMany( mappedBy="idUnidadMedida")
	private List<UnidadMedida> unidadMedida;

	public UnidadMedida(String idUnidadMedida, String nombre, List<UnidadMedida> unidadMedida) {
		super();
		this.idUnidadMedida = idUnidadMedida;
		this.nombre = nombre;
		this.unidadMedida = unidadMedida;
	}
	
	public List<UnidadMedida> getUnidadMedida() {
		return unidadMedida;
	}


	public void setUnidadMedida(List<UnidadMedida> unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	
	*/
	public String getIdUnidadMedida() {
		return idUnidadMedida;
	}

	public void setIdUnidadMedida(String idUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	
}
