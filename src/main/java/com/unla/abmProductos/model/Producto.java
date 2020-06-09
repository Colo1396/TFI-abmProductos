package com.unla.abmProductos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@Column (name ="idProducto")
	@GeneratedValue(strategy = GenerationType.AUTO )
	private String idProducto;
	
	@Column (name ="codBarra")
	private String codBarra;
	
	@Column (name ="descripcion")
	private String descripcion;
		
	@Column (name ="foto", nullable=true)
	private int foto;
	
	@Column (name ="precio")
	private float precio;
	
	@Column (name ="usuarioModi")
	private String usuarioModi;
	
	@Column (name ="fechaModi")
	private Date fechaModi;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria idCategoria ;
	
	@ManyToOne
	@JoinColumn(name="id_marca")
	private Marca idMarca;
	
	@ManyToOne
	@JoinColumn(name="id_unidad_medida")
	private UnidadMedida idUnidadMedida;
	

	public Producto() {
		super();
	}


	public Producto(String idProducto, String codBarra, String descripcion, int foto, float precio, String usuarioModi,
			Date fechaModi, Categoria idCategoria, Marca idMarca, UnidadMedida idUnidadMedida) {
		super();
		this.idProducto = idProducto;
		this.codBarra = codBarra;
		this.descripcion = descripcion;
		this.foto = foto;
		this.precio = precio;
		this.usuarioModi = usuarioModi;
		this.fechaModi = fechaModi;
		this.idCategoria = idCategoria;
		this.idMarca = idMarca;
		this.idUnidadMedida = idUnidadMedida;
	}


	public String getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}


	public String getCodBarra() {
		return codBarra;
	}


	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getFoto() {
		return foto;
	}


	public void setFoto(int foto) {
		this.foto = foto;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public String getUsuarioModi() {
		return usuarioModi;
	}


	public void setUsuarioModi(String usuarioModi) {
		this.usuarioModi = usuarioModi;
	}


	public Date getFechaModi() {
		return fechaModi;
	}


	public void setFechaModi(Date fechaModi) {
		this.fechaModi = fechaModi;
	}


	public Categoria getIdCategoria() {
		return idCategoria;
	}


	public void setIdCategoria(Categoria idCategoria) {
		this.idCategoria = idCategoria;
	}


	public Marca getIdMarca() {
		return idMarca;
	}


	public void setIdMarca(Marca idMarca) {
		this.idMarca = idMarca;
	}


	public UnidadMedida getIdUnidadMedida() {
		return idUnidadMedida;
	}


	public void setIdUnidadMedida(UnidadMedida idUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
	}




	
	

}
