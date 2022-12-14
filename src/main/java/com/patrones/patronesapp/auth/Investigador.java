package com.patrones.patronesapp.auth;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import lombok.*;

@Entity
@Table(name = "investigador")
@Getter @Setter
public class Investigador extends Usuario {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    public Investigador(){

    }
	@Column(name="soy_investigador")
	private Boolean soyInvestigador;
}
