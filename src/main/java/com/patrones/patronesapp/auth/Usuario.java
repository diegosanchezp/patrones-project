package com.patrones.patronesapp.auth;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import lombok.*;

@Entity
@Table(name = "usuario")
@Getter @Setter 
public class Usuario {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    public Usuario(){}

	@Column(name="nombre")
	private String nombre;

    @Column(name="contrasena")
	private String contrasena;

    @Column(name="email")
	private String email;
}
