package com.proyecto.tfg.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.proyecto.tfg.entities.Funcionalidad;
import com.proyecto.tfg.entities.Voto;
import com.proyecto.tfg.services.FuncionalidadManager;
import com.proyecto.tfg.services.UsuarioManager;
import com.proyecto.tfg.services.VotoManager;

//import com.companyname.springapp.business.command.ClientCommand;
//import com.companyname.springapp.business.entities.Client;
//import com.companyname.springapp.business.entities.Product;
//import com.companyname.springapp.business.services.ClientManager;
//import com.companyname.springapp.business.services.ProductManager;

public class VotoController {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired 

	FuncionalidadManager funcionalidadesManager;
	@Autowired 
	UsuarioManager usuariosManager;
	
	@Autowired 
	VotoManager votoManager;
	
	
 

	@RequestMapping(value = "/votar")
	public ModelAndView handleRequest(Model model, @PathVariable Funcionalidad client) {
		
		
		
	
		//ClientCommand clientCommand = clientManager.clientToClientCommand(client);
		//List<Product> obtenerProductos = client.getProducts();
		
		
		return new ModelAndView("/WEB-INF/views/mostrarproductos.jsp");
	}
	
	@RequestMapping(value = "/get-lista-votos", method = RequestMethod.GET)
	public @ResponseBody Iterable<Voto> getVotos() {
		logger.info("getVotos");
		return votoManager.obtenerVotos();
	}

	
}


