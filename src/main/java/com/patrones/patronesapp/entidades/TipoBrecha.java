package com.patrones.patronesapp.entidades;

import javax.persistence.Column;
import javax.persistence.Table;

import javax.persistence.Entity;

import lombok.*;

@Entity
@Table(name = "tipo_brecha")
@Getter @Setter 
public class TipoBrecha extends Entidad{
    public TipoBrecha(){}

    @Column(name="tipo")
    private String tipo;
}
