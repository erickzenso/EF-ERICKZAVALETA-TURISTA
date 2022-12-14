package com.idat.DTO;

public class TuristaDTO {
	
	private Integer idTurista;
	private String nombreTurista;
	private int nroCelular;
	private String direccion;
	
	public Integer getIdTurista() {
		return idTurista;
	}
	public void setIdTurista(Integer idTurista) {
		this.idTurista = idTurista;
	}
	public String getNombreTurista() {
		return nombreTurista;
	}
	public void setNombreTurista(String nombreTurista) {
		this.nombreTurista = nombreTurista;
	}
	public int getNroCelular() {
		return nroCelular;
	}
	public void setNroCelular(int nroCelular) {
		this.nroCelular = nroCelular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
