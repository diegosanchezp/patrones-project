package com.patrones.patronesapp.entidades;

import javax.persistence.Column;
import javax.persistence.Table;

import javax.persistence.Entity;

import lombok.*;

@Entity
@Table(name = "procedencia")
@Getter @Setter 
public class ProcedenciaCasos extends Entidad{
    public ProcedenciaCasos(){}

    @Column(name="procedencia")
    private String prodencia;
}
