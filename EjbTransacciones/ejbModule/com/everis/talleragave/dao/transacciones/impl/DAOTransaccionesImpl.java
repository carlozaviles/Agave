package com.everis.talleragave.dao.transacciones.impl;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.everis.talleragave.dao.transacciones.DAOTransacciones;
import com.everis.talleragave.dto.transacciones.DTOTransaccionesRequest;
import com.everis.talleragave.dto.transacciones.DTOTransaccionesResponse;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class DAOTransaccionesImpl implements DAOTransacciones {

	@Override
	public DTOTransaccionesResponse ejecutarTransaccion(DTOTransaccionesRequest request) {
		
		System.out.println("DAOTransaccionesImpl::DAOTransaccionesImpl("+request.getNombre()+","+request.getApellido());
		DTOTransaccionesResponse response = new DTOTransaccionesResponse();
		
		if (request.getNombre().equals("Gustavo")){
			response.setCodError("OK");
			response.setMessage("Excelente");
		}else{
			response.setCodError("NOK");
			response.setMessage("Mal");
		}
		//ida
		return response;
	}

}
