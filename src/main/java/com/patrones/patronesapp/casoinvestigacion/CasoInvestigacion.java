package com.patrones.patronesapp.casoinvestigacion;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import java.util.Date;

import javax.persistence.*; 
import com.patrones.patronesapp.auth.Investigador;

import lombok.*;

@Entity
@Table(name = "caso_investigacion")
@Getter @Setter
class CasoInvestigacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "investigador_id", referencedColumnName = "id")
    private Investigador investigador;
	public enum CasoStatus {
		ABIERTO, CERRADO, SEGUIMIENTO, REABIERTO
	}

	@Enumerated(EnumType.STRING)
	public CasoStatus status;

	@Temporal(TemporalType.DATE)
	Date fechaInicio;

	String actividades;
	String actuaciones;

	@Column(name="monto_expuesto")
	Float montoExpuesto;

	String objetivo;
	String observaciones;
	@Column(name="descripcion")
	private String descripcion;

	@Column(name="movil_afectado")
	String movilAfectado;

	@Column(name="modus_operandi")
	String modusOperandi;

	String procedencia;
	String soporte;

	@Column(name="tipo_de_caso")
	String TipoDeCaso;

	Integer duracion; 

	String conclusiones;

	@Column(name="area_apoyo")
	String areaDeApoyo; 
	public CasoInvestigacion(){
	}
	public String getDescripcion(){
		return this.descripcion;
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public Investigador getInvestigador(){
		return this.investigador;
	}

	public void setInvestigador(Investigador investigador){
		this.investigador = investigador;
	}
}
