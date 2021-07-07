package com.proyecto.tfg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity 
public class Funcionalidad {

	@Id
	@GeneratedValue(generator="serial")
	@SequenceGenerator(name="serial",sequenceName="serial",allocationSize=1)
	private Long id;
	private String nombre;
	private String password;
	private String fecha;
	private String usuario_alta;
	private String portal;
	private String modulo;
	private Integer tiempo_desarrollo;
	private String estado;

	public Funcionalidad() {
		// Super tiene que estar en la primera linea del constructor, este llama al
		// constructor con la signatura de la clase de la que hereda
		super();
	}

	public Funcionalidad(Long id, String nombre, String password, String fecha, String usuario_alta,
			String portal, String modulo, Integer tiempo_desarrollo, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.fecha = fecha;
		this.usuario_alta = usuario_alta;
		this.portal = portal;
		this.modulo = modulo;
		this.tiempo_desarrollo = tiempo_desarrollo;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getUsuario_alta() {
		return usuario_alta;
	}

	public void setUsuario_alta(String usuario_alta) {
		this.usuario_alta = usuario_alta;
	}

	public String getPortal() {
		return portal;
	}

	public void setPortal(String portal) {
		this.portal = portal;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public Integer getTiempo_desarrollo() {
		return tiempo_desarrollo;
	}

	public void setTiempo_desarrollo(Integer tiempo_desarrollo) {
		this.tiempo_desarrollo = tiempo_desarrollo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
