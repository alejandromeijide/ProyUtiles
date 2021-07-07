package com.proyecto.tfg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Voto {
 
	@Id
	@GeneratedValue(generator = "serial")
	@SequenceGenerator(name = "serial", sequenceName = "serial", allocationSize = 1)
	private Integer id;
	@Autowired
	private Usuario usuario;
	@Autowired
	private Funcionalidad funcionalidad;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public Usuario getUsuario() {
//		return usuario;
//	}
//
//	public void setUsuario(Usuario usuario) {
//		this.usuario = usuario;
//	}<
//
//	public Funcionalidad getFuncionalidad() {
//		return funcionalidad;
//	}
//
//	public void setFuncionalidad(Funcionalidad funcionalidad) {
//		this.funcionalidad = funcionalidad;
//	}

	public Voto() {
		super();
	}

	public void setFuncionalidad(Funcionalidad funcionalidad) {
		
		this.funcionalidad=funcionalidad;
		
	}

	public void setUsuario(Usuario usuario) {
		
	 this.usuario=usuario;
	}

}
