package com.patrones.patronesapp.entidades;
import javax.persistence.*; 
import java.util.List;
import java.util.ArrayList;

import lombok.*;

@Entity
@Table(name = "tipo_irregularidad")
@Getter @Setter 
public class TipoIrregularidad extends Irregularidad {
    @Transient
    List<Irregularidad> subtipos = new ArrayList<Irregularidad>();
    
    public void addSubtipo(Irregularidad i){
        subtipos.add(i);
    }
    public void removeSubtipo(Irregularidad i){
        subtipos.remove(i);
    }
    public TipoIrregularidad(){

    }
}