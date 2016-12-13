package com.everis.talleragave.bo.transacciones.view;

import javax.ejb.Remote;

import com.everis.talleragave.dto.transacciones.DTOTransaccionesRequest;
import com.everis.talleragave.dto.transacciones.DTOTransaccionesResponse;

@Remote
public interface BOTransacciones{

	public DTOTransaccionesResponse realizarConsultaPersona(DTOTransaccionesRequest request);
}
