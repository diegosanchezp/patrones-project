package com.patrones.patronesapp.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.patrones.patronesapp.auth.Investigador;

import javax.persistence.Entity;

import javax.persistence.MappedSuperclass;

import lombok.*;

/*@Entity
@Table(name = "entidad")
@Getter @Setter 
public class Entidad {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    public Entidad(){}

    @Column(name="nombre")
    private String nombre;
}*/

@MappedSuperclass
public class Entidad {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "investigador_id", referencedColumnName = "id")
    private Investigador investigador;

    @Column(name="nombre")
    private String nombre;
}