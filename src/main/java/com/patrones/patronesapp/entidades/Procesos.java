package com.patrones.patronesapp.entidades;

import javax.persistence.Column;
import javax.persistence.Table;

import javax.persistence.Entity;

import javax.persistence.*; 
import lombok.*;

@Entity
@Table(name = "procesos")
@Getter @Setter 
public class Procesos extends Entidad{
    public Procesos(){}

    public enum TipoProceso {
		CORREGIDO, REALIZADO, INICIADO, CANCELADO
	}

	@Enumerated(EnumType.STRING)
	private TipoProceso tipo;

    @Column(name="descripcion")
    private String descripcion;
}
