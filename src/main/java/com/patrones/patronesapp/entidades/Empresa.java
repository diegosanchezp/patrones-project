package com.patrones.patronesapp.entidades;

import javax.persistence.Column;
import javax.persistence.Table;

import javax.persistence.Entity;

import lombok.*;

@Entity
@Table(name = "empresa")
@Getter @Setter 
public class Empresa extends Entidad {
    public Empresa(){}

    @Column(name="rif")
    private String rif;
}

