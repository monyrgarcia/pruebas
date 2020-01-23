package mx.com.sura.cobranza.comunes.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.sura.cobranza.comunes.dao.ICatalogosDAO;
import mx.com.sura.cobranza.comunes.service.ICatalogosService;

@Service
public class CatalogosServiceImpl implements ICatalogosService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CatalogosServiceImpl.class);

	@Autowired
	private ICatalogosDAO catalogosDAO;

	
	
}
