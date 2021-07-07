package com.proyecto.tfg.web.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.proyecto.tfg.entities.Rol;
import com.proyecto.tfg.services.FuncionalidadManager;
import com.proyecto.tfg.services.UsuarioManager;

public class RolController {
protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired 

	FuncionalidadManager funcionalidadesManager;
	@Autowired 
	UsuarioManager usuariosManager;


	@secur
	@RequestMapping(value = "/rol/{rol}")
	public ModelAndView handleRequest(Model model, @PathVariable Rol rol) {
		
		
		//ClientCommand clientCommand = clientManager.clientToClientCommand(client);
		//List<Product> obtenerProductos = client.getProducts();
		
		
		return new ModelAndView("/WEB-INF/views/.jsp");
	}
}


 
