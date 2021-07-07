package com.proyecto.tfg.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.tfg.entities.Funcionalidad;

@Repository
public interface FuncionalidadesRepository extends CrudRepository<Funcionalidad, Long> {
	public List<Funcionalidad> findByNombre(String nombre);
}
 