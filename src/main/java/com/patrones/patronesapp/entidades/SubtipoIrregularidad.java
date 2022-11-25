package com.patrones.patronesapp.entidades;
import javax.persistence.*; 

import lombok.*;

@Entity
@Table(name = "subtipo_irregularidad")
@Getter @Setter 
public class SubtipoIrregularidad extends Irregularidad {
    public SubtipoIrregularidad(){
        
    }
}