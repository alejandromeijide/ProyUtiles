package com.proyecto.tfg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity 
public class Rol {

	@Id
	@GeneratedValue(generator = "serial")
	@SequenceGenerator(name = "serial", sequenceName = "serial", allocationSize = 1)
	private String nombre;
	private String descripcion;
	private String usuario_alta;
	private Boolean condicion;

	public Rol() {
	}

	public Rol(String nombre, String descripcion, String usuario_alta, Boolean condicion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.usuario_alta = usuario_alta;
		this.condicion = condicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUsuario_alta() {
		return usuario_alta;
	}

	public void setUsuario_alta(String usuario_alta) {
		this.usuario_alta = usuario_alta;
	}

	public Boolean getCondicion() {
		return condicion;
	}

	public void setCondicion(Boolean condicion) {
		this.condicion = condicion;
	}
}