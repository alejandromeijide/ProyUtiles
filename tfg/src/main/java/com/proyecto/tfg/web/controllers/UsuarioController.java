package com.proyecto.tfg.web.controllers;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.proyect.tfg.command.UsuarioCommand;
import com.proyecto.tfg.entities.Usuario;
import com.proyecto.tfg.services.UsuarioManager;

public class UsuarioController {
protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired 
	UsuarioManager usuariosManager;

	@RequestMapping(value = "/usuarios")
	public UsuarioCommand handleRequest(Model model, @PathVariable Usuario usuarios) {
		
		
		UsuarioCommand usuariosCommand = null;//usuariosManager.usuriosToClientCommand(usuarios);
		
		model.addAttribute("clientCommand", usuariosCommand);
		return usuariosCommand;
	}

	/*public UsuarioCommand handleRequest(String string) {
		// TODO Auto-generated method stub
		

		UsuarioCommand usuariosCommand = null;//usuariosManager.usuriosToClientCommand(usuarios);
		
		model.addAttribute("clientCommand", usuariosCommand);
		return usuariosCommand;
		
		return null;
	}*/
	
	/*@RequestMapping(value = "/login")
	public @ResponseBody String postEliminarClient(String nombre, String password) {
		
		List<Usuario> usuarios = usuariosManager.obtenerUsuarios();
		model.addAttribute("listaUsuarios", usuarios);
		if (nombre! null && password!=null) {
			  for (Usuario usuario : usuarios) {
				  
				  if (usuario.getNombre()== nombre && usuario.getPassword()==password) {
					  
				  
			  }else {
				  
				  logger.info("Datos no encontrados, el usuario no existe");
				  return new ModelAndView("paginalogin.jsp");
			  }
			
		}
		
		
	}
	}*/
} 

	
	





