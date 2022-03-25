package com.miTiendita.tusCompras;

import java.io.Serializable;
import java.util.Date;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class DepartamentoBean implements Serializable{

	private static final long serialVersionUID = -4146681491856848089L;
	private Integer idDepto;
	private String depNombre;
	private Boolean depEstatus; 
	private Date depFechaBaja; 
	private Date depFechaAlta;
	
	
	@Inject
	private MessageBean messageBean;


	public Integer getIdDepto() {
		return idDepto;
	}


	public void setIdDepto(Integer idDepto) {
		this.idDepto = idDepto;
	}


	public String getDepNombre() {
		return depNombre;
	}


	public void setDepNombre(String depNombre) {
		this.depNombre = depNombre;
	}


	public Boolean getDepEstatus() {
		return depEstatus;
	}


	public void setDepEstatus(Boolean depEstatus) {
		this.depEstatus = depEstatus;
	}


	public Date getDepFechaBaja() {
		return depFechaBaja;
	}


	public void setDepFechaBaja(Date depFechaBaja) {
		this.depFechaBaja = depFechaBaja;
	}


	public Date getDepFechaAlta() {
		return depFechaAlta;
	}


	public void setDepFechaAlta(Date depFechaAlta) {
		this.depFechaAlta = depFechaAlta;
	}
	
	
	
	@Override
	public String toString() {
		return "DepartamentoBean [idDepto=" + idDepto + ", depNombre=" + depNombre + ", depEstatus=" + depEstatus
				+ ", depFechaBaja=" + depFechaBaja + ", depFechaAlta=" + depFechaAlta + "]";
	}


	public String altaDepartamento() {
		
		System.out.println("Departamento Alta "+ this);
		
		messageBean.setMensajeRespuesta("Departamento Alta "+ this.depNombre + " correcta");
		return "index";
	}
	
	
}
