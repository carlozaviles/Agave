package com.everis.talleragave.controller.transacciones;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.everis.talleragave.bo.transacciones.view.BOTransacciones;

@Controller
public class ControllerTransacciones {
	
	private BOTransacciones transacciones;

	public BOTransacciones getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(BOTransacciones transacciones) {
		this.transacciones = transacciones;
	}
	
	@RequestMapping("menuTransacciones.do")
	public ModelAndView muestraTransacciones(HttpServletRequest request, HttpServletResponse response){
		System.out.println("ControllerTransacciones::muestraTransacciones()");
		return new ModelAndView("SolicitarTrx");
	}
	
	/**
	 * 
	 * 
	 * 
	 * @RequestMapping("consultaTransacciones.do")
	public ModelAndView muestraMenuConsultaPersonas(HttpServletRequest request, HttpServletResponse response){
		this.debug("Se muestra el menu para consulta de Personas.");
		this.info("Se redirige al usuario hacial la pagina: " + PAGINA_SOLICITUD_REPROCESOS);
		return new ModelAndView(PAGINA_SOLICITUD_REPROCESOS);
	}
	 */

}
