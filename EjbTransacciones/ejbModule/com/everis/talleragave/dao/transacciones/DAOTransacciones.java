package com.everis.talleragave.dao.transacciones;

import javax.ejb.Local;

import com.everis.talleragave.dto.transacciones.DTOTransaccionesRequest;
import com.everis.talleragave.dto.transacciones.DTOTransaccionesResponse;

@Local
public interface DAOTransacciones {
	
	public DTOTransaccionesResponse ejecutarTransaccion(DTOTransaccionesRequest request);

}
