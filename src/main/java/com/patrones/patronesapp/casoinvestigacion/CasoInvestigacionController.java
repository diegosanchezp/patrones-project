package com.patrones.patronesapp.casoinvestigacion;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/casos")
public class CasoInvestigacionController {
    
	@Autowired
	CasoInvestigacionService casoInvestigacionService;

    @GetMapping
	public List<CasoInvestigacion> getAll() {
		return casoInvestigacionService.getAllCasoInvestigacion();
	}

	/*@RequestMapping(value = "/crear-caso", method = RequestMethod.GET)
	public List<CasoInvestigacion> addOn() {
		JSONObject example = new JSONObject();
		example.put("descripcion", "Hola");
		return casoInvestigacionService.addCasoInvestigacion(example)
	}*/
}
