package com.miTiendita.tusCompras;

import java.io.Serializable;
import java.util.Date;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;


@Named
@SessionScoped
public class ProductoBean implements Serializable{

	private static final long serialVersionUID = -4146681491856848089L;
	
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
	
	@Inject
	private MessageBean messageBean;
	
	@Inject
	private ListaProductosBean listaProductosBean;

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

	@Override
	public String toString() {
		return "ProductoBean [idProducto=" + idProducto + ", idProvedor=" + idProvedor + ", idDepto=" + idDepto
				+ ", idEdoProd=" + idEdoProd + ", prodPrecio=" + prodPrecio + ", prodCantidad=" + prodCantidad
				+ ", prodNombre=" + prodNombre + ", prodCaract=" + prodCaract + ", prodFechaAlta=" + prodFechaAlta
				+ ", prodFechaBaja=" + prodFechaBaja + "]";
	}
	
	public String altaProducto() {
		
		System.out.println("Producto agregado "+ this);
		
		ProductoModel productoModel = new ProductoModel();
		productoModel.setProdNombre(prodNombre);
		productoModel.setIdDepto(idDepto);
		productoModel.setIdEdoProd(idEdoProd);
		productoModel.setIdProvedor(idProvedor);
		productoModel.setProdCantidad(prodCantidad);
		productoModel.setProdCaract(prodCaract);
		productoModel.setProdFechaAlta(prodFechaAlta);
		productoModel.setProdFechaBaja(prodFechaBaja);
		productoModel.setProdPrecio(prodPrecio);;
		
		listaProductosBean.agregar(productoModel);
		System.out.println(listaProductosBean.getProductos().size());
		
		messageBean.setMensajeRespuesta("producto registrado correctamente ");
		return "index";
	} 
	
	
}
