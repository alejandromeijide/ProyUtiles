package com.proyecto.tfg.web.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.proyecto.tfg.entities.Funcionalidad;
import com.proyecto.tfg.services.FuncionalidadManager;

@Controller
public class FuncionalidadController {

	private final String RESPONSE_OK = "OK";
	private final String RESPONSE_KO = "KO";

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	FuncionalidadManager funcionalidadManager;

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/get-lista-funcionalidades", method = RequestMethod.GET)
	public @ResponseBody Iterable<Funcionalidad> getFuncionalidades() {
		logger.info("getFuncionalidades");
		return funcionalidadManager.obtenerFuncionalidades();
	}

	@RequestMapping(value = "/delete-lista-funcionalidades/{funcionalidad}", method = RequestMethod.DELETE)
	public @ResponseBody String deleteFuncionalidad(@PathVariable Funcionalidad funcionalidad) {
		logger.info("deleteFuncionalidad" + funcionalidad.getId());
		return funcionalidadManager.deleteFuncionalidad(funcionalidad) ? RESPONSE_OK : RESPONSE_KO;
	}

	// Creacion
	@RequestMapping(value = "/put-lista-funcionalidades/{funcionalidad}", method = RequestMethod.PUT)
	public @ResponseBody String putFuncionalidad(@PathVariable Funcionalidad funcionalidad) {
		logger.info("getFuncionalidades" + funcionalidad.getId());
		try {
			// validar
			funcionalidadManager.putFuncionalidad(null);
		} catch (Exception e) {
			return RESPONSE_KO;
		}
		return RESPONSE_OK;
	}

	// Edicion
	@RequestMapping(value = "/patch-lista-funcionalidades/{funcionalidad}", method = RequestMethod.PATCH)
	public @ResponseBody String patchFuncionalidad(@PathVariable Funcionalidad funcionalidad) {
		logger.info("getFuncionalidades" + funcionalidad.getId());
		try {
			// validar
			funcionalidadManager.patchFuncionalidad(null);
		} catch (Exception e) {
			return RESPONSE_KO;
		}
		return RESPONSE_OK; 
	}

}