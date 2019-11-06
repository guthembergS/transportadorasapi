package com.transportadorasapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transportadorasapi.model.Transportadora;
import com.transportadorasapi.service.TransportadoraService;

@RestController
public class TransportadoraController {

	@Qualifier("TransportadoraServiceImpl")
	@Autowired(required = true)
	public TransportadoraService transportadoraService;
	
	
	@GetMapping("/api/transportadora")
	public ResponseEntity<List<Transportadora>> listTransportadora(){
		List<Transportadora> list = transportadoraService.listTransportadora();
		return ResponseEntity.ok().body(list);
	}
}
