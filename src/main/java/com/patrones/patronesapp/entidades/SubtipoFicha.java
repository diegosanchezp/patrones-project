package com.patrones.patronesapp.entidades;

import javax.persistence.Column;
import javax.persistence.Table;

import javax.persistence.Entity;
 
import lombok.*;

@Entity
@Table(name = "subtipo_ficha")
@Getter @Setter 
public class SubtipoFicha extends Entidad{
    public SubtipoFicha(){}

    @Column(name="tipo")
    private String tipo;
}
