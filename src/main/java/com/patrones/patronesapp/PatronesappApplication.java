package com.patrones.patronesapp;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMethod;
// Security
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.core.annotation.Order;

@Entity
@Table(name = "caso_investigacion")
class CasoInvestigacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="descripcion")
	private String descripcion;

	//@Column(name="status")
	//private Integer status;

	public CasoInvestigacion(){
	}
	public String getDescripcion(){
		return this.descripcion;
	}
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	
}

interface CasoInvestigacionRepository<P> extends CrudRepository<CasoInvestigacion, Long> {
	//List<CasoInvestigacion> findBy
}

@Service
class CasoInvestigacionService {
	@Autowired
	CasoInvestigacionRepository<CasoInvestigacion> casoInvestigacionRepository;

	@Transactional
	public List<CasoInvestigacion> getAllCasoInvestigacion() {
		return (List<CasoInvestigacion>) this.casoInvestigacionRepository.findAll();
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


@RestController
@SpringBootApplication
public class PatronesappApplication {

	@Autowired
	CasoInvestigacionService casoInvestigacionService;

	@RequestMapping(value = "/casos", method = RequestMethod.GET)
	public List<CasoInvestigacion> getAll() {
		return casoInvestigacionService.getAllCasoInvestigacion();
	}

	/*@RequestMapping(value = "/crear-caso", method = RequestMethod.GET)
	public List<CasoInvestigacion> addOn() {
		JSONObject example = new JSONObject();
		example.put("descripcion", "Hola");
		return casoInvestigacionService.addCasoInvestigacion(example)
	}*/

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@Configuration
  	//@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
  	protected static class SecurityConfiguration extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exception {
		http
			.httpBasic()
		.and()
			.authorizeRequests()
			.antMatchers("/casos", "/").permitAll()
			.anyRequest().authenticated();
		}
  	}

	public static void main(String[] args) {
		SpringApplication.run(PatronesappApplication.class, args);
	}

}
