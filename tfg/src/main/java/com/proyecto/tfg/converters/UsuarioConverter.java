package com.proyecto.tfg.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.proyecto.tfg.entities.Usuario;
import com.proyecto.tfg.repositories.UsuarioRepository;

@Component
public class UsuarioConverter implements Converter<String, Usuario>  {

	@Autowired
	UsuarioRepository usuarioRepository;
	@Override
	public Usuario convert(String idString) {
		Integer idInt = Integer.parseInt(idString);
		// Buscamos el cliente con ese id
		try {
			Usuario usuario = usuarioRepository.findById(idInt);
			return usuario;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 
	}
}
