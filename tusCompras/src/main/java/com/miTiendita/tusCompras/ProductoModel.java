package com.miTiendita.tusCompras;

import java.io.Serializable;
import java.util.Date;

public class ProductoModel implements Serializable{
	
	private static final long serialVersionUID = 4545454545454541L;
	private Integer idProducto; 
	private Integer idProvedor;
	private Integer idDepto;
	private Integer idEdoProd; 
	private double prodPrecio; 
	private Integer prodCantidad;  
	
	private String prodNombre; 
	private String prodCaract;
	private Date prodFechaAlta;
	private Date prodFechaBaja;
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getIdProvedor() {
		return idProvedor;
	}
	public void setIdProvedor(Integer idProvedor) {
		this.idProvedor = idProvedor;
	}
	public Integer getIdDepto() {
		return idDepto;
	}
	public void setIdDepto(Integer idDepto) {
		this.idDepto = idDepto;
	}
	public Integer getIdEdoProd() {
		return idEdoProd;
	}
	public void setIdEdoProd(Integer idEdoProd) {
		this.idEdoProd = idEdoProd;
	}
	public double getProdPrecio() {
		return prodPrecio;
	}
	public void setProdPrecio(double prodPrecio) {
		this.prodPrecio = prodPrecio;
	}
	public Integer getProdCantidad() {
		return prodCantidad;
	}
	public void setProdCantidad(Integer prodCantidad) {
		this.prodCantidad = prodCantidad;
	}
	public String getProdNombre() {
		return prodNombre;
	}
	public void setProdNombre(String prodNombre) {
		this.prodNombre = prodNombre;
	}
	public String getProdCaract() {
		return prodCaract;
	}
	public void setProdCaract(String prodCaract) {
		this.prodCaract = prodCaract;
	}
	public Date getProdFechaAlta() {
		return prodFechaAlta;
	}
	public void setProdFechaAlta(Date prodFechaAlta) {
		this.prodFechaAlta = prodFechaAlta;
	}
	public Date getProdFechaBaja() {
		return prodFechaBaja;
	}
	public void setProdFechaBaja(Date prodFechaBaja) {
		this.prodFechaBaja = prodFechaBaja;
	}

	
	
}
