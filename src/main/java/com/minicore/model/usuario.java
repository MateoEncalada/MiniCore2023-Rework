package com.minicore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")

public class usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idUsuario;
	private String nombre;
	
	public usuario() {
		
	}

	public usuario(String nombre) {
		
		this.nombre = nombre;
	}

	public usuario(Integer idUsuario, String nombre) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + "]";
	}
	
	
	
	

}
