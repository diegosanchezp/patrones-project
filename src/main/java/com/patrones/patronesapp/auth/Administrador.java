package com.patrones.patronesapp.auth;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import lombok.*;

@Entity
@Table(name = "administrador")
@Getter @Setter
public class Administrador extends Usuario{
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    public Administrador(){}
    
	@Column(name="soy_administrador")
	private Boolean soyAdministrador;
}
