package com.patrones.patronesapp.auth;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "investigador")
public class Investigador {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    public Investigador(){

    }
	@Column(name="soy_investigador")
	private Boolean soyInvestigador;

    public boolean getSoyInvestigador() {
        return this.soyInvestigador;
    } 

    public void setSoyInvestigador(Boolean _soyInvestigador) {
        this.soyInvestigador = _soyInvestigador;
    }
}
