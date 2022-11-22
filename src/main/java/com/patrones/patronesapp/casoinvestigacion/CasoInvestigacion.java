package com.patrones.patronesapp.casoinvestigacion;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.*; 
import com.patrones.patronesapp.auth.Investigador;

@Entity
@Table(name = "caso_investigacion")
class CasoInvestigacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="descripcion")
	private String descripcion;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "investigador_id", referencedColumnName = "id")
    private Investigador investigador;

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
