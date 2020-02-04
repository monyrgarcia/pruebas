package mx.com.sura.cobranza.comunes.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.sura.cobranza.comunes.dto.CatalogoDTO;
import mx.com.sura.cobranza.comunes.service.ICatalogosService;


@RestController
//@RequestMapping("/api/test/catalogosgrales")
public class CatalogosController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CatalogosController.class);
	
	@Autowired
	private ICatalogosService catalogosService;
	
	@RequestMapping(path = "test", method = RequestMethod.GET)
	public CatalogoDTO test() {
		CatalogoDTO response = new CatalogoDTO();
		response.setDescripcion("Test REST");
		response.setId("1");
		return response;
	}
	

}
