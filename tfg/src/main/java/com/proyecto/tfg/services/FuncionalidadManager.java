package com.proyecto.tfg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.proyect.tfg.command.FuncionalidadCommand;
import com.proyecto.tfg.entities.Funcionalidad;
import com.proyecto.tfg.repositories.FuncionalidadesRepository;

@Service
public class FuncionalidadManager {
	
	@Autowired
	private FuncionalidadesRepository funcionalidadesRepository;

	public boolean deleteFuncionalidad(@PathVariable Funcionalidad funcionalidad) {
		try {
			funcionalidadesRepository.delete(funcionalidad);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
 
	public Funcionalidad patchFuncionalidad(@PathVariable FuncionalidadCommand funcionalidadesCommand) {
		Funcionalidad funcionalidad = null;

		// Creacion
		funcionalidad = new Funcionalidad();
		
		funcionalidad.setEstado(null);
		/** TODO: Transformar command a Funcionalidad */
		funcionalidadesRepository.save(funcionalidad);
		return funcionalidad;
	}
	
	public Funcionalidad putFuncionalidad(@PathVariable FuncionalidadCommand funcionalidadesCommand) {
		Funcionalidad funcionalidad = null;
		// Creacion
		funcionalidad = new Funcionalidad();
		
		funcionalidad.setEstado(null);
		/** TODO: Transformar command a Funcionalidad */
		funcionalidadesRepository.save(funcionalidad);
		return funcionalidad;
	}
	
	
	public Iterable<Funcionalidad> obtenerFuncionalidades() {
		return funcionalidadesRepository.findAll();
	}

}
