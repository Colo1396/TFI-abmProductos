package com.unla.abmProductos.model;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//spring.jpa.hibernate.ddl-auto=create-drop
@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@Column // (name ="idproducto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproducto;
	@Column // (name ="cod_barra")
	private String cod_barra;
	@Column // (name ="marca")
	private String marca;
	@Column // (name ="descripcion")
	private String descripcion;
	@Column // (name ="magnitud_medida")
	private float magnitud_medida;
	@Column // (name ="unidad_medida")
	private String unidad_medida;
	@Column // (name ="foto")
	private int foto;
	@Column // (name ="precio_ref")
	private float precio_ref;
	@Column // (name ="usuarioModi")
	private String usuarioModi;
	@Column // (name ="fechaModi")
	private GregorianCalendar fechaModi;
	@Column // (name ="idCategoria")
	private String idCategoria;

	public Producto() {
		super();
	}

	public Producto(int idproducto, String cod_barra, String marca, String descripcion, float magnitud_medida,
			String unidad_medida, int foto, float precio_ref, String usuarioModi, GregorianCalendar fechaModi,
			String idCategoria) {
		super();
		this.idproducto = idproducto;
		this.cod_barra = cod_barra;
		this.marca = marca;
		this.descripcion = descripcion;
		this.magnitud_medida = magnitud_medida;
		this.unidad_medida = unidad_medida;
		this.foto = foto;
		this.precio_ref = precio_ref;
		this.usuarioModi = usuarioModi;
		this.fechaModi = fechaModi;
		this.idCategoria = idCategoria;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getCod_barra() {
		return cod_barra;
	}

	public void setCod_barra(String cod_barra) {
		this.cod_barra = cod_barra;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getMagnitud_medida() {
		return magnitud_medida;
	}

	public void setMagnitud_medida(float magnitud_medida) {
		this.magnitud_medida = magnitud_medida;
	}

	public String getUnidad_medida() {
		return unidad_medida;
	}

	public void setUnidad_medida(String unidad_medida) {
		this.unidad_medida = unidad_medida;
	}

	public int getFoto() {
		return foto;
	}

	public void setFoto(int foto) {
		this.foto = foto;
	}

	public float getPrecio_ref() {
		return precio_ref;
	}

	public void setPrecio_ref(float precio_ref) {
		this.precio_ref = precio_ref;
	}

	public String getUsuarioModi() {
		return usuarioModi;
	}

	public void setUsuarioModi(String usuarioModi) {
		this.usuarioModi = usuarioModi;
	}

	public GregorianCalendar getFechaModi() {
		return fechaModi;
	}

	public void setFechaModi(GregorianCalendar fechaModi) {
		this.fechaModi = fechaModi;
	}

	public String getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}

}
