package com.everis.talleragave.dto.transacciones;

import java.io.Serializable;

public class DTOTransaccionesRequest implements Serializable {
	
	String nombre;
	String apellido;
	
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

}
