package com.patrones.patronesapp.entidades;

import javax.persistence.*; 
import lombok.*;

@Entity
@Table(name = "persona")
@Getter @Setter 
public class Persona extends Entidad {
    public Persona(){}
    String apellido;
}