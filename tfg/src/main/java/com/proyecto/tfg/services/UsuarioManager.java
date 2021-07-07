package com.proyecto.tfg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;


import com.proyecto.tfg.entities.Usuario;
//import com.proyecto.tfg.entities.Product;
import com.proyecto.tfg.repositories.UsuarioRepository;
import com.proyect.tfg.command.UsuarioCommand;

public class UsuarioManager {
	@Autowired
	private UsuarioRepository usuariosRepository;

	public UsuarioCommand usuariosToUsuariosCommand(Usuario usuarios) {
		UsuarioCommand usuariosCommand = new UsuarioCommand();
		
		usuarios.setNombre(usuariosCommand.getNombre());
		usuarios.setPassword(usuariosCommand.getPassword());
		usuarios.setEmail(usuariosCommand.getEmail());
		usuarios.setEmpresa(usuariosCommand.getEmpresa());
		usuarios.setId_rol(usuariosCommand.getId_rol());
		usuarios.setVotos_restantes(usuariosCommand.getVotos_restantes());
		usuarios.setIdioma(usuariosCommand.getIdioma());
		usuarios.setCondicion(usuariosCommand.getCondicion());
		usuarios.setEmpresa_id(usuariosCommand.getEmpresa_id()); 
		
		return usuariosCommand;
	}
	
	public Usuario buscarUsuariosById(Integer id) {
//		return usuariosRepository.findById(id);
		return null;
	}

	public Usuario buscarUsuariosByCodigo(Integer codigo) {
//		return usuariosRepository.findByCodigo(codigo);
		return null;
	}

//	@Transactional
	public Usuario guardarClient(UsuarioCommand usuariosCommand) {
		Usuario usuarios = null;
		if(usuariosCommand.getId_usuario() == null) {
			usuarios = new Usuario();
			//int id = obtenerClients().stream().map(Client::getId).max(Integer::compare).get();
			//client.setId(++id);
		}
		else {
			//usuarios = usuariosRepository.findById(usuariosCommand.getId_usuario());
		}
		
		usuarios.setNombre(usuariosCommand.getNombre());
		usuarios.setPassword(usuariosCommand.getPassword());
		usuarios.setEmail(usuariosCommand.getEmail());
		usuarios.setEmpresa(usuariosCommand.getEmpresa());
		usuarios.setId_rol(usuariosCommand.getId_rol());
		usuarios.setVotos_restantes(usuariosCommand.getVotos_restantes());
		usuarios.setIdioma(usuariosCommand.getIdioma());
		usuarios.setCondicion(usuariosCommand.getCondicion());
		usuarios.setEmpresa_id(usuariosCommand.getEmpresa_id());

		
//		usuariosRepository.save(usuarios);
		return usuarios;
	}

	//@Transactional
	public boolean eliminarUsuarios(Usuario usuarios) {
		try {
			//usuariosRepository.delete(usuarios);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<Usuario> obtenerUsuarios() {
		return (List<Usuario>)usuariosRepository.findAll();
		//return null;
	}
	
 	public void asignarVotosRestantes(Usuario usuario, Integer votosRestantes) {
 		usuario.setVotos_restantes(votosRestantes);
 		usuariosRepository.save(usuario);
 	}
 	
 	public void asignarVotosEmitidos(Usuario usuario, Integer votosRestantes) {
 		usuario.setVotos_restantes(votosRestantes);
 		usuariosRepository.save(usuario);
 	}
 	
 	

}


