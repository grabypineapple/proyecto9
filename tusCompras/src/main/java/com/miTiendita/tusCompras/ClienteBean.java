package com.miTiendita.tusCompras;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ClienteBean implements Serializable{
	private static final long serialVersionUID = -4146681491856848089L;
	
	@Inject
	private MessageBean messageBean;
	
	private double idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String direccionCliente;
	private String ciudadCliente;
	private String cpCliente;
	private String telefonoCliente;
	private String fechaAltaCliente;
	private String emailCliente;	
	private String passw;
	
	
	public double getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(double idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	public String getCiudadCliente() {
		return ciudadCliente;
	}
	public void setCiudadCliente(String ciudadCliente) {
		this.ciudadCliente = ciudadCliente;
	}
	public String getCpCliente() {
		return cpCliente;
	}
	public void setCpCliente(String cpCliente) {
		this.cpCliente = cpCliente;
	}
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	public String getFechaAltaCliente() {
		return fechaAltaCliente;
	}
	public void setFechaAltaCliente(String fechaAltaCliente) {
		this.fechaAltaCliente = fechaAltaCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}
	@Override
	public String toString() {
		return "ClienteBean [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
				+ apellidoCliente + ", direccionCliente=" + direccionCliente + ", ciudadCliente=" + ciudadCliente
				+ ", cpCliente=" + cpCliente + ", telefonoCliente=" + telefonoCliente + ", fechaAltaCliente="
				+ fechaAltaCliente + ", emailCliente=" + emailCliente + ", passw=" + passw + "]";
	}
	
	public String altaCliente() {
		System.out.println("Alta Cliete "+ this);
		
		
		messageBean.setMensajeRespuesta("Alta cliente "+ this.nombreCliente + "correcta");
		return "index";
	}
	
}
