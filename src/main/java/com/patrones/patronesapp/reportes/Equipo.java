package com.patrones.patronesapp.reportes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.Entity;

import lombok.*;

@Entity
@Table(name = "equipo")
@Getter @Setter
public class Equipo {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    public Equipo(){}

    @Column(name="robado")
    private Boolean robado;

    @Column(name="tipo")
    private String tipo;

    @Column(name="marca")
    private String marca;

    @Column(name="model")
    private String model;

    @Column(name="observaciones")
    private String observaciones;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_id", referencedColumnName = "id")
    private Personal personal;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "archivo_id", referencedColumnName = "id")
    private Archivo archivo;  
}


