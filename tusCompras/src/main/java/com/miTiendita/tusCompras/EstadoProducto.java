package com.miTiendita.tusCompras;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class EstadoProducto implements Serializable{

	private static final long serialVersionUID = -4146681491856848089L;
	private Integer idEdoProd; 
	private String edoProducto; 
	
	
	@Inject
	private MessageBean messageBean;


	public Integer getIdEdoProd() {
		return idEdoProd;
	}


	public void setIdEdoProd(Integer idEdoProd) {
		this.idEdoProd = idEdoProd;
	}


	public String getEdoProducto() {
		return edoProducto;
	}


	public void setEdoProducto(String edoProducto) {
		this.edoProducto = edoProducto;
	}


	@Override
	public String toString() {
		return "EstadoProducto [idEdoProd=" + idEdoProd + ", edoProducto=" + edoProducto + "]";
	}
	
	public String altaProvedor() {
		
		System.out.println("Estado Producto agregado "+ this);
		
		messageBean.setMensajeRespuesta("Estado Producto  "+ this.edoProducto + " correcta");
		return "index";
	}

}
