package com.patrones.patronesapp.casoinvestigacion;

import org.springframework.data.repository.CrudRepository;

interface CasoInvestigacionRepository<P> extends CrudRepository<CasoInvestigacion, Long> {
	//List<CasoInvestigacion> findBy
}