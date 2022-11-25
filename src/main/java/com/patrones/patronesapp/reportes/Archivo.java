package com.patrones.patronesapp.reportes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;

import lombok.*;

@Entity
@Table(name = "archivo")
@Getter @Setter 
public class Archivo {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    public Archivo(){}

    @Column(name="negado")
    private Boolean negado;
}
