package com.patrones.patronesapp.sistema;
import javax.persistence.*; 

import lombok.*;

@Entity
@Table(name = "alarma")
@Getter @Setter 
public class Alarma {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    int dias;
    int horas;
    public Alarma(){

    }
}