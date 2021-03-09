package com.companyname.springapp.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.business.command.ClientCommand;
import com.companyname.springapp.business.entities.Client;
import com.companyname.springapp.business.repositories.ProductRepository;
import com.companyname.springapp.business.services.ClientManager;
import com.companyname.springapp.web.validators.ClienteValidator;


@Controller
public class ClientController {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired 
	ClientManager clientManager;
	@Autowired 
	ClienteValidator clienteValidator;
	@Autowired 
	ProductRepository productRepository;

	/**
	 * 
	 * LISTADO
	 * 
	 * @param param1
	 * @return
	 */
	@RequestMapping(value = "/clientes")
	public ModelAndView handleRequest(Model model) {
		logger.info("Returning index view");
		List<Client> obtenerClientes = clientManager.obtenerClients();
		model.addAttribute("listaClientes", obtenerClientes);
		model.addAttribute("listaProductos", productRepository.findAll());
		return new ModelAndView("/WEB-INF/views/index.jsp");
	}

	/**
	 * TEST
	 * 
	 * @param param1
	 * @return
	 */
	@RequestMapping(value = "/hello3.htm")
	public ModelAndView hello3(@RequestParam(value = "param1", required = false) String param1) {
		logger.info("hello3" + param1);
		return new ModelAndView("hello.jsp");
	}

	/**
	 * 
	 * ELIMINAR, solicitar pantalla
	 * 
	 * @param model
	 * @param client
	 * @return
	 */
	@RequestMapping(value = "/eliminar-cliente/{client}", method = RequestMethod.POST)
	public @ResponseBody String postEliminarClient(Model model, @PathVariable Client client) {
		logger.info("postEliminarClient" + client.getId());

		//No hace falta buscar el cliente, lo ha buscado el converter
		clientManager.eliminarClient(client);

		List<Client> obtenerClients = clientManager.obtenerClients();
		model.addAttribute("listaClientes", obtenerClients);

		return "OK";
	}
	

	/**
	 * EDITAR, solicitar pantalla
	 * 
	 * @param model
	 * @param client
	 * @return
	 */
	@RequestMapping(value = "/editar-cliente", method = RequestMethod.GET)
	public ModelAndView getEditarClient(Model model, @RequestParam(value = "id", required = false)  Client client) {
		logger.info("getCrearClient" + client.getId());

		ClientCommand clientCommand = clientManager.clientToClientCommand(client);
		model.addAttribute("clientCommand", clientCommand);

		return new ModelAndView("/WEB-INF/views/crearcliente.jsp");
	}
	
	
	/**
	 * CREAR
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/crear-cliente", method = RequestMethod.GET)
	public ModelAndView getCrearClient(Model model) {
		logger.info("getCrearClient");

		model.addAttribute("clientCommand", new ClientCommand());

		return new ModelAndView("/WEB-INF/views/crearcliente.jsp");
	}

	/**
	 * CREAR/EDITAR GUARDAR CAMBIOS
	 * 
	 * @param clientCommand
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/crear-cliente", method = RequestMethod.POST)
	public ModelAndView submit(@Valid @ModelAttribute("clientCommand") ClientCommand clientCommand, BindingResult result,
			ModelMap model) {
		logger.info("submit");
		clienteValidator.validate(clientCommand, result);

	
		if (result.hasErrors()) {

			model.addAttribute("clientCommand", clientCommand);

			return new ModelAndView("/WEB-INF/views/crearcliente.jsp");
		}

		clientManager.guardarClient(clientCommand);

		List<Client> obtenerClients = clientManager.obtenerClients();
		model.addAttribute("listaClientes", obtenerClients);
		return new ModelAndView("/WEB-INF/views/index.jsp");

	}

}




