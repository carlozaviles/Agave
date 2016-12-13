package com.everis.talleragave.dto.transacciones;

import java.io.Serializable;

public class DTOTransaccionesResponse implements Serializable {
	
	String codError;
	String message;
	
	public String getCodError() {
		return codError;
	}
	public void setCodError(String codError) {
		this.codError = codError;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
