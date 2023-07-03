package com.minicore.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ventas")

public class venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVenta;
	
	@JoinColumn(name = "id_usuarioFK", referencedColumnName = "idUsuario",insertable=false,updatable=false)
    @ManyToOne
    private usuario usuario;
	
	
	@Column(name = "id_usuarioFK")
	private Integer idusuario;
	
	
	@Column(name = "montos")
	private Float montos;
	

	@Column(name = "descripcion")
	private String descripcion;
	
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "fecha")
	private Date fecha;


	public venta() {
		
	}


	public venta(com.minicore.model.usuario usuario, Integer idusuario, Float montos, String descripcion, Date fecha) {
		super();
		this.usuario = usuario;
		this.idusuario = idusuario;
		this.montos = montos;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}


	public venta(Integer idVenta, com.minicore.model.usuario usuario, Integer idusuario, Float montos,
			String descripcion, Date fecha) {
		super();
		this.idVenta = idVenta;
		this.usuario = usuario;
		this.idusuario = idusuario;
		this.montos = montos;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}


	public Integer getIdVenta() {
		return idVenta;
	}


	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}


	public usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}


	public Integer getIdusuario() {
		return idusuario;
	}


	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}


	public Float getMontos() {
		return montos;
	}


	public void setMontos(Float montos) {
		this.montos = montos;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "venta [idVenta=" + idVenta + ", usuario=" + usuario + ", idusuario=" + idusuario + ", montos=" + montos
				+ ", descripcion=" + descripcion + ", fecha=" + fecha + "]";
	}
	
	
	
	
	
	
	

}
