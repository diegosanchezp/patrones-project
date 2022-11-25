package com.patrones.patronesapp.reportes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.patrones.patronesapp.entidades.Empresa;

import javax.persistence.Entity;

import lombok.*;

@Entity
@Table(name = "personal")
@Getter @Setter
public class Personal {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    public Personal(){

    }

    @Column(name="amonestado")
    private Boolean amonestado;

    @Column(name="ci")
    private Integer ci;

    @Column(name="nombre")
    private String nombre;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empresa_id", referencedColumnName = "id")
    private Empresa empresa;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "archivo_id", referencedColumnName = "id")
    private Archivo archivo;        
}

