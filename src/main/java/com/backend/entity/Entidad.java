package com.backend.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "request")
public class Entidad implements Serializable {
	
	@Id
	private String id;
	private String nombre;
	private String apellido;
	private String NoDocumento;
	private String correo;
	private String noTelefonico;
	private String fecha;
	private String noRadicado;
	private String tipoSolicitud;
	private String descripcion;
	private String respuestaPQR;
	private String AreaRespuestaPQR;
	private String EstadoPQR;
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getNoDocumento() {
		return NoDocumento;
	}



	public void setNoDocumento(String noDocumento) {
		NoDocumento = noDocumento;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getNoTelefonico() {
		return noTelefonico;
	}



	public void setNoTelefonico(String noTelefonico) {
		this.noTelefonico = noTelefonico;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getNoRadicado() {
		return noRadicado;
	}



	public void setNoRadicado(String noRadicado) {
		this.noRadicado = noRadicado;
	}



	public String getTipoSolicitud() {
		return tipoSolicitud;
	}



	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getRespuestaPQR() {
		return respuestaPQR;
	}



	public void setRespuestaPQR(String respuestaPQR) {
		this.respuestaPQR = respuestaPQR;
	}



	public String getAreaRespuestaPQR() {
		return AreaRespuestaPQR;
	}



	public void setAreaRespuestaPQR(String areaRespuestaPQR) {
		AreaRespuestaPQR = areaRespuestaPQR;
	}



	public String getEstadoPQR() {
		return EstadoPQR;
	}



	public void setEstadoPQR(String estadoPQR) {
		EstadoPQR = estadoPQR;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
}