package com.miTiendita.tusCompras;

import java.io.Serializable;
import java.util.Date;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ProvedorBean  implements Serializable{

	private static final long serialVersionUID = -4146681491856848089L;
	
	
	private Integer idProvedor;
	private String provNombre;
	private Date provFechaAlta;
	private Date provFechaBaja ;
	private Boolean provEstatus;
	
	@Inject
	private MessageBean messageBean;

	public Integer getIdProvedor() {
		return idProvedor;
	}

	public void setIdProvedor(Integer idProvedor) {
		this.idProvedor = idProvedor;
	}

	public String getProvNombre() {
		return provNombre;
	}

	public void setProvNombre(String provNombre) {
		this.provNombre = provNombre;
	}

	public Date getProvFechaAlta() {
		return provFechaAlta;
	}

	public void setProvFechaAlta(Date provFechaAlta) {
		this.provFechaAlta = provFechaAlta;
	}

	public Date getProvFechaBaja() {
		return provFechaBaja;
	}

	public void setProvFechaBaja(Date provFechaBaja) {
		this.provFechaBaja = provFechaBaja;
	}

	public Boolean getProvEstatus() {
		return provEstatus;
	}

	public void setProvEstatus(Boolean provEstatus) {
		this.provEstatus = provEstatus;
	}

	public MessageBean getMessageBean() {
		return messageBean;
	}

	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProvedorBean [idProvedor=" + idProvedor + ", provNombre=" + provNombre + ", provFechaAlta="
				+ provFechaAlta + ", provFechaBaja=" + provFechaBaja + ", provEstatus=" + provEstatus + ", messageBean="
				+ messageBean + "]";
	}
	
	
	public String altaProvedor() {
		
		System.out.println("Provedor agregado "+ this);
		
		messageBean.setMensajeRespuesta("Alta provedor "+ this.provNombre + " correcta");
		return "index";
	}
}
