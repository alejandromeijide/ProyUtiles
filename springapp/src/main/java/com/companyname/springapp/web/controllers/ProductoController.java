package com.companyname.springapp.web.controllers;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.business.command.ClientCommand;
import com.companyname.springapp.business.entities.Client;
import com.companyname.springapp.business.entities.Product;
import com.companyname.springapp.business.services.ClientManager;
import com.companyname.springapp.business.services.ProductManager;
import com.companyname.springapp.web.validators.ClienteValidator;


@Controller
public class ProductoController {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired 
	ProductManager productManager;
	@Autowired 
	ClientManager clientManager;

	@RequestMapping(value = "/productos/{client}")
	public ModelAndView handleRequest(Model model, @PathVariable Client client) {
		logger.info("Returning index view" + client.getId());
		
		ClientCommand clientCommand = clientManager.clientToClientCommand(client);
		List<Product> obtenerProductos = client.getProducts();
		
		model.addAttribute("listaProductos", obtenerProductos);
		model.addAttribute("clientCommand", clientCommand);
		return new ModelAndView("/WEB-INF/views/mostrarproductos.jsp");
	}
}
