package com.everis.talleragave.bo.transacciones;

import com.everis.talleragave.bo.transacciones.view.BOTransacciones;
import com.everis.talleragave.dao.transacciones.DAOTransacciones;
import com.everis.talleragave.dto.transacciones.DTOTransaccionesRequest;
import com.everis.talleragave.dto.transacciones.DTOTransaccionesResponse;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Session Bean implementation class BOTransaccionesImpl
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class BOTransaccionesImpl implements BOTransacciones {

	@EJB
	private transient DAOTransacciones transacciones;
	
    /**
     * Default constructor. 
     */
    public BOTransaccionesImpl() {
       
    }

	@Override
	public DTOTransaccionesResponse realizarConsultaPersona(DTOTransaccionesRequest request) {
		System.out.println("BOTransaccionesImpl::realizarConsultaPersona("+request.getNombre()+","+request.getApellido());
		DTOTransaccionesResponse response = transacciones.ejecutarTransaccion(request);
		return response;
	}

}
