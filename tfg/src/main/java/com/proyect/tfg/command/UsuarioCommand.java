package com.proyect.tfg.command;
 
import java.util.List;

import com.proyecto.tfg.entities.Usuario;

//import javax.persistence.Entity;

public class UsuarioCommand {
	
	private Integer id_usuario;
	private String nombre;
	private String password;
	private String email;
	private String empresa;
	private Integer id_rol;
	private Integer votos_restantes;
	private String idioma;
	private Boolean condicion;
	private Integer empresa_id;
	//@OneToMany(mappedBy="client", fetch=FetchType.EAGER)
	private List<Usuario> usuarioslista;
	public UsuarioCommand() {
	}
	
	public UsuarioCommand(Integer id_usuario, String nombre, String password, String email, String empresa , Integer id_rol, Integer votos_restantes ,String idioma) {
		this.id_usuario= id_usuario;
		this.nombre= nombre;
		this.password = password;
		this.email = email;
		this.empresa =empresa;
		this.id_rol =id_rol;
		this.votos_restantes= votos_restantes;
		this.idioma=idioma;
	}
		
	public Integer getId_usuario() {
		return id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public Integer getId_rol() {
		return id_rol;
	}

	public Integer getVotos_restantes() {
		return votos_restantes;
	}

	public String getIdioma() {
		return idioma;
	}

	public Boolean getCondicion() {
		return condicion;
	}

	public Integer getEmpresa_id() {
		return empresa_id;
	}

	public List<Usuario> getUsuarioslista() {
		return usuarioslista;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}

	public void setVotos_restantes(Integer votos_restantes) {
		this.votos_restantes = votos_restantes;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void setCondicion(Boolean condicion) {
		this.condicion = condicion;
	}

	public void setEmpresa_id(Integer empresa_id) {
		this.empresa_id = empresa_id;
	}

	public void setUsuarioslista(List<Usuario> usuarioslista) {
		this.usuarioslista = usuarioslista;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (obj instanceof UsuarioCommand) {
			UsuarioCommand c = (UsuarioCommand) obj;
			if (c.getId_usuario() == null)
				return false;

			return this.getId_usuario().equals(c.getId_usuario());
		} else {
			return false;
		}
	}

	
}