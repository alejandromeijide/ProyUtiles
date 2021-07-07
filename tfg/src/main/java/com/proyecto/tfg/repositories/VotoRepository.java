package com.proyecto.tfg.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.tfg.entities.Voto;

public interface VotoRepository extends CrudRepository<Voto, Long> {
	
	public List<Voto> findById(Integer id);
	
	public List<Voto> findByFuncionalidadId(Integer funcionalidadId);
	
	public List<Voto> findUsuarioId(Integer usuarioId);
	
	public Long countByFuncionalidadId(Integer funcionalidadId);
	
	public Long countUsuarioId(Integer usuarioId);
}
 