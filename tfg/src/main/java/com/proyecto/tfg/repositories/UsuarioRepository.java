package com.proyecto.tfg.repositories;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.tfg.entities.Usuario;
import com.proyecto.tfg.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
public Usuario findById(Integer id);
	
	public Usuario findByCodigo(Integer codigo);
	
	public Usuario findByIdAndCodigo(Integer id, Integer codigo);

}
 