package org.camunda.bpm.example.usertask.embedded.serialized.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Solicitud implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String nombres;
	protected String apellidos;
	protected String solicitud;
	protected boolean aprobado;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

	public boolean getAprobado() {
		return aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

}
