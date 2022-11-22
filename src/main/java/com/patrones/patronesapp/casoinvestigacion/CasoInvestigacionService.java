package com.patrones.patronesapp.casoinvestigacion;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.patrones.patronesapp.auth.Investigador;

@Service
public class CasoInvestigacionService {
	@Autowired
	CasoInvestigacionRepository<CasoInvestigacion> casoInvestigacionRepository;

	@Transactional
	public List<CasoInvestigacion> getAllCasoInvestigacion() {
		return (List<CasoInvestigacion>) this.casoInvestigacionRepository.findAll();
	}
	@Transactional
	public Investigador getInvestigador(Long id) {
		return this.casoInvestigacionRepository.findById(id).get().getInvestigador(); 
	}

	/*@Transactional
	public List<CasoInvestigacion> findByDescripcion(String descripcion) {
		return this.casoInvestigacionRepository.findByDescripcion(descripcion);
	}*/
	@Transactional
	public Optional<CasoInvestigacion> getById(Long id) {
		return this.casoInvestigacionRepository.findById(id);
	}
	
}