package com.patrones.patronesapp.casoinvestigacion;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "caso_investigacion")
class CasoInvestigacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="descripcion")
	private String descripcion;

	//@Column(name="status")
	//private Integer status;

	public CasoInvestigacion(){
	}
	public String getDescripcion(){
		return this.descripcion;
	}
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
}
