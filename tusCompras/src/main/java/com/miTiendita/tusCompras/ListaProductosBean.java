package com.miTiendita.tusCompras;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ListaProductosBean implements Serializable{
	private static final long serialVersionUID = -414668149185684000L;
	
	private List<ProductoModel> productos;

	public ListaProductosBean() {
		
		this.productos = new ArrayList<ProductoModel>();
	}

	public List<ProductoModel> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoModel> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "ListaProductosBean [productos=" + productos + "]";
	}
	
	public void agregar(ProductoModel productos) {
		this.productos.add(productos);
		
	}
	
	
	
}
