package com.cidades.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cidades.Service.CidadesService;

@RestController
@RequestMapping
public class CidadesController {
	
	private final CidadesService cidadeService;
	
	public CidadesController(CidadesService cidadesService) {
		this.cidadeService = cidadeService;
	}

}


